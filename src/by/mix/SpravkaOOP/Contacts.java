package by.mix.SpravkaOOP;

import java.io.*;
import java.util.Scanner;

/**
 * Created by st on 3/15/2016.
 */
// https://habrahabr.ru/post/241704/

public class Contacts {
    public static int MAX = 5;
    public static String IDS = "id.dat";
    public static String NAMES = "names.dat";
    public static String ADDRESSES = "addresses.dat";
    public static String PHONES = "phones.dat";
    public static String DAY_BIRTHDAYS = "dbirthdays.dat";
    public static String MONTH_BIRTHDAYS = "mbirthdays.dat";
    public static String YEAR_BIRTHDAYS = "ybirthdays.dat";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        String[] names = readStringFromFile(NAMES);
        String[] phones = readStringFromFile(PHONES);
        String[] addresses = readStringFromFile(ADDRESSES);
        int[] daysOfBirthdays = readIntFromFile(DAY_BIRTHDAYS);
        int[] monthsOfBirthdays = readIntFromFile(MONTH_BIRTHDAYS);
        int[] yearsOfBirthdays = readIntFromFile(YEAR_BIRTHDAYS);

        boolean[] ids = readBooleanFromFile(IDS);

        while (true) {
            System.out.println("*******Contacts manager********");
            System.out.println("Enter your choice: ");
            System.out.println("1-Add");
            System.out.println("2-Delete");
            System.out.println("3-Search");
            System.out.println("4-View all");
            System.out.println("5-Sort contacts");
            System.out.println("0-Exit");
            //System.out.println();
            String mainMenu = scanner.nextLine();

            if ("0".equals(mainMenu)) {
                System.out.println("Bye :)");
                saveToFile(ids, IDS);
                saveToFile(names, NAMES);
                saveToFile(phones, PHONES);
                saveToFile(addresses, ADDRESSES);
                saveToFile(daysOfBirthdays, DAY_BIRTHDAYS);
                saveToFile(monthsOfBirthdays, MONTH_BIRTHDAYS);
                saveToFile(yearsOfBirthdays, YEAR_BIRTHDAYS);
                break;
            } else if ("1".equals(mainMenu)) {
                addContact(scanner, names, phones, addresses, daysOfBirthdays, monthsOfBirthdays, yearsOfBirthdays, ids);
            } else if ("2".equals(mainMenu)) {
                deleteContact(scanner, ids);
            } else if ("4".equals(mainMenu)) {
                viewAllContacts(names, phones, addresses, daysOfBirthdays, monthsOfBirthdays, yearsOfBirthdays, ids);
            } else if ("5".equals(mainMenu)) {
                sortChoice(scanner, ids, names, phones, addresses, daysOfBirthdays, monthsOfBirthdays, yearsOfBirthdays);
            } else {
                System.out.println("Incorrect input");
            }
        }

    }


    public static void printHeader() {
        System.out.println("-------------------------------------------------------------------------------");
        System.out.println("| ID |        NAME       |    PHONE    |         ADDRESS         |  BIRTHDAY  |");
        System.out.println("-------------------------------------------------------------------------------");

    }
    public static void printFooter(){
        System.out.println("-------------------------------------------------------------------------------");
    }

    public static void printLine(int id, String name, String phone, String address, int dayOfBirthday, int monthOfBirthday,
                                 int yearOfBirthday){
        System.out.printf("|" + "%5s", id + "|");
        System.out.printf("%20s", name + "|");
        System.out.printf("%14s", phone + "|");
        System.out.printf("%26s", address + "|");
        System.out.printf("%13s", dayOfBirthday + "." + monthOfBirthday + "." + yearOfBirthday + "|");
        System.out.println();

    }

    public static void viewAllContacts(String[] names, String[] phones, String[] addresses, int[] daysOfBirthdays, int[] monthsOfBirthdays,
                                       int[] yearsOfBirthdays, boolean[] ids) {
        System.out.println("All records: ");
        printHeader();
        for (int i = 0; i < ids.length; i++) {
            if (ids[i]) {
                System.out.printf("|" + "%5s", i + "|");
                System.out.printf("%20s", names[i] + "|");
                System.out.printf("%14s", phones[i] + "|");
                System.out.printf("%26s", addresses[i] + "|");
                System.out.printf("%13s", daysOfBirthdays[i] + "." + monthsOfBirthdays[i] + "." + yearsOfBirthdays[i] + "|");
                System.out.println();
            }
        }
        printFooter();
    }

    public static void addContact(Scanner scanner, String[] names, String[] phones, String[] addresses, int[] daysOfBirthdays,
                                  int[] monthsOfBirthdays, int[] yearsOfBirthdays, boolean[] ids) {
        System.out.println("|Adding|");
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter phone");
        String phone = scanner.nextLine();
        System.out.println("Enter address");
        String address = scanner.nextLine();
        System.out.println("Enter date of birthday:");
        System.out.println("Enter day");
        int dayOfBirthday = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter month");
        int monthOfBirthday = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter year");
        int yearOfBirthday = Integer.valueOf(scanner.nextLine());

        int id = findId(ids);
        names[id] = name;
        phones[id] = phone;
        addresses[id] = address;
        daysOfBirthdays[id] = dayOfBirthday;
        monthsOfBirthdays[id] = monthOfBirthday;
        yearsOfBirthdays[id] = yearOfBirthday;
        ids[id] = true;
    }

    public static void deleteContact(Scanner scanner, boolean[] ids) {
        System.out.println("|Deleting|");
        System.out.println("Enter ID number:");
        int id = Integer.valueOf(scanner.nextLine());
        if (id < MAX && ids[id]) {
            ids[id] = false;
            System.out.println("Contact deleted!");
        } else {
            System.out.println("There is no contact with this ID!!!");
        }

    }

    public static void sortChoice(Scanner scanner, boolean[] ids, String[] names, String[] phones, String[] addresses, int[] daysOfBirthdays,
                                  int[] monthsOfBirthdays, int[] yearsOfBirthdays) {
        while (true) {
            System.out.println("|Sorting|");
            System.out.println("1-Sort by NAME");
            System.out.println("2-Sort by Year of Birth");
            System.out.println("0-Back to previous menu");

            String sortMenu = scanner.nextLine();
            if ("0".equals(sortMenu)) {
                break;
            } else if ("1".equals(sortMenu)) {
                sortViewByName(ids, names, phones, addresses, daysOfBirthdays, monthsOfBirthdays, yearsOfBirthdays);
            } else if ("2".equals(sortMenu)) {

            } else {
                System.out.println("Incorrect input");
            }
        }

    }

    public static void sortViewByName(boolean[] ids, String[] names, String[] phones, String[] addresses, int[] daysOfBirthdays,
                                      int[] monthsOfBirthdays, int[] yearsOfBirthdays){
        int minI = 0;
        int k = 0;
        String[] namesSearch = new String[ids.length];

        System.out.println("Sorted by NAME contacts:");

        printHeader();

        for(int i = 0; i < ids.length; i++){
            if(ids[i]){
                for(int i1 = 0; i1 < ids.length; i1++){
                    if (ids[i1] && !findIn(names[i1], namesSearch)) {
                        minI = i1;
                        break;
                    }
                }

                for(int j = 0; j < ids.length; j++){
                    if(ids[j] && !findIn(names[j], namesSearch) && names[j].compareTo(names[minI]) <= 0){
                        minI = j;
                    }
                }
                namesSearch[k] = names[minI];
                k++;

                printLine(minI, names[minI], phones[minI], addresses[minI], daysOfBirthdays[minI], monthsOfBirthdays[minI], yearsOfBirthdays[minI]);

            }
        }

        printFooter();


    }
    //Belong to method addContact()
    //Searching place(id) for a new contact
    public static int findId(boolean[] ids) {
        for (int i = 0; i < ids.length; i++) {
            if (!ids[i]) {
                return i;
            }
        }
        System.out.println("ERROR");
        return -1;

    }

    //Belong to sorting
    public static boolean findIn(String s, String[] m){
        for(int i = 0; i < m.length; i++){
            if(s.equals(m[i])){
                return true;
            }
        }
        return false;
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
        if(file.exists()) {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
            return (String[]) objectInputStream.readObject();
        } else {
            return new String[MAX];
        }
    }

    public static int[] readIntFromFile(String fileName) throws IOException, ClassNotFoundException {
        File file = new File(fileName);
        if(file.exists()) {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
            return (int[]) objectInputStream.readObject();
        } else {
            return new int[MAX];
        }
    }

    public static boolean[] readBooleanFromFile(String fileName) throws IOException, ClassNotFoundException {
        File file = new File(fileName);
        if(file.exists()) {
            ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(fileName));
            return (boolean[]) objectInputStream.readObject();
        } else {
            return new boolean[MAX];
        }
    }
}

