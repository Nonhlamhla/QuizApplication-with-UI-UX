package com.example.admin.quizapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {


    //TOOLBAR VARIABLE
    Toolbar toolbar;


    public static int score = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //INITIALIZATION OF TOOL BAR VARIABLE
        toolbar = (Toolbar) findViewById(R.id.toolbar);

        //ATTACH TOOLBAR AS AN ACTION BAR
        setSupportActionBar(toolbar);

        //INITIALIZATION OF BUTTONS
        Button level1 = (Button) findViewById(R.id.level1);
        Button level2 = (Button) findViewById(R.id.level2);
        Button level3 = (Button) findViewById(R.id.level3);
        Button level4 = (Button) findViewById(R.id.level4);




        level1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);

            }
        });
        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
                startActivity(intent);

            }
        });
        level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
                startActivity(intent);

            }
        });
        level4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Main5Activity.class);
                startActivity(intent);
            }
        });


    }
}