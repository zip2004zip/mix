package by.mix.IntOOP;
import java.util.Random;

/**
 * Created by st on 3/15/2016.
 */

public class Main {
    public static void main(String[] args) {
        SuperInt[] mas = new SuperInt[10];
        Random random = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = new SuperInt(random.nextInt(100));
            //  mas[i].setI(random.nextInt(100));
            System.out.println(mas[i].getI());
        }
    }
}