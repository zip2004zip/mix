package by.mix.oop.lampOOP;

/**
 * Created by st on 05.04.2016.
 * создаем комманду на выключение лампочки
 */

public class TurnOffLightCommand implements Command {
    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
