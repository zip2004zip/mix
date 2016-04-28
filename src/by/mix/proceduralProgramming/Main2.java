package by.mix.proceduralProgramming;

import java.util.Random;

// создали массив и в нем сделали копию этого массива в Random

public class Main2 {
    public static void main(String[] args) {
        int[] m1 = new int[100];
        Random random = new Random();
        for (int i = 0; i < m1.length; i++) {
            m1[i] = -500 + random.nextInt(1000);
        }
        for (int i = 0; i < m1.length; i++) {
            System.out.println(i + ":" + m1[i]);
        }
        int[] m2 = new int[100];
        for (int i = 0; i < m2.length; i++) {
            m2[i] = m1[i];
            System.out.println(i + ":" + m2[i]);
        }
    }
}
