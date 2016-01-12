package by.mix;


// двухмерный массив посчитали процентное соотношение положит и отриц чисел

import java.util.Random;

public class Main15 {
    public static void main(String[] args) {
        int[] mas = new int[10];
        printMas(mas);
        int x = 0;
        int y = 0;
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            mas[i] = -50 + random.nextInt(1000);
        }
        printMas(mas);

        System.out.println("положительных" + procent(10, 50));
        System.out.println("отрицательных" + procent(40, 50));
    }

    public static void printMas(int[] fmas) {
        for (int i = 0; i < fmas.length; i++) {
            System.out.println(fmas[i]);
        }
    }

    public static int procent(int x, int y) {
        return (int) (((float) x / y) * 100);
    }
}
