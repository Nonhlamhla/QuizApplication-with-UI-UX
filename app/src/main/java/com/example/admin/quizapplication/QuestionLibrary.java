package com.example.admin.quizapplication;


import android.content.Intent;

public class QuestionLibrary {

    Intent intent = new Intent("android.intent.action.MAIN");



        private String mQuestion []={
                "What did the thief get for stealing the calendar?",
                "What is easy to get into, but hard to get out of?",
                "What has a Heart but no other organs?",
                "I go in hard. I come out soft. You blow me hard. What am I?",
                "Why is the letter A the most like a flower?",
                "What has to be broken before it can be used? ",
                "I am a box that holds keys without locks, yet my keys can unlock your deepest senses. What am I? ",
                " You can hold it without using your hands or arms. What is it? ",
                "What has a head, a tail, is brown, and has no legs? ",
                "Whats black and white and red all over? ",

        };

        private String mChoices [] []={
                {"12 Months", "2 Months", "6 Months"},
                {"War", "Trouble","Water"},
                {"Picture", "A deck of cards", "Video"},
                {"Balloon", "Sweet", "Gum"},
                {"Because the B is after it", "Because the B is before it", "Because bee's love nectar"},
                {"Watermelon ", "Egg ", " Easter egg",},
                {"Secrete Box", " Piano ", "Music Box ",},
                {" Breath ", " Air", "Wind ",},
                {"Worm ", "Snake ", "Penny ", },
                {" Newspaper", "Script ", "Velvet Book ",},

        };

        private String mAnswers []={"12 Months", "Trouble", "A deck of cards", "Gum", "Because the B is after it" , " Egg", " Piano ", " Breath ", "Penny ", " "};


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

