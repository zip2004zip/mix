package by.mix;


// одномерный  массив вывели полож и отриц и процент,

import java.util.Random;

public class Main16 {
    public static void main(String[] args) {
        int[] mas = new int[10];

        printMas(mas);
        initMas(mas);
        printMas(mas);

        System.out.println("положительных " + procent(skolkopolog(mas), mas.length));
        System.out.println("отрицательных " + procent(skolkootric(mas), mas.length));

    }

    public static void printMas(int[] fmas) {
        for (int i = 0; i < fmas.length; i++) {
            System.out.println(fmas[i]);
        }
    }

    public static void initMas(int[] fmas) {
        for (int i = 0; i < fmas.length; i++) {
            fmas[i] = ((new Random()).nextInt(100))-50;
        }
    }

    public static int skolkopolog(int[] fmas) {
        int c = 0;
        for (int i = 0; i < fmas.length; i++) {
            if (fmas[i] >= 0) {
                c++;
            }
        }
        return c;
    }

    public static int skolkootric(int[] fmas) {
        int c = 0;
        for (int i = 0; i < fmas.length; i++) {
            if (fmas[i] < 0) {
                c++;
            }
        }
        return c;
    }

    public static float procent(float x, float y) {
        return x/y*100;
    }
}
