package by.mix.oop.televisionOOP;

/**
 * Created by st on 05.04.2016.
 */
public class Switcher {
    private Command televisionOnCommand;
    private Command televisionOffCommand;
    private Command televisionBackСhannelCommand;
    private Command televisionforwardСhannelComand;


    public Switcher(Command televisionOnCommand, Command televisionOffCommand, Command televisionBackСhannelCommand, Command televisionforwardСhannelComand) {
        this.televisionOnCommand = televisionOnCommand;
        this.televisionOffCommand = televisionOffCommand;
        this.televisionBackСhannelCommand = televisionBackСhannelCommand;
        this.televisionforwardСhannelComand = televisionforwardСhannelComand;
    }

    public void turnOn() {
        televisionOnCommand.execute();
    }

    public void turnOff() {
        televisionOffCommand.execute();
    }

    public void forwardСhannel() {
        televisionforwardСhannelComand.execute();
    }

    public void backСhannel() {
        televisionBackСhannelCommand.execute();
    }
}
