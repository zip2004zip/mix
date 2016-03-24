package by.mix.ProcedyrnoeProgramirovani;


// многомерный массив посчитать сумму элементов в каждой строке

import java.util.Random;

public class Main21 {
    public static void main(String[] args) {
        int[][] mas = new int[10][5];

        initMas(mas);
        printMas(mas);
        findSumStr(mas);


    }

    public static void initMas(int[][] fmas) {
        Random random = new Random();
        for (int i = 0; i < fmas.length; i++) {
            for (int j = 0; j < fmas[i].length; j++) {
                fmas[i][j] = random.nextInt(100);
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

    public static void findSumStr(int[][] fmas) {
        int sum = 0;
        for (int i = 0; i < fmas.length; i++) {
            sum = 0;
            for (int j = 0; j < fmas[i].length; j++) {
                sum = sum + fmas[i][j];
            }
            System.out.println(sum);
        }
    }
}
