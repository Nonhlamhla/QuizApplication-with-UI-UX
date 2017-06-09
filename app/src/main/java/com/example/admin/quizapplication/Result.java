package com.example.admin.quizapplication;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Result extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);




        Button tryagain = (Button) findViewById(R.id.tryagain);

        tryagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);

            }
        });

        TextView scorelabe = (TextView)findViewById(R.id.scorelabel);
        scorelabe.setText(MainActivity.score+ "%");

        MainActivity.score=0;
    }
}
