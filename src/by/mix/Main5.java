package by.mix;

import java.util.Random;

// Задача 1 посчитать процентное соотношение положительных и отрицательных чисел в массиве

public class Main5 {
    public static void main(String[] args) {
        int[] m1 = new int[10];
        Random random = new Random();
        for (int i = 0; i < m1.length; i++) {
            m1[i] = -50 + random.nextInt(100);
        }

        // вывод массива
        for (int i = 0; i < m1.length; i++) {
            System.out.println(i + ":" + m1[i]);
        }

        // копирование массива и вывод только положительных и четных
        int[] m2 = new int[10];
        //int j = 0;
        for (int i = 0; i < m2.length; i++) {
            if (m1[i] >= 0 && m1[i] % 2 == 0) {
                m2[i] = m1[i];
                //j++;
            }
            System.out.println(i + ":" + m2[i]);
        }

        //вывод массива
        //for (int i = 0; i < m2.length; i++) {
        //System.out.println(i + ":" + m2[i]);
        //}
    }
}
