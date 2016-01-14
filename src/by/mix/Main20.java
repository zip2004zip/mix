package by.mix;


// многомерный массив вывели полож и отриц и процент,

import java.util.Random;

public class Main20 {
    public static void main(String[] args) {
        int[][] mas = new int[10][20];

        initMas(mas);
        printMas(mas);

    }

    public static void initMas(int[] [] fmas) {
        Random random = new Random();
        for (int i = 0; i < fmas.length; i++) {
            for (int j = 0; j < fmas[i].length; j++) {
                fmas[i][j] = -50 + random.nextInt(100);
            }
        }
    }

    public static void printMas(int[][] fmas) {
        for (int i = 0; i < fmas.length; i++) {
            for (int j = 0; j < fmas[i].length; j++) {
                System.out.printf("%5d", fmas[i][j]);
            }
            System.out.println();
        }
    }
}

