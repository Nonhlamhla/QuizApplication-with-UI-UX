package com.example.admin.quizapplication;


import android.content.Intent;


public class QuestionLibrary1 {

    Intent intent = new Intent("android.intent.action.MAIN");

    private String mQuestion []={
            "The man who invented it doesn't want it. The man who bought it doesn't need it. The man who needs it doesn't know it. What is it?",
            "I have holes in my top and bottom, my left and right, and in the middle. But I still hold water. What am I?",
            "I run over fields and woods all day. Under the bed at night I sit not alone. My tongue hangs out, up and to the rear, awaiting to be filled in the morning. What am I?",
            "Throw it off the highest building, and I'll not break. But put me in the ocean, and I will. What am I?",
            "What can run but never walks, has a mouth but never talks, has a head but never weeps, has a bed but never sleeps?",
            "What is black when you buy it, red when you use it, and gray when you throw it away? ",
            "I have many teeth and sometimes they're fine, First I'm by your head, then I'm down your spine. What am I? What am I? ",
            "Rearrange the letters: NOR DO WE to make one word. ",
            "This old one runs forever, but never moves at all. He has not lungs nor throat, but still a mighty roaring call. What is it? ",
            "What time of day, when written in a capital letters, is the same forwards, backwards and upside down? ",

    };

    private String mChoices [] []={
            {"a coffin", "a rug", "a knife"},
            {"a water bottle", " a basket ball","a sponge"},
            {"a piece of gum", "a shoe", "a show"},
            {"an ape", "a tie", "A tissue"},
            {" the ocean", "A River", "a pokemon"},
            {"Match Stick ", "Charcoal ", "Lollipop ",},
            {"A comb ", "Fingers ", "Hamster ",},
            {"N DO WE R ", "DOOR NEW ", "ONE WORD ", },
            {"Waterfall ", "Stream ", "Lake ", },
            {"Evening ", "Noon ", "Night ", },
    };

    private String mAnswers []={"a coffin", "a sponge", "a shoe", "  A tissue", "A River", " Charcoal", " A comb", "ONE WORD ", "Waterfall ", " Noon"};


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

