package by.mix;

/**
 * телефонный справочник
 */

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Main37 {
    public static int MAX = 5;
    public static String IDS = "id.Serik";
    public static String NAMES = "names.Serik";
    public static String ADDRESS = "address.Serik";
    public static String PHONES = "phones.Serik";
    public static String DAYBIRTHDAYS = "daybirthdays.Serik";
    public static String MONTHBIRTHDAYS = "monthbirthdays.Serik";
    public static String YEARSHBIRTHDAYS = "yearbirthdays.Serik";
    public static String DELIMITER = ";";
    public static String ENDOFSTRING = "\r\n";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Scanner scanner = new Scanner(System.in);
        String[] names = readStringFromFile(NAMES);
        boolean[] ids = readBooleanFromFile(IDS);
        String[] phones = readStringFromFile(PHONES);
        String[] addresses = readStringFromFile(ADDRESS);
        int[] dayBirthdays = readIntFromFile(DAYBIRTHDAYS);
        int[] monthBirthdays = readIntFromFile(MONTHBIRTHDAYS);
        int[] yearBirthdays = readIntFromFile(YEARSHBIRTHDAYS);


        while (true) {
            System.out.println("\n- Телефонный справочник. Введите значение:");
            System.out.println("1. Добавить контакт");
            System.out.println("2. Удалить контакт");
            System.out.println("3. Поиск контакта");
            System.out.println("4. Вывести все контакты");
            System.out.println("5. Редактировать контакт");
            System.out.println("6. Сортировать контакты");
            System.out.println("7. Экспортировать в CSV");
            System.out.println("0. Выход");
            String menu = scanner.nextLine();
            if ("0".equals(menu)) {
                saveToFile(ids, IDS);
                saveToFile(names, NAMES);
                saveToFile(phones, PHONES);
                saveToFile(addresses, ADDRESS);
                saveToFile(dayBirthdays, DAYBIRTHDAYS);
                saveToFile(monthBirthdays, MONTHBIRTHDAYS);
                saveToFile(yearBirthdays, MONTHBIRTHDAYS);
                break;
            } else if ("1".equals(menu)) {
                addContact(names, ids, scanner, phones, addresses, dayBirthdays, monthBirthdays, yearBirthdays);

            } else if ("2".equals(menu)) {
                deleteContact(ids, scanner);

            } else if ("3".equals(menu)) {
                searchContact(names, scanner, phones, addresses, dayBirthdays, monthBirthdays, yearBirthdays);

            } else if ("4".equals(menu)) {
                showList(names, ids, phones, addresses, dayBirthdays, monthBirthdays, yearBirthdays);

            } else if ("6".equals(menu)) {
                sortList(names, ids, scanner, phones, addresses, dayBirthdays, monthBirthdays, yearBirthdays);

            } else if ("7".equals(menu)) {
                generateCsvFile(names, ids, phones, addresses, dayBirthdays, monthBirthdays, yearBirthdays);

            } else {
                System.out.println("\nНеверный пункт меню! Повторите!");
            }
        }
    }

    public static void generateCsvFile(String[] names, boolean[] ids, String[] phones, String[] addresses, int[] dayBirthdays, int[] monthBirthdays, int[] yearBirthdays) throws IOException {

        //String s = "ID;Name;Phone;Address;dayBirthdays;monthBirthdays;yearBirthdays";
        String s = "ОХОХО;Name;Phone\n5;7;8";
        /*for (int i = 0; i < ids.length; i++){
            if (ids[i]){
                s += ENDOFSTRING + i + DELIMITER + names [i] + DELIMITER + phones[i] + DELIMITER +
                        addresses[i] + DELIMITER + dayBirthdays[i] + DELIMITER + monthBirthdays[i] + DELIMITER + yearBirthdays[i];
            }
        }*/
        FileUtils.writeStringToFile(new File("ex.csv"), new String(s.getBytes(Charset.forName("UTF-8")), Charset.forName("UTF-8")));
    }

    public static void saveToFile(String[] mas, String fileName) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
        objectOutputStream.writeObject(mas);
        objectOutputStream.close();
    }

    public static void saveToFile(int[] mas, String fileName) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
        objectOutputStream.writeObject(mas);
        objectOutputStream.close();
    }

    public static void saveToFile(boolean[] mas, String fileName) throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(fileName));
        objectOutputStream.writeObject(mas);
        objectOutputStream.close();
    }

    public static String[] readStringFromFile(String fileName) throws IOException, ClassNotFoundException {
        File file = new File(fileName);
        if (file.exists()) {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
            return (String[]) objectInputStream.readObject();
        } else {
            return new String[MAX];
        }
    }

    public static int[] readIntFromFile(String fileName) throws IOException, ClassNotFoundException {
        File file = new File(fileName);
        if (file.exists()) {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
            return (int[]) objectInputStream.readObject();
        } else {
            return new int[MAX];
        }
    }

    public static boolean[] readBooleanFromFile(String fileName) throws IOException, ClassNotFoundException {
        File file = new File(fileName);
        if (file.exists()) {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
            return (boolean[]) objectInputStream.readObject();
        } else {
            return new boolean[MAX];
        }
    }


    private static void showList(String[] names, boolean[] ids, String[] phones, String[] addresss, int[] dayBirthdays, int[] monthBirthdays, int[] yearBirthdays) {
        System.out.println("\nСписок всех контактов:");
        System.out.println();
        System.out.println("| Id |             Name            |    Phone    |         Address         |  Birthday |");
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
        if (id < MAX && ids[id]) {
            ids[id] = false;
            System.out.println("Контакт удален");
        } else {
            System.out.println("Такого ID не существует");
        }
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
                sortCompareNames(ids, names);

            } else if ("2".equals(sort)) {
                sortCompareBirthday(ids, names, dayBirthdays, monthBirthdays, yearBirthdays);
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
        for (int i = 1; i < fmas.length; i++)
            for (int j = fmas.length - 1; j >= i; j--) {
                if (fmas[j - 1] > fmas[j]) {           // если требуемый порядок следования не соблюдается, поменять элементы местами
                    int t = fmas[j - 1];
                    fmas[j - 1] = fmas[j];
                    fmas[j] = t;
                }
            }
    }


    /*public static void sortCompare(String[] names) {
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareTo(names[i]) < 0) {    // если требуемый порядок следования не соблюдается, поменять элементы местами
                    String t = names[i];
                    names[i] = names[j];
                    names[j] = t;
                }
            }
        }
    }*/


    public static void sortCompareNames(boolean[] ids, String[] names) {
        int minI = 0;
        String[] namesSearch = new String[ids.length];
        int k = 0;
        for (int i = 0; i < ids.length; i++) {
            if (ids[i]) {
                for (int i1 = 0; i1 < ids.length; i1++) {
                    if (ids[i1] && !findIn(names[i1], namesSearch)) {
                        minI = i1;
                        break;
                    }
                }

                for (int j = 0; j < ids.length; j++) {
                    if (ids[j] && !findIn(names[j], namesSearch) && names[j].compareTo(names[minI]) <= 0) {
                        minI = j;
                    }
                }
                namesSearch[k] = names[minI];
                k++;
                System.out.println(minI + " " + names[minI]);
            }
        }
    }

    public static void sortCompareBirthday(boolean[] ids, String[] names, int[] dayBirthdays, int[] monthBirthdays, int[] yearBirthdays) {
        int minI = 0;
        String[] namesSearch = new String[ids.length];
        int k = 0;
        for (int i = 0; i < ids.length; i++) {
            if (ids[i]) {
                for (int i1 = 0; i1 < ids.length; i1++) {
                    if (ids[i1] && !findIn(dateToString(yearBirthdays[i1], monthBirthdays[i1], dayBirthdays[i1]), namesSearch)) {
                        minI = i1;
                        break;
                    }
                }

                for (int j = 0; j < ids.length; j++) {
                    if (ids[j] && !findIn(dateToString(yearBirthdays[j], monthBirthdays[j], dayBirthdays[j]), namesSearch) &&
                            dateToString(yearBirthdays[j], monthBirthdays[j], dayBirthdays[j]).
                                    compareTo(dateToString(yearBirthdays[minI], monthBirthdays[minI], dayBirthdays[minI])) <= 0) {
                        minI = j;
                    }
                }
                namesSearch[k] = dateToString(yearBirthdays[minI], monthBirthdays[minI], dayBirthdays[minI]);
                k++;
                System.out.println(minI + " " + names[minI] + " " + dateToString(yearBirthdays[minI], monthBirthdays[minI], dayBirthdays[minI]));
            }
        }
    }

    public static String dateToString(int dayBirthdays, int monthBirthdays, int yearBirthdays) {
        String s = yearBirthdays + "-";
        if (String.valueOf(monthBirthdays).length() == 1) {
            s += "0";
        }
        s += monthBirthdays + "-";

        if (dayBirthdays < 10) {
            s += "0";
        }
        s += dayBirthdays;
        return s;
    }

    public static void renameContact(boolean[] ids, Scanner scanner, String[] names, String[] addresses, int[] dayBirthdays, int[] monthBirthdays, int[] yearBirthdays) {
        System.out.println("Введите ID для редактирования");
        int id = Integer.valueOf(scanner.nextLine());

    }

    public static boolean findIn(String s, String[] m) {
        for (int i = 0; i < m.length; i++) {
            if (s.equals(m[i])) {
                return true;
            }
        }
        return false;
    }

}


// http://prologistic.com.ua/primer-sortirovki-s-pomoshh-yu-java-comparable-i-comparator.html