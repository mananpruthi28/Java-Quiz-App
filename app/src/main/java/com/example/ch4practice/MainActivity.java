package com.example.ch4practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions = {"Java is a person?",
            "Java was introduced in 1233?", "Java was created using Python?",
            "Java has abstract classes?", "Java supports interfaces?", "Java was created by Manan in India?"};
    private boolean[] answers = {false, false, false, true, true, false};
    private int score = 0;
    Button Yes;
    Button No;
    private int index = 0;
    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Yes = findViewById(R.id.Yes);
        No = findViewById(R.id.No);
        textView2 = findViewById(R.id.textView2);
        textView2.setText(questions[index]);
        Yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // If the array is not going out of bounds
                if (index <= questions.length - 1) {
                    //If you have given correct answer
                    if (answers[index]) {
                        score++;
                    }
                    // Go to the next question.
                    index++;
                    if (index <= questions.length - 1) {
                        textView2.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "Your score is: " + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }

                } else {
                    Toast.makeText(MainActivity.this, "Restart the app to play again!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
//                if(index == questions.length){
//                    Toast.makeText(MainActivity.this, "Your Score is " + score, Toast.LENGTH_SHORT).show();
//                }
//                if(answers[index] == true){
//                    score++;
//
//                }
//                textView2.setText(questions[++index]);
//            }
//        });
        No.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // If the array is not going out of bounds
                if (index <= questions.length - 1) {
                    //If you have given correct answer
                    if (!answers[index]) {
                        score++;
                    }
                    // Go to the next question.
                    index++;
                    if (index <= questions.length - 1) {
                        textView2.setText(questions[index]);
                    } else {
                        Toast.makeText(MainActivity.this, "Your score is: " + score + "/" + questions.length, Toast.LENGTH_SHORT).show();
                    }
                } else {
                    Toast.makeText(MainActivity.this, "Restart the app to play again!!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}