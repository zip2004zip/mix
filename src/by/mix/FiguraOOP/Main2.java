package by.mix.FiguraOOP;

import java.util.Random;

/**
 * Created by st on 17.03.2016.
 */
public class Main2 {
    public static void main(String[] args) {
        Krug2[] krugs = new Krug2[5];
        Kvadrat[] kvadrats = new Kvadrat[5];
        Random random = new Random();
        for (int i = 0; i < krugs.length; i++) {
            krugs[i] = new Krug2(random.nextInt(12));
          //  System.out.println("Круг " + i + ":");
            System.out.println(krugs[i].toString());
          //  System.out.println("длина = " + krugs[i].colculateLength());
          //  System.out.println("площадь = " + krugs[i].colculateSquare() + "\n");
        }
    }
}
