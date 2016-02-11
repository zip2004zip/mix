package by.mix.utils;

/**
 * Created by st on 09.02.2016.
 */
public class MasUtils {


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