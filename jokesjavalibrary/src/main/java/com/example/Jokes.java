package com.example;

import java.util.ArrayList;
import java.util.Random;

public class Jokes {

    public String tellJoke(){

        ArrayList<String> jokeList = new ArrayList<>();

        jokeList.add("Why do farts stink?\n\nSo that deaf people can enjoy them too!");
        jokeList.add("Why did the hedgehog cross the road?\n\nTo see his flat mate!");
        jokeList.add("What do you call a fish without an eye?\n\nFsh");
        jokeList.add("Why does it take 1 million sperm to fertilize one egg?\n\nThey won't stop to ask directions");
        jokeList.add("What's the difference between Big Foot and an intelligent man?\n\nBig Foot's been spotted several times");

        jokeList.add("Doctor: I'm sorry, but you suffer from a terminal illness and have only 10 to live\n\n" +
                "Patient: What do you mean, 10? 10 what? Months? Weeks?\n\n" +
                "Doctor: Nine");
        jokeList.add("I have no home, I haven't got control, I can't see any escape...\n\n" +
                "Way past the time I got a new keyboard");
        jokeList.add("Why do cows wear bells?\n\n" +
                "Their horns don't work");
        jokeList.add("What do politicians and diapers have in common?\n\n" +
                "Both should be changed regularly, and both for the same reason.");
        jokeList.add("What do you call a very funny mountain?\n\n" +
                "Hill-Arious");

        int size = jokeList.size();
        Random random = new Random();
        int randomInt = random.nextInt(size);

        return jokeList.get(randomInt);
    }
}