package by.mix.oop.televisionOOP;

/**
 * Created by st on 05.04.2016.
 */

public class BackСhannelTVCommand implements Command {
    private Television television;

    public BackСhannelTVCommand(Television television) {
        this.television = television;
    }


    @Override
    public void execute() {
        television.backСhannel();
    }
}
