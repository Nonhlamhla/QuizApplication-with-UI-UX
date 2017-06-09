package com.example.admin.quizapplication;

import android.content.Intent;

public class QuestionLibrary3 {

    Intent intent = new Intent("android.intent.action.MAIN");

    private String mQuestion []={
            "I'm light as a feather, yet the strongest man can't hold me for much more than a minute. What am I? ",
            "Pronounced as one letter, And written with three, Two letters there are, And two only in me.I'm double, I'm single, I'm black, blue, and gray, I'm read from both ends, And the same either way.What am I? ",
            "From the beginning of eternity. To the end of time and space. To the beginning of every end. And the end of every place.At the beginning of every era.And at the end of every page. What am I? ",
            " I am lighter than air but a million men cannot lift me up, What am I? ",
            "You will always find me in the past. I can be created in the present, But the future can never taint me. What am I? ",
            " I run in and out of town all day and night and yet I never get tired? What am I?",
            "What always goes to bed with its shoes on? ",
            "A boy fell off a 100 foot ladder. But he did not get hurt. Why not? ",
            "What is big and yellow and comes in the morning, to brighten mom's day? ",
            "The more there is the less you see ",

    };

    private String mChoices [] []={
            {"breath ", "1000lb ", " sun light "},
            {"  a book", "an eye ","an apple "},
            {"the letter \"e\" ", "fate ", " god"},
            {"feather ", "wind ", "Bubble "},
            {"History ", "future ", "present "},
            {"Valley ", "Mountain", "A road ",},
            {"Chicken ", "A horse ", "Pig ", },
            {"He was only on the first step ", "He landed on his feet ", "He wasn't on the ladder ", },
            {" The Sun", " School Bus", "Orange Juice", },
            {"Money ", "Happiness ", "Darkness ", },
    };

    private String mAnswers []={"breath ", "an eye ", "the letter \"e\" ", "Bubble ", " History", "A road ", "A horse ", " He was only on the first step", "School Bus ", "Darkness "};


    public String getQuestion(int a){
        String question = mQuestion[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3 (int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer (int a) {
        String answer = mAnswers[a];
        return answer;
    }
}



