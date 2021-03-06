package by.mix.proceduralProgramming;

// Задача 9 одномерный  массив В массиве сравить попарно (1 со 2, 2 с 3, 3 с 4 и тд) элементы и найти те 2, сумма которых максимальная.

import java.util.Random;

public class Main18 {
    public static void main(String[] args) {
        int[] mas = new int[10];

        initMas(mas);
        printMas(mas);
        findMaxPair(mas); // findMaxPair - это сумма двух максимальных пар

    }

    public static void initMas(int[] fmas) {
        Random random = new Random();

        for (int i = 0; i < fmas.length; i++) {
            fmas[i] = random.nextInt(100);
        }
    }

    public static void printMas(int[] fmas) {
        for (int i = 0; i < fmas.length; i++) {
            System.out.println(i + "- " + fmas[i]);
        }
    }

    public static void findMaxPair(int[] fmas) {
        if (fmas.length <3) {
            System.out.println("mas.length должен быть >=2");
        }
        int sum = fmas[0] + fmas [1];
        int max1 = 0;
        int max2 = 0;
        for (int i = 0; i < fmas.length -1; i++) {
            if (fmas[i] + fmas[i + 1] > sum) {
                sum = fmas[i] + fmas[i + 1];
                max1 = i;
                max2 = i + 1;
            }
        }
        System.out.println("i1=" + max1 + " i2=" + max2 + " sum=" + sum);
    }
}