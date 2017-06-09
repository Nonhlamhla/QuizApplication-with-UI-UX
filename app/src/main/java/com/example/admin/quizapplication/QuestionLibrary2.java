package com.example.admin.quizapplication;

import android.content.Intent;

public class QuestionLibrary2 {

    Intent intent = new Intent("android.intent.action.MAIN");

    private String mQuestion []={
            "No sooner spoken than broken. What is it?",
            "A certain crime is punishable if attempted but not punishable if committed. What is it?",
            "You use a knife to slice my head and weep beside me when I am dead. What am I?",
            "I went into the woods and got it. I sat down to seek it. I brought it home with me because I couldn't find it. What is it?",
            "I never was, am always to be, No one ever saw me, nor ever will, And yet I am the confidence of all. To live and breathe on this terrestrial ball and sometimes horrid. What am I?",
            "What belongs to you but others use it more than you do? ",
            "What is it that no one wants, but no one wants to lose? ",
            "What kind of dog keeps the best time? ",
            "Without it, I’m dead. If I’m not, then then I’m behind. What am I? ",
            "I have hands that wave you, though I never say goodbye. It's cool for you to be with me, especially when I say HI. What am I? ",

    };

    private String mChoices [] []={
            {" Silence", "a secret", " a vase"},
            {"Murder", "Suicide","Theft"},
            {"An onion", "a monster", "an animal"},
            {"money", "a tree", "Splinter"},
            {"test day", " sunday", "tomorrow"},
            {"Your name ", "Phone ", "XBox ",},
            {"Challenge ", "Dispute ", "A lawsuit ", },
            {"Pit BulL ", "Watchdog ", "Jermaine Shepard ",},
            {"Heart ", "Ahead A head ", "Life ",},
            {"A Friend ", "Bird ", "A fan ", },
    };

    private String mAnswers []={"Silence", "Suicide", "An onion", "Splinter", "tomorrow", "Your name ", "A lawsuit ", "Watchdog ", "Ahead A head ", "A fan "};


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
