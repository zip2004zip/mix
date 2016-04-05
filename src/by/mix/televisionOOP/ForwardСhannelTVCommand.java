package by.mix.televisionOOP;

/**
 * Created by st on 05.04.2016.
 */
public class ForwardСhannelTVCommand implements Command {
    private Television television;

    public ForwardСhannelTVCommand(Television television) {
        this.television = television;
    }


    @Override
    public void execute() {
        television.forwardСhannel();
    }
}
