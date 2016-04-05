package by.mix.televisionOOP;

/**
 * Created by st on 05.04.2016.
 */

public class TurnOffTVCommand implements Command {
    private Television television;

    public TurnOffTVCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOff();
    }
}
