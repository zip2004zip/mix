package by.mix;

/**
 * телефонный справочник
 */

import by.mix.utils.MasUtils;
import java.util.Scanner;

public class Main37 {

    public static void main(String[] args) {

        int[] m = initMas(1000);

        MasUtils.printMas(m);
        telephoneDirectory(m);
    }

    public static int[] initMas(int max) {
        int[] m = new int[max];
        for (int i = 0; i < m.length; i++) {
            m[i] += i;
        }
        return m;
    }

    public static int[] telephoneDirectory(int[] m) {
        int value;
        System.out.println("\n- Телефонный справочник. Введите значение:");
        System.out.println("1. Добавить запись");
        System.out.println("2. Удалить запись");
        System.out.println("3. Вывести запись");
        System.out.println("4. Обновить завись");
        System.out.println("5. Поиск записи");
        System.out.println("6. Сортировать справочник");
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        value = scanner.nextInt();

        //     do {
        //       ignore = scanner.nextInt();
        //   } while (ignore != "\n");
        //   }
        //   while (vib < 1 | vib > 6);

        if (value == 1) {                                      // 1. Добавить запись
            System.out.println("\n- Введите ФИО");
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

            System.out.println("- Введите номер телефона");


        }
        if (value == 2) {                                     // 2. Удалить запись
            System.out.println("\nУдалить запись");


        }
        if (value == 3) {                                     // 3. Вывести запись
            System.out.println("\nВывести запись");
        }

        if (value == 4) {                                     // 4. Обновить завись
            System.out.println("\nОбновить завись");
        }
        if (value == 5) {                                     // 5. Поиск записи
            System.out.println("\nПоиск записи");
        }
        if (value == 6) {                                     // 6. Сортировать справочник
            System.out.println("\nСортировать справочник");
        }
        return m;
    }
}








