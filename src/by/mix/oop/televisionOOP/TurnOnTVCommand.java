package by.mix.oop.televisionOOP;

/**
 * Created by st on 05.04.2016.
 */
public class TurnOnTVCommand implements Command {
    private Television television;

    public TurnOnTVCommand(Television television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOn();
    }
}