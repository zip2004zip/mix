package by.mix.oop.shutkaOOP;

import java.util.List;
import java.util.Random;

/**
 * Created by st on 21.04.2016.
 */

public class JokeTimer {
    private long interval = 3000;
    private ModeTimer modeTimer = ModeTimer.ASC;
    private List<String> jokes;
    private JokePrinter jokePrinter;
    private int currentJokeIndex = 0;


    public JokeTimer(List<String> jokes, JokePrinter jokePrinter) {
        this.jokes = jokes;
        this.jokePrinter = jokePrinter;
    }

    public long getInterval() {
        return interval;
    }

    public void setInterval(long interval) {
        this.interval = interval;
    }

    public ModeTimer getModeTimer() {
        return modeTimer;
    }

    public void setModeTimer(ModeTimer modeTimer) {
        this.modeTimer = modeTimer;
    }


    /**
     * запуск в миллисикундах
     * now1 это первый интервал
     * now2 интервал после первого
     */

    public void run() {
        long now1 = System.currentTimeMillis();
        for (; ; ) {
            long now2 = System.currentTimeMillis();
            if (now2 - now1 >= interval) {
                jokePrinter.print(getNextJoke());
                now1 = System.currentTimeMillis();
            }
        }
    }

    protected String getNextJoke() {
        if (jokes.size() == 0) {
            throw new JokeException("Joke array is empty");
        }
        if (modeTimer.equals(ModeTimer.RANDOM)) {
            Random random = new Random();
            return jokes.get(random.nextInt(jokes.size()));
        } else {
            String joke = jokes.get(currentJokeIndex);
            currentJokeIndex++;
            if (currentJokeIndex >= jokes.size()) {
                currentJokeIndex = 0;
            }
            return joke;
        }
    }
}
