package by.mix.televisionOOP;

/**
 * Created by st on 05.04.2016.
 */

public class Television {
    boolean powerOn = false;

    public void turnOn() {
        powerOn = true;
        System.out.println("Телик включен");
    }

    public void turnOff() {
        powerOn = false;
        System.out.println("Телик выключен");
    }

    public void forwardСhannel() {
        if (powerOn == false) {
            System.out.println("ты глючишь телик выключен");
        } else {
            System.out.println("Канал вперед");
        }
    }

    public void backСhannel() {
        if (!powerOn) {
            System.out.println("ты глючишь телик выключен");
        } else {
            System.out.println("Канал назад");
        }
    }
}
