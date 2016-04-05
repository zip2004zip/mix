package by.mix.televisionOOP;

/**
 * Created by st on 05.04.2016.
 */
public class Main {
    public static void main(String[] args) {
        Television television = new Television();

        Command command1 = new TurnOnTVCommand(television);
        Command command2 = new TurnOffTVCommand(television);
        Command command3 = new BackСhannelTVCommand(television);
        Command command4 = new ForwardСhannelTVCommand(television);
        Switcher switcher = new Switcher(command1, command2, command3, command4);
        switcher.turnOn();
        switcher.backСhannel();
        switcher.forwardСhannel();
        switcher.turnOff();
        switcher.forwardСhannel();
        switcher.backСhannel();
        switcher.turnOn();
        switcher.backСhannel();
        switcher.forwardСhannel();
        switcher.turnOff();
    }
}