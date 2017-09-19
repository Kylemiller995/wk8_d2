package com.example.kylemiller.rpssolo;

/**
 * Created by kylemiller on 19/09/2017.
 */

public class RockPaperScissors {

    public static String playGame(String playerChoice, ComputerPlayer computerPlayer){
        String computerChoice = computerPlayer.computerPlay();
        String playerWins = "Player Wins";
        if(playerChoice.equals(computerChoice)){
            return "Draw";
        }
        else if(playerChoice.equals("rock") && computerChoice.equals("paper") ){
            return playerWins;
        }
        else if(playerChoice.equals("paper") && computerChoice.equals("scissors")){
            return playerWins;
        }
        else if(playerChoice.equals("scissors") && computerChoice.equals("rock")){
            return playerWins;
        }
        else return "Computer wins";
    }



}
