package by.mix.proceduralProgramming;


// вывели одномерный массив

import java.util.Random;

public class Main14 {
    public static void main(String[] args) {
        int[] mas = new int[10];
       // printMas(mas);
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            mas[i] = -500 + random.nextInt(1000);
        }
        printMas(mas);
    }

    public static void printMas(int[] fmas) {  //fmas это любое имя
        for (int i = 0; i < fmas.length; i++) {
            System.out.println(fmas[i]);
        }
    }
}


