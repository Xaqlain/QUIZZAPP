package com.example.quizzapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {

    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    RadioButton c1;
    RadioButton a2;
    RadioButton a3;
    RadioButton b4;
    RadioButton b5;
    RadioButton a6;
    RadioButton c7;
    RadioButton a8;
    RadioButton c9;
    RadioButton b10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);


        public void submitAnswers(View view) {

            CharSequence resultsDisplay;
            Log.e(LOG_TAG, " " + this.findViewById(R.id.a3));
            int answer1_score;
            int answer2_score;
            int answer3_score;
            int answer4_score;
            int answer5_score;
            int answer6_score;
            int answer7_score;
            int answer8_score;
            int answer9_score;
            int answer10_score;
            int final_score;

            //------------------------------------------------------------------------------------------
            // Question 1 - Correct Answer is #3 (Holy Land)
            //------------------------------------------------------------------------------------------
            Boolean answer1;

            c1 = (RadioButton) this.findViewById(R.id.c1);
            answer1 = c1.isChecked();
            if (answer1) {
                answer1_score = 1;
            } else {
                answer1_score = 0;
            }
            //------------------------------------------------------------------------------------------
            // Question 2 - Correct Answer is "Muhammad Ali jinnah"
            //------------------------------------------------------------------------------------------
            Boolean answer2;

            a2 = (RadioButton) this.findViewById(R.id.a2);
            answer2 = a2.isChecked();
            if (answer2) {
                answer2_score = 1;
            } else {
                answer2_score = 0;
            }
            //------------------------------------------------------------------------------------------
            // Question 3  - Correct Answers are (1992)
            //------------------------------------------------------------------------------------------
            Boolean answer3;

            a3 = (RadioButton) this.findViewById(R.id.a3);
            answer3 = a3.isChecked();
            if (answer3) {
                answer3_score = 1;
            } else {
                answer3_score = 0;
            }
            //------------------------------------------------------------------------------------------
            // Question 4 - Correct Answer is "1956"
            //------------------------------------------------------------------------------------------
            Boolean answer4;

            b4 = (RadioButton) this.findViewById(R.id.b4);
            answer4 = b4.isChecked();
            if (answer4) {
                answer4_score = 1;
            } else {
                answer4_score = 0;
            }
            //------------------------------------------------------------------------------------------
            // Question 5  - Correct Answers is #2 "Ameerudinkhidwai"
            //------------------------------------------------------------------------------------------
            Boolean answer5;
            b5 = (RadioButton) this.findViewById(R.id.b5);
            answer5 = b5.isChecked();
            if (answer5) {
                answer5_score = 1;
            } else {
                answer5_score = 0; }
            //------------------------------------------------------------------------------------------
            // Question 6 - Correct Answer is "Hafeez jalandhari"
            //------------------------------------------------------------------------------------------
            Boolean answer6;
            a6 = (RadioButton) this.findViewById(R.id.a6);
            answer6 = a6.isChecked();
            if (answer6) {
                answer6_score = 1;
            } else {
                answer6_score = 0; }
            //------------------------------------------------------------------------------------------
            // Question 7  - Correct Answers are #3 (Earth) and #4 (Pluto)
            //------------------------------------------------------------------------------------------
            Boolean answer7;
            c7 = (RadioButton) this.findViewById(R.id.c7);
            answer7 = c7.isChecked();
            if (answer7) {
                answer7_score = 1;
            } else {
                answer7_score = 0; }
            //------------------------------------------------------------------------------------------
            // Question 8 - Correct Answer is "Wrist"
            //------------------------------------------------------------------------------------------
            Boolean answer8;
            a8 = (RadioButton) this.findViewById(R.id.a8);
            answer8 = a8.isChecked();
            if ( answer8 ) {
                answer8_score = 1;
            } else {
                answer8_score = 0;
            }
            //------------------------------------------------------------------------------------------
            // Question 9  - Correct Answers is #2 "Stalagmites"
            //------------------------------------------------------------------------------------------
            Boolean answer9;
            c9 = (RadioButton) this.findViewById(R.id.c9);
            answer9 = c9.isChecked();
            if (answer9) {
                answer9_score = 1;
            } else {
                answer9_score = 0;
            }
            //------------------------------------------------------------------------------------------
            // Question 10 - Correct Answer is "Smelting"
            //------------------------------------------------------------------------------------------
            Boolean answer10;
            b10 = (RadioButton) this.findViewById(R.id.b10);
            answer10 = b10.isChecked();
            if (answer10) {
                answer10_score = 1;
            } else {
                answer10_score = 0;
            }
            //------------------------------------------------------------------------------------------
            // Final Score
            //------------------------------------------------------------------------------------------
            final_score = answer1_score + answer2_score + answer3_score + answer4_score + answer5_score +
                    answer6_score + answer7_score + answer8_score + answer9_score + answer10_score;

            if (final_score == 10) {
                resultsDisplay = "Perfect! You scored 10 out of 10";
            } else {
                resultsDisplay = "Try again. You scored " + final_score + " out of 10";
            }

            Context context = getApplicationContext();
            int duration = Toast.LENGTH_LONG;
            Toast toast = Toast.makeText(context, resultsDisplay, duration);
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.show();
        }
    }

}

