package com.example.kylemiller.rpssolo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {
    TextView answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);
        answerText = (TextView) findViewById(R.id.answer_text);
        Intent intent = new Intent();
        Bundle extras = intent.getExtras();
        String userChoice = extras.getString("userChoice");
        answerText.setText(userChoice);

    }
}
