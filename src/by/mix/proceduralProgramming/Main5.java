package by.mix.proceduralProgramming;

import java.util.Random;

// Задача 2 посчитать процентное соотношение положительных и отрицательных чисел в массиве

public class Main5 {
    public static void main(String[] args) {
        int[] m1 = new int[50];
        int sumPol = 0;
        int sumOtr = 0;
        Random random = new Random();
        for (int i = 0; i < m1.length; i++) {
            m1[i] = -50 + random.nextInt(1000);
        }

        // вывод массива для себя, что бы витеть цифры
        for (int i = 0; i < m1.length; i++) {
            System.out.println(i + ": " + m1[i]);
        }

        // вывод суммы положительных и отрицательных
        for (int i = 0; i < m1.length; i++) {
            if (m1[i] >= 0) {
                sumPol++;
            } else {
                if (m1[i] < 0) {
                    sumOtr++;
                }
            }
        }
        System.out.println("Сумма положительных чисел = " + sumPol + ", что составляет " + (sumPol * 100) / 50 + " %");
        System.out.println("Сумма отрицательных чисел = " + sumOtr + ", что составляет " + (sumOtr * 100) / 50 + " %");
    }
}