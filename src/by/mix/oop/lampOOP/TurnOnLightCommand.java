package by.mix.oop.lampOOP;

/**
 * Created by st on 05.04.2016.
 * создаем комманду на включение лампочки
 */

public class TurnOnLightCommand implements Command {
    private Light light;

    public TurnOnLightCommand (Light light){
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
