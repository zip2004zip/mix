package by.mix;

/**
 * телефонный справочник
 */

import java.util.Scanner;

public class Main37 {
    public static int MAX = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[MAX];
        boolean[] ids = new boolean[MAX];
        String[] numbers = new String[MAX];
        String[] adresss = new String[MAX];

        while (true) {
            System.out.println("\n- Телефонный справочник. Введите значение:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Удалить контакт");
            System.out.println("3. Поиск контакта");
            System.out.println("4. Вывести все контакты");
            System.out.println("5. Обновить контакт");
            System.out.println("6. Сортировать контакты");
            System.out.println("0. Выход");
            String menu = scanner.nextLine();
            if ("0".equals(menu)) {
                break;
            } else if ("1".equals(menu)) {
                addContact(names, ids, scanner, numbers, adresss);

            } else if ("2".equals(menu)) {
                deleteContact(names, ids, scanner);

            } else if ("3".equals(menu)) {
                searchContact(names, ids, scanner, numbers, adresss);

            } else if ("4".equals(menu)) {
                showList(names, ids, numbers, adresss);

            } else {
                System.out.println("\nНеверный пункт меню! Повторите!");
            }
        }
    }


    private static void showList(String[] names, boolean[] ids, String[] numbers, String[] adresss) {
        System.out.println("\nСписок всех контактов:");
        System.out.println("----------------------------------------------------------------------------");
        for (int i = 0; i < ids.length; i++) {
            if (ids[i]) {
                System.out.printf("| " + i + " - " + "%30s", names[i] + " |");
                System.out.printf("%15s", numbers[i] + " |");
                System.out.printf("%25s", adresss[i] + " |");
                System.out.println();
            }
        }
        System.out.println("----------------------------------------------------------------------------");
    }


    public static void addContact(String[] names, boolean[] ids, Scanner scanner, String[] numbers, String[] adresss) {
        System.out.println("\nДобавление контакта:");

        System.out.println("Введите ФИО");
        String name = scanner.nextLine();
        int id = findId(ids);
        names[id] = name;
        ids[id] = true;

        System.out.println("Введите номер телефона");
        String number = scanner.nextLine();
        numbers[id] = number;

        System.out.println("Введите адрес");
        String adress = scanner.nextLine();
        adresss[id] = adress;
    }

    public static void deleteContact(String[] names, boolean[] ids, Scanner scanner) {
        //  StringBuilder[] namesDel = new StringBuilder[MAX];
        System.out.println("\nУдаление контакта:");
        System.out.println("Введите ФИО");
        String name = scanner.nextLine();
        int id = findIdDel(ids);
        names[id] = name;
        ids[id] = true;
    }


    public static void searchContact(String[] names, boolean[] ids, Scanner scanner, String[] numbers, String[] adresss) {
        System.out.println("\nПоиск контакта:");
        System.out.println("Введите фамилию для поиска:");
        String name = scanner.nextLine();
        for (int i = 0; i < names.length; i++)
                {
            if (names[i].equals(name)) {
                System.out.println("----------------------------------------------------------------------------");
                System.out.printf("| " + i + " - " + "%30s", name + " |");
                System.out.printf("%15s", numbers[i] + " |");
                System.out.printf("%25s", adresss[i] + " |");
                System.out.println();
                System.out.println("----------------------------------------------------------------------------");
                break;
            } //else if (!names[i].equals(name)) {
               // System.out.println("Фамилия не найдена");
           // }
        }
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

    public static int findIdDel(boolean[] ids) {
        for (int i = 0; i < ids.length; i--) {
            if (!ids[i]) {
                return i;
            }
        }
        System.out.println("ERROR");
        return -1;
    }

}