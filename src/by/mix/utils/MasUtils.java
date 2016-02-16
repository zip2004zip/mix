package by.mix.utils;

import java.util.Random;

/**
 * Created by st on 09.02.2016.
 */

public class MasUtils {


    public static int[] initMas(int max) {
        int[] m = new int[max];
        Random random = new Random();
        for (int i = 0; i < m.length; i++) {
            m[i] = random.nextInt(10);
        }
        return m;
    }


    public static void printMas(int[] m) {
        for (int i = 0; i < m.length; i++) {
            System.out.printf("%5d", m[i]);
        }
        System.out.println();
    }


    public static void printMas(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.printf("%5d", m[i][j]);
            }
            System.out.println();
        }
    }


    public static void printMas(int[][][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                for (int k = 0; k < m[i][j].length; k++) {
                    System.out.printf("%5d", m[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }


}