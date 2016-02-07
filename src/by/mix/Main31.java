package by.mix;


// одномерный массив заполнить случайным образом и отсортировать пузырьковым методом по возрастанию


import java.util.Random;

public class Main31 {
    public static void main(String[] args) {
        int[] mas = new int[15];

        initMas(mas);
        printMas(mas);
        sortMas(mas);
        print2Mas(mas);
    }

    public static void initMas(int[] fmas) {
        Random random = new Random();
        for (int i = 0; i < fmas.length; i++) {
            fmas[i] = -500 + random.nextInt(1000);
        }
    }

    public static void printMas(int[] fmas) {
        for (int i = 0; i < fmas.length; i++) {
            System.out.printf("%5d", +fmas[i]);
        }
        System.out.println();
    }

    public static void sortMas(int[] fmas) {
        for (int a = 1; a < fmas.length; a++)
            for (int b = fmas.length - 1; b >= a; b--) {
                if (fmas[b - 1] > fmas[b]) {           // если требуемый порядок следования не соблюдается, поменять элементы местами
                    int t = fmas[b - 1];
                    fmas[b - 1] = fmas[b];
                    fmas[b] = t;
                }
            }
    }


    public static void print2Mas(int[] fmas) {
        for (int i = 0; i < fmas.length; i++) {
            System.out.printf("%5d", +fmas[i]);
        }
    }
}