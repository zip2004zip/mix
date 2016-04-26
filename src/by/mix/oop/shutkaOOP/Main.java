package by.mix.oop.shutkaOOP;

import java.util.Collections;
import java.util.List;

/**
 * Created by st on 21.04.2016.
 */

public class Main {

    public static void main(String[] args) {

        List<String> jokes = JokeReader.readJokes(JokeReader.FILE);

        JokeTimer jokeTimer = new JokeTimer(jokes, new JokeConsolePrinter());
        jokeTimer.setModeTimer(ModeTimer.RANDOM);
        jokeTimer.run();


    }
}
