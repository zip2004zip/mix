package by.mix;

import java.util.Random;

// Задача 7 Вывести все простые числа до заданного


public class Main10 {
    public static void main(String[] args) {
        int[] s1 = new int[100];
        int i = 0;
        for (i = 1; i <= 100; i++) {
            s1[i] = i + 1;
        }


        for (i = 1; i <= 100; i++) {
            System.out.println(s1[i]);
        }

        // ищем натуральные числа
        for (i = 1; i <= 100; i++) {
            if (s1[i] % i == 0) ;
            i++;
        }
        System.out.println("натуральные числа - " + s1[i]);
    }
}




       /* int[] m1 = new int[10];
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
        System.out.println("Сумма положительных чисел = " + sumPol + ", что составляет " + (sumPol * 100) / 10 + " %");
        System.out.println("Сумма отрицательных чисел = " + sumOtr + ", что составляет " + (sumOtr * 100) / 10 + " %");
    }
}*/
