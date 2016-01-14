package by.mix;


// многомерный массив посчитать сумму элементов в каждой строке

import java.util.Random;

public class Main21 {
    public static void main(String[] args) {
        int[][] mas = new int[10][20];

        initMas(mas);
        printMas(mas);
        findMaxStr(mas);


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

    public static void findMaxStr(int[][] fmas) {
        int sum = fmas[0] + fmas[0];
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < fmas.length; i++) {
            for (int j = 0; j < fmas.length; j++) {
              //  if (fmas[i] + fmas[j] > sum) {
                    sum = fmas[i+1] + fmas[j+1];
                    max1 = i++;
                    max2 = j++;
                }
                System.out.println("i1=" + max1 + " i2=" + max2 + " sum=" + sum);
            }
        }


    }

