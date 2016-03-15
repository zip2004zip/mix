package by.mix.FunccionalnoeProgram;

import java.util.Random;

// Задача 1 создали массив А и сделали копию из этого массива в массив Б, но только четные и положительные значения

public class Main4 {
    public static void main(String[] args) {
        int[] m1 = new int[10];
        Random random = new Random();
        for (int i = 0; i < m1.length; i++) {
            m1[i] = random.nextInt(10);
        }

        // вывод массива
        for (int i = 0; i < m1.length; i++) {
            System.out.println(i + ":1 " + m1[i]);
        }

        // копирование массива и вывод только положительных и четных
        int[] m2 = new int[10];
        for (int i = 0; i < m2.length; i++) {
            if (m1[i] >= 0 && m1[i] % 2 == 0) {
                m2[i] = m1[i];
                System.out.println(i + ":2 " + m2[i]);
            }
        }
    }
}

