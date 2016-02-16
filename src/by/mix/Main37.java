package by.mix;

/**
 * телефонный справочник
 */

import by.mix.utils.MasUtils;

import java.util.Scanner;

public class Main37 {
    public static int MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[MAX];
        boolean[] ids = new boolean[MAX];
        String[] numbers = new String[MAX];

        while (true) {
            System.out.println("\n- Телефонный справочник. Введите значение:");
            System.out.println("1. Добавить запись");
            System.out.println("2. Удалить запись");
            System.out.println("3. Поиск записи");
            System.out.println("4. Вывести запись");
            System.out.println("5. Обновить завись");
            System.out.println("6. Сортировать справочник");
            System.out.println("0. Выход");
            String menu = scanner.nextLine();
            if ("0".equals(menu)) {
                break;
            } else if ("1".equals(menu)) {
                dobavitFIO(names, ids, scanner, numbers);

            } else if ("4".equals(menu)) vivodSpiska(names, ids, numbers);
            else {
                System.out.println("Неверный пункт меню");
            }
        }
    }


    private static void vivodSpiska(String[] names, boolean[] ids, String[] numbers) {
        System.out.println("\nСписок всех контактов");
        System.out.println("----------------------------------");
        for (int i = 0; i < ids.length; i++) {
            if (ids[i]) {
                System.out.printf("| " + i + " " + "%15s", names[i] + " |");
                System.out.printf("%15s", numbers[i]);
                System.out.println();
            }
        }
        System.out.println("----------------------------------");
    }


    public static void dobavitFIO(String[] names, boolean[] ids, Scanner scanner, String[] numbers) {
        System.out.println("Добавление ФИО");
        System.out.println("Введите ФИО");
        String name = scanner.nextLine();
        int id = findId(ids);
        names[id] = name;
        ids[id] = true;
        System.out.println("Введите номер телефона в виде +375(__)___-__-__");
        String number = scanner.nextLine();
        numbers[id] = number;
    }


    public static int findId(boolean[] ids) {
        for (int i = 0; i < ids.length; i++) {
            if (!ids[i]) {
                return i;
            }
        }
        System.out.println("ERROR");
        return -1;
    }
}







    /*public static int[] initMas(int max) {
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
        System.out.println("0. Выход");
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
            int[] mas1 = new int[sizeMas];

            for (int i = 0; i < mas1.length; i++) {
                System.out.println("Введите элемент массива mas[" + i + "]");
                mas1[i] = scanner.nextInt();
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
}*/








