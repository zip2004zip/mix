package by.mix.oop.lampOOP;

/**
 * Created by st on 05.04.2016.
 *
 */

public class Switcher {
    private Command lightOnCommand;
    private Command lightOffCommand;

    public Switcher(Command lightOnCommand, Command lightOffCommand) {
        this.lightOnCommand = lightOnCommand;
        this.lightOffCommand = lightOffCommand;
    }

    public void turnOn(){
        lightOnCommand.execute();
    }

    public void turnOff(){
        lightOffCommand.execute();
    }
}
