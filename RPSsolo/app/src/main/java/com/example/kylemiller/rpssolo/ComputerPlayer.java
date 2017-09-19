package com.example.kylemiller.rpssolo;

import java.util.ArrayList;

/**
 * Created by kylemiller on 19/09/2017.
 */


public class ComputerPlayer implements Playable {

    ArrayList<String> options;
    NumberGenerating rng;

    public ComputerPlayer() {
        this.options = new ArrayList<>();
    }


    public String computerPlay(){
        options.add("Rock");
        options.add("Paper");
        options.add("Scissors");
        return options.get(rng.generateNumber(options.size()));
    }


}
