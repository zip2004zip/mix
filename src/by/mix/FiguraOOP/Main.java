package by.mix.FiguraOOP;

import java.util.Random;

/**
 * Created by st on 17.03.2016.
 */
public class Main {
    public static void main(String[] args) {
        Krug[] krugs = new Krug[5];
        Kvadrat[] kvadrats = new Kvadrat[5];

        initMasKrugs(krugs);
        initMasKvadrat(kvadrats);
    }

    public static void initMasKrugs(Krug[] krugs) {
        Random random = new Random();
        for (int i = 0; i < krugs.length; i++) {
            krugs[i] = new Krug(random.nextInt(12));
            System.out.println(krugs[i].toString());
            //  System.out.println("длина = " + krugs[i].colculateLength());
            //  System.out.println("площадь = " + krugs[i].colculateSquare() + "\n");
        }
    }

    public static void initMasKvadrat(Kvadrat[] fmas) {
        Random random = new Random();
        for (int i = 0; i < fmas.length; i++) {
            fmas[i] =new Kvadrat(random.nextInt(10));
            System.out.println(fmas[i].toString());
        }
    }


}