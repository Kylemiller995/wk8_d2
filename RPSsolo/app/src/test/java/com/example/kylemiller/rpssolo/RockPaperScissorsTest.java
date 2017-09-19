package com.example.kylemiller.rpssolo;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by kylemiller on 19/09/2017.
 */
public class RockPaperScissorsTest {

    ComputerPlayer computerPlayer;
    String rock;

    @Test
    public void playGame() {
        rock = RockPaperScissors.playGame("rock", computerPlayer);
        assertEquals(rock, "Player Wins");


    }

}