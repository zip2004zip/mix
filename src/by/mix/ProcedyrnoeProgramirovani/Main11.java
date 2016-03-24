package by.mix.ProcedyrnoeProgramirovani;

// Задача 8 Определить какое из 3 числел максимальное и вывести его.


public class Main11 {
    public static void main(String[] args) {
        /*int[] numbers = new int[4];
        int max = 0;
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = -50 + random.nextInt(150);
        }

        // вывод масива какие 3 цифры
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // выбор максимального числа
        for (int i = 0; i < numbers.length; i++) {
            if (max < numbers[i])
                max = numbers[i];
        }
        System.out.println("максимальное число из трех = " + max);
    }
}*/


        // второй способ

        int a = 2, b = 7, c = 9;
        if (a > b) {
            if (a > c) {
                System.out.println("максимальное число из трех = " + a);
            } else {
                System.out.println("максимальное число из трех = " + c);
            }
        } else {
            if (b > c) {
                System.out.println("максимальное число из трех = " + b);
            } else {
                System.out.println("максимальное число из трех = " + c);
            }
        }
    }
}