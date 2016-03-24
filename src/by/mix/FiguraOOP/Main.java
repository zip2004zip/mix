package by.mix.FiguraOOP;

import java.util.Random;

/**
 * Created by st on 17.03.2016.
 */

public class Main {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[10];
        Random random = new Random();
        for (int i = 0; i < figuras.length; i++) {
            if (random.nextInt(1000) < 500) {
                figuras[i] = new Circle(random.nextInt(10));
            } else {
                figuras[i] = new Square(random.nextInt(10));
            }
        }

        for (int i = 0; i < figuras.length; i++) {
            System.out.print(figuras[i].toString() + "\n");
            if (figuras[i] instanceof Square) {
                System.out.println("диагональ = " + ((Square)figuras[i]).diagonal());
            }
        }
    }
}


    /*// инициализация и вывод круга
    public static void initMasCircle(Circle[] fmas) {
        Random random = new Random();
        for (int i = 0; i < fmas.length; i++) {
            fmas[i] = new Circle(random.nextInt(12));
            System.out.println(fmas[i].toString());
            //  System.out.println("длина = " + fmas[i].colculateLength());
            //  System.out.println("площадь = " + fmas[i].colculateSquare() + "\n");
        }
    }

    // инициализация и вывод квадрата
    public static void initMasSquare(Square[] fmas) {
        Random random = new Random();
        for (int i = 0; i < fmas.length; i++) {
            fmas[i] =new Square(random.nextInt(10));
            System.out.println(fmas[i].toString());
        }
    }*/