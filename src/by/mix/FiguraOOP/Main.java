package by.mix.FiguraOOP;

import java.util.Random;

/**
 * Created by st on 17.03.2016.
 */

public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[5];
        Square[] squares = new Square[5];

        initMasCircle(circles);
        initMasSquare(squares);
    }

    // инициализация и вывод круга
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
    }
}