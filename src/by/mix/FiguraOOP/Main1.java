package by.mix.FiguraOOP;

import java.util.Random;

/**
 * Created by st on 17.03.2016.
 */
public class Main1 {
    public static void main(String[] args) {
        Krug1[] krugs = new Krug1[5];
        Random random = new Random();
        for (int i = 0; i < krugs.length; i++) {
            krugs[i] = new Krug1(random.nextInt(12));
            System.out.println("Круг " + i + ":");
            System.out.println("длина = " + krugs[i].colculateLength());
            System.out.println("площадь = " + krugs[i].colculateSquare() + "\n");
        }
    }
}
