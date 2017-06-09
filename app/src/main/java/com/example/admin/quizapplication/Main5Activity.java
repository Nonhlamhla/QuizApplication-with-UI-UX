package com.example.admin.quizapplication;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class Main5Activity extends AppCompatActivity {

    private QuestionLibrary3 mQuestionLibrary3 = new QuestionLibrary3();



    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private Button mButtonlevel4, btnQuitL4;


    private String mAnswer;
    private int mScore = 10;
    private int mQuestionNumber = 0;

    //TIMER
    private TextView timer;
    private CountDownTimer countdowntimer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        mQuestionView = (TextView) findViewById(R.id.questions);
        mButtonChoice1 = (Button) findViewById(R.id.choice1);
        mButtonChoice2 = (Button) findViewById(R.id.choice2);
        mButtonChoice3 = (Button) findViewById(R.id.choice3);
        mButtonlevel4 = (Button) findViewById(R.id.level4);

        btnQuitL4 = (Button) findViewById(R.id.btnQuitL4);

        btnQuitL4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                quitTimer();
            }
        });

        //Timer
        timer = (TextView) findViewById(R.id.timer);
        countdowntimer = new CountDownTimer(30000, 10) {


            public void onTick(long millisUntilFinished) {
                timer.setText("" + String.format("%d:%d",
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished),
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished),
                        TimeUnit.MINUTES.toSeconds(TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));

            }

            public void onFinish() {
                timer.setText("Done!");

                Intent intent = new Intent(getApplicationContext(), Result.class);
                startActivity(intent);
            }

        }.start();


        updateQuestion();

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mButtonChoice1.getText() == mAnswer) {
                    mScore = mScore + 10;
                    updateScore(mScore);
                    updateQuestion();


                    //TAKES SCORE BACK TO ZERO
                    MainActivity.score = MainActivity.score + 10;


                } else {
                    updateQuestion();
                }
            }
        });
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 10;
                    updateScore(mScore);
                    updateQuestion();


                    //TAKES SCORE BACK TO ZERO
                    MainActivity.score = MainActivity.score + 10;


                } else {
                    updateQuestion();
                }
            }
        });
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if (mButtonChoice3.getText() == mAnswer) {
                    mScore = mScore + 10;
                    updateScore(mScore);
                    updateQuestion();


                    //TAKES SCORE BACK TO ZERO
                    MainActivity.score = MainActivity.score + 10;


                } else {
                    updateQuestion();
                }
            }
        });
    }

    private void quitTimer() {

        countdowntimer.cancel();
        startActivity(new Intent(getApplicationContext(), MainActivity.class));

    }
    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary3.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary3.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary3.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary3.getChoice3(mQuestionNumber));

        mAnswer = mQuestionLibrary3.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;

        // WHEN QUESTION NUMBER GETS TO 10 DISPLAY RESULT ACTIVITY
        if(mQuestionNumber ==10) {
            Intent i = new Intent(this, Result.class);
            startActivity(i);
        }
    }

    private void updateScore (int point){

    }
}

