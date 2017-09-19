package com.example.kylemiller.rpssolo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button rockButton;
    Button paperButton;
    Button scissorsButton;
    ComputerPlayer computerPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rockButton = (Button)findViewById(R.id.rock_button);
        paperButton = (Button)findViewById(R.id.paper_button);
        scissorsButton = (Button)findViewById(R.id.scissors_button);

    }

    public void onRockButtonClicked(View button){
        Intent intent = new Intent(this, AnswerActivity.class);
        String rock = RockPaperScissors.playGame("rock", computerPlayer);
        intent.putExtra("userChoice", rock);
        startActivity(intent);

    }

    public void onPaperButtonClicked(View button){
        Intent intent = new Intent(this, AnswerActivity.class);
        String paper = RockPaperScissors.playGame("paper", computerPlayer);
        intent.putExtra("userChoice", paper);
        startActivity(intent);

    }
    public void onScissorsButtonClicked(View button){
        Intent intent = new Intent(this, AnswerActivity.class);
        String scissors = RockPaperScissors.playGame("scissors", computerPlayer);
        intent.putExtra("userChoice", scissors);
        startActivity(intent);
    }

}
