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
        String[] phones = new String[MAX];
        String[] addresss = new String[MAX];
        int[] dayBirthdays = new int[MAX];
        int[] monthBirthdays = new int[MAX];
        int[] yearBirthdays = new int[MAX];


        while (true) {
            System.out.println("\n- Телефонный справочник. Введите значение:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Удалить контакт");
            System.out.println("3. Поиск контакта");
            System.out.println("4. Вывести все контакты");
            System.out.println("5. Редактировать контакт");
            System.out.println("6. Сортировать контакты");
            System.out.println("0. Выход");
            String menu = scanner.nextLine();
            if ("0".equals(menu)) {
                break;
            } else if ("1".equals(menu)) {
                addContact(names, ids, scanner, phones, addresss, dayBirthdays, monthBirthdays, yearBirthdays);

            } else if ("2".equals(menu)) {
                deleteContact(ids, scanner);

            } else if ("3".equals(menu)) {
                searchContact(names, scanner, phones, addresss, dayBirthdays, monthBirthdays, yearBirthdays);

            } else if ("4".equals(menu)) {
                showList(names, ids, phones, addresss, dayBirthdays, monthBirthdays, yearBirthdays);

            } else if ("6".equals(menu)) {
                sortList(names, ids, scanner, phones, addresss, dayBirthdays, monthBirthdays, yearBirthdays);

            } else {
                System.out.println("\nНеверный пункт меню! Повторите!");
            }
        }
    }

    private static void showList(String[] names, boolean[] ids, String[] phones, String[] addresss, int[] dayBirthdays, int[] monthBirthdays, int[] yearBirthdays) {
        System.out.println("\nСписок всех контактов:");
        System.out.println();
        System.out.println("| Id |             Name            |    Phone    |         Adress         |  Birthday |");
        System.out.println("---------------------------------------------------------------------------------------");
        for (int i = 0; i < ids.length; i++) {
            if (ids[i]) {
                System.out.printf("| " + i + " | " + "%30s", names[i] + " |");
                System.out.printf("%15s", phones[i] + " |");
                System.out.printf("%25s", addresss[i] + " |");
                System.out.printf(" %10s", dayBirthdays[i] + "." + monthBirthdays[i] + "." + yearBirthdays[i] + " |");
                System.out.println();
            }
        }
        System.out.println("---------------------------------------------------------------------------------------");
    }

    public static void addContact(String[] names, boolean[] ids, Scanner scanner, String[] phones, String[] addresss, int[] dayBirthdays, int[] monthBirthdays, int[] yearBirthdays) {
        System.out.println("\nДобавление контакта:");

        System.out.println("Введите ФИО");
        String name = scanner.nextLine();
        int id = findId(ids);
        names[id] = name;
        ids[id] = true;

        System.out.println("Введите номер телефона");
        String number = scanner.nextLine();
        phones[id] = number;

        System.out.println("Введите адрес");
        String adress = scanner.nextLine();
        addresss[id] = adress;

        System.out.println("Введите дату рождения:");
        System.out.println("День рождения");
        int dayBirthday = Integer.valueOf(scanner.nextLine());
        dayBirthdays[id] = dayBirthday;

        System.out.println("Месяц рождения");
        int monthBirthday = Integer.valueOf(scanner.nextLine());
        monthBirthdays[id] = monthBirthday;

        System.out.println("Год рождения");
        int yearBirthday = Integer.valueOf(scanner.nextLine());
        yearBirthdays[id] = yearBirthday;

    }

    public static void deleteContact(boolean[] ids, Scanner scanner) {
        System.out.println("\nУдаление контакта:");
        System.out.println("Введите ID контакта для удаления:");
        int id = Integer.valueOf(scanner.nextLine());
        ids[id] = false;
    }

    public static void searchContact(String[] names, Scanner scanner, String[] phones, String[] addresss, int[] dayBirthdays, int[] monthBirthdays, int[] yearBirthdays) {
        System.out.println("\nПоиск контакта:");
        System.out.println("Введите фамилию для поиска:");
        String name = scanner.nextLine();

        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.printf("| " + i + " - " + "%30s", name + " |");
                System.out.printf("%15s", phones[i] + " |");
                System.out.printf("%25s", addresss[i] + " |");
                System.out.printf(" %10s", dayBirthdays[i] + "." + monthBirthdays[i] + "." + yearBirthdays[i] + " |");
                System.out.println();
                System.out.println("---------------------------------------------------------------------------------------");
            } else {
                System.out.println("Фамилия не найдена");
                break;
            }
        }
    }

    public static void sortList(String[] names, boolean[] ids, Scanner scanner, String[] phones, String[] addresss, int[] dayBirthdays, int[] monthBirthdays, int[] yearBirthdays) {
        while (true) {
            System.out.println("\nСортировать контакты:");
            System.out.println("Введите значение для сортировки:");
            System.out.println("1. Сортироввать по имени");
            System.out.println("2. Сортироввать по дню рождения");
            System.out.println("3. Сортироввать по месяцу рождения");
            System.out.println("4. Сортироввать по году рождения");
            System.out.println("0. Не сортировать. Назад в меню");

            String sort = scanner.nextLine();
            if ("0".equals(sort)) {
                break;
            } else if ("1".equals(sort)) {
                sortCompare(names);

            } else if ("2".equals(sort)) {
                sortMas(dayBirthdays);

            } else if ("3".equals(sort)) {
                sortMas(monthBirthdays);

            } else if ("4".equals(sort)) {
                sortMas(yearBirthdays);

            } else {
                System.out.println("\nНеверный пункт меню! Повторите!");
            }
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


    public static void sortCompare(String[] names) {
        for (int b = 0; b < names.length; b++) {
            for (int a = b + 1; a < names.length; a++) {
                if (names[a].compareTo(names[b]) < 0) {    // если требуемый порядок следования не соблюдается, поменять элементы местами
                    String t = names[b];
                    names[b] = names[a];
                    names[a] = t;
                }
            }
        }
    }

    public static void sortCompare2(String[] names,int[] dayBirthdays, int[] monthBirthdays, int[] yearBirthdays) {
        for (int b = 0; b < names.length; b++) {
            for (int a = b + 1; a < names.length; a++) {
                if (names[a].compareTo(names[b]) < 0) {    // если требуемый порядок следования не соблюдается, поменять элементы местами
                    String t = names[b];
                    names[b] = names[a];
                    names[a] = t;
                }
            }
        }
    }

}





// http://prologistic.com.ua/primer-sortirovki-s-pomoshh-yu-java-comparable-i-comparator.html