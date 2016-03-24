package by.mix.ProcedyrnoeProgramirovani;

import java.util.Random;

// создали массив и в нем сделали копию этого массива в Random

public class Main3 {
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

        // копирование массива и только положительных и четных
        int[] m2 = new int[10];
        int j = 0;
        for (int i = 0; i < m2.length; i++) {
            if (m1[i] >= 0 && m1[i] % 2 == 0) {
                m2[i] = m1[i];
                j++;
            }
        }

        //вывод массива
        for (int i = 0; i < m2.length; i++) {
            System.out.println(i + ":" + m2[i]);
        }
    }
}
