package by.mix;


// массив в котором числа вводятся с клавиатуры.
// Прога считает среднее арифметисеское введенных чисел
// предлагает ввести еще новые числа


import java.util.Scanner;

public class Main29 {
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("\nжелаешь Начать новый массив?");
            System.out.println("1: Да");
            System.out.println("2: Нет");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите число: ");
            int vib = scanner.nextInt();
            if (vib == 2) break;
            {
                nashMas();
                //    povtor();

            }
        }
    }

    public static void nashMas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элемннтов массива: ");
        int sizeMas = scanner.nextInt();
        double sum = 0;
        int[] mas1 = new int[sizeMas];
        for (int i = 0; i < mas1.length; i++) {
            System.out.println("Введите элемент массива mas[" + i + "]");
            mas1[i] = scanner.nextInt();
            sum += mas1[i];
        }
        System.out.println("Общая сумма элементов " + sum + " , а среднее арифметическое = " + sum / sizeMas);
    }
}


    /*public static void povtor() {
        System.out.println("желаешь продолжить?");
        System.out.println("1: Да");
        System.out.println("2: Нет");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int vib = scanner.nextInt();

        if (vib == 2) break;

        }
    }*/
