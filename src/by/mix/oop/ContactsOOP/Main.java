package by.mix.oop.ContactsOOP;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Sergei on 03.04.2016.
 */

public class Main {
    public static int MAX = 5;
    public static String IDS = "id.Serik";
    public static String NAMES = "names.Serik";
    public static String ADDRESSES = "address.Serik";
    public static String PHONES = "phones.Serik";
    public static String DAY_BIRTHDAYS = "daybirthdays.Serik";
    public static String MONTH_BIRTHDAYS = "monthbirthdays.Serik";
    public static String YEAR_BIRTHDAYS = "yearbirthdays.Serik";
    public static String DELIMITER = ";";
    public static String END_OF_STRING = "\r\n";
    public static String NAME_FILE = "Contacts.csv";

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        BookFacade bookFacade = new BookFacadeImpl(new BookServiceImpl());
      //  bookFacade.add(new Contacts("1", "2"));




        Scanner scanner = new Scanner(System.in);
        String[] names = readStringFromFile(NAMES);
        boolean[] ids = readBooleanFromFile(IDS);
        String[] phones = readStringFromFile(PHONES);
        String[] addresses = readStringFromFile(ADDRESSES);
        int[] dayBirthdays = readIntFromFile(DAY_BIRTHDAYS);
        int[] monthBirthdays = readIntFromFile(MONTH_BIRTHDAYS);
        int[] yearBirthdays = readIntFromFile(YEAR_BIRTHDAYS);

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
                saveToFile(addresses, ADDRESSES);
                saveToFile(dayBirthdays, DAY_BIRTHDAYS);
                saveToFile(monthBirthdays, MONTH_BIRTHDAYS);
                saveToFile(yearBirthdays, YEAR_BIRTHDAYS);
                break;
            } else if ("1".equals(menu)) {
                addContact(ids, names, scanner, phones, addresses, dayBirthdays, monthBirthdays, yearBirthdays);

            } else if ("2".equals(menu)) {
                deleteContact(ids, scanner);

            } else if ("3".equals(menu)) {
                searchContact(names, scanner, phones, addresses, dayBirthdays, monthBirthdays, yearBirthdays);

            } else if ("4".equals(menu)) {
                showList(ids, names, phones, addresses, dayBirthdays, monthBirthdays, yearBirthdays);

            } else if ("5".equals(menu)) {
                renameContact(ids, names, scanner, phones, addresses, dayBirthdays, monthBirthdays, yearBirthdays);

            } else if ("6".equals(menu)) {
                sortList(ids, names, scanner, phones, addresses, dayBirthdays, monthBirthdays, yearBirthdays);

            } else if ("7".equals(menu)) {
                saveToCsvFile(ids, names, phones, addresses, dayBirthdays, monthBirthdays, yearBirthdays);

            } else {
                System.out.println("\nНеверный пункт меню! Повторите!");
            }
        }
    }

    public static void saveToCsvFile(boolean[] ids, String[] names, String[] phones, String[] addresses, int[] dayBirthdays, int[] monthBirthdays, int[] yearBirthdays) throws IOException {

        String s = "sep=;\n" + "ID" + DELIMITER + "Name" + DELIMITER + "Phone" + DELIMITER + "Address" + DELIMITER + "dayBirthdays" + DELIMITER + "monthBirthdays" + DELIMITER + "yearBirthdays" + END_OF_STRING;
        for (int i = 0; i < MAX; i++) {
            if (ids[i]) {
                s += i + DELIMITER + names[i] + DELIMITER + phones[i] + DELIMITER +
                        addresses[i] + DELIMITER + dayBirthdays[i] + DELIMITER + monthBirthdays[i] + DELIMITER + yearBirthdays[i] + END_OF_STRING;
            }
        }
        FileUtils.writeStringToFile(new File(NAME_FILE), s);
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

    private static void showList(boolean[] ids, String[] names, String[] phones, String[] addresses, int[] dayBirthdays, int[] monthBirthdays, int[] yearBirthdays) {
        System.out.println("\nСписок всех контактов:");
        System.out.println();
        System.out.println("| Id |             Name            |    Phone    |         Address         |  Birthday |");
        System.out.println("---------------------------------------------------------------------------------------");
        for (int i = 0; i < ids.length; i++) {
            if (ids[i]) {
                System.out.printf("| " + i + " | " + "%30s", names[i] + " |");
                System.out.printf("%15s", phones[i] + " |");
                System.out.printf("%25s", addresses[i] + " |");
                System.out.printf(" %10s", dayBirthdays[i] + "." + monthBirthdays[i] + "." + yearBirthdays[i] + " |");
                System.out.println();
            }
        }
        System.out.println("---------------------------------------------------------------------------------------");
    }

    public static void addContact(boolean[] ids, String[] names, Scanner scanner, String[] phones, String[] addresses, int[] dayBirthdays, int[] monthBirthdays, int[] yearBirthdays) {
        System.out.println("\nДобавление контакта:");

        System.out.println("Введите ФИО");
        String name = scanner.nextLine();
        int id = findId(ids);
        names[id] = name;
        ids[id] = true;

        System.out.println("Введите номер телефона");
        String phone = scanner.nextLine();
        phones[id] = phone;

        System.out.println("Введите адрес");
        String address = scanner.nextLine();
        addresses[id] = address;

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

    public static void searchContact(String[] names, Scanner scanner, String[] phones, String[] addresses, int[] dayBirthdays, int[] monthBirthdays, int[] yearBirthdays) {
        System.out.println("\nПоиск контакта:");
        System.out.println("Введите фамилию для поиска:");
        String name = scanner.nextLine();

        for (int i = 0; i < names.length; i++) {
            if (name.equals(names[i])) {
                System.out.println("---------------------------------------------------------------------------------------");
                System.out.printf("| " + i + " - " + "%30s", name + " |");
                System.out.printf("%15s", phones[i] + " |");
                System.out.printf("%25s", addresses[i] + " |");
                System.out.printf(" %10s", dayBirthdays[i] + "." + monthBirthdays[i] + "." + yearBirthdays[i] + " |");
                System.out.println();
                System.out.println("---------------------------------------------------------------------------------------");
            } else {
                System.out.println("Фамилия не найдена");
                break;
            }
        }
    }

    public static void sortList(boolean[] ids, String[] names, Scanner scanner, String[] phones, String[] addresses, int[] dayBirthdays, int[] monthBirthdays, int[] yearBirthdays) {
        while (true) {
            System.out.println("\nСортировать контакты:");
            System.out.println("Введите значение для сортировки:");
            System.out.println("1. Сортироввать по имени");
            System.out.println("2. Сортироввать по дате рождения");
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

    public static void renameContact(boolean[] ids, String[] names, Scanner scanner, String[] phones, String[] addresses, int[] dayBirthdays, int[] monthBirthdays, int[] yearBirthdays) {
        //   boolean check = true;
        //    while (check) {
        while (true) {
            System.out.println("\nВведите ID для редактирования:");
            int searchId = Integer.valueOf(scanner.nextLine());
            if (searchId < MAX && ids[searchId]) {
                System.out.println("Контакт найден");
                while (true) {
                    System.out.println("1. Редактировать ФИО");
                    System.out.println("2. Редактировать номер");
                    System.out.println("3. Редактировать адрес");
                    System.out.println("4. Редактировать день рождения");
                    System.out.println("5. Редактировать месяц рождения");
                    System.out.println("6. Редактировать год рождения");
                    System.out.println("0. Не редактировать. Назад в меню");
                    String id = scanner.nextLine();
                    if ("0".equals(id)) {
                        //   check = false;
                        return;
                    } else if ("1".equals(id)) {
                        System.out.println("Введите новое ФИО:");
                        String name = scanner.nextLine();
                        names[searchId] = name;
                        System.out.println("ФИО изменено\n");
                    } else if ("2".equals(id)) {
                        System.out.println("Введите новый номер:");
                        String phone = scanner.nextLine();
                        phones[searchId] = phone;
                        System.out.println("Номер изменен\n");
                    } else if ("3".equals(id)) {
                        System.out.println("Введите новый адрес:");
                        String address = scanner.nextLine();
                        addresses[searchId] = address;
                        System.out.println("Адрес изменен\n");
                    } else if ("4".equals(id)) {
                        System.out.println("Введите новый день рождения:");
                        int dayBirthday = Integer.valueOf(scanner.nextLine());
                        if (dayBirthday > 0 && dayBirthday < 32) {
                            dayBirthdays[searchId] = dayBirthday;
                            System.out.println("День рождения изменен\n");
                        } else {
                            System.out.println("не верный день. Введите от 1 до 31");
                        }
                    } else if ("5".equals(id)) {
                        System.out.println("Введите новый месяц рождения");
                        int monthBirthday = Integer.valueOf(scanner.nextLine());
                        if (monthBirthday > 0 && monthBirthday < 13) {
                            monthBirthdays[searchId] = monthBirthday;
                            System.out.println("Месяц рождения изменен\n");
                        } else {
                            System.out.println("не верный месяц. Введите от 1 до 12");
                        }
                    } else if ("6".equals(id)) {
                        System.out.println("Введите новый год рождения");
                        int yearBirthday = Integer.valueOf(scanner.nextLine());
                        if (yearBirthday <= 2016) {
                            yearBirthdays[searchId] = yearBirthday;
                            System.out.println("Год рождения изменен\n");
                        } else {
                            System.out.println("не верный год. Введите не более 2016");
                        }
                    } else {
                        System.out.println("\nНеверный пункт меню! Повторите!");
                    }
                }
            } else {
                System.out.println("Такого ID не существует");
            }
        }
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
