package by.mix.lampOOP;

import java.io.IOException;

/**
 * Created by st on 05.04.2016.
 * включение и выключение лампы
 */

public class Main {
    public static void main(String[] args) throws IOException {
        final Light light = new Light();

        Command command1 = new TurnOnLightCommand(light);
        Command command2 = new TurnOffLightCommand(light);
        Switcher switcher = new Switcher(command1, command2);
        switcher.turnOn();
        switcher.turnOff();
    }
}