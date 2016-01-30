package by.mix;


// массив в котором числа вводятся с клавиатуры.
// Прога считает среднее арифметисеское введенных чисел
// предлагает ввести еще новые числа


import java.util.Scanner;

public class Main29 {
    public static Scanner main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элемннтов массива: ");
        int sizeMas = scanner.nextInt();
        int[] mas = new int[sizeMas];
        double sum = 0;
        System.out.println("Введите элементы массива: ");

        for (int i = 0; i < mas.length; i++) {
            mas[i] = scanner.nextInt();
        }
        for (int i = 0; i < mas.length; i++) {
            sum += mas[i];
            System.out.println("Элемент массива:" + mas[i]);
            return scanner;
            }
            System.out.println("Общая сумма элементов " + sum + " , а среднее арифметическое = " + sum / sizeMas);

        return scanner;
    }
    }

