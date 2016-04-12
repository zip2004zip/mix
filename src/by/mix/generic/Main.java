package by.mix.generic;


import java.util.ArrayList;

/**
 * Created by st on 12.04.2016.
 */
public class Main {
    public static void main(String[] args) {

        PrintGeneric<String > stringPrintGeneric = new PrintGeneric<>("Hello");
        System.out.println(stringPrintGeneric.toString());
        System.out.println(stringPrintGeneric.toString().length());

        PrintGeneric<Integer> integerPrintGeneric = new PrintGeneric<>(10000);
        System.out.println(integerPrintGeneric.toString());
        System.out.println(integerPrintGeneric.getObject().doubleValue());

        /*MyArray<Integer> integerMyArray = new MyArray<>();
        integerMyArray.add(1).add(2).add(3);

        System.out.println(integerMyArray.get(1));*/


        MyArray<Contact> contactMyArray = new MyArray<>();
        contactMyArray.add(new Contact("name 1", "tel 1"));
        contactMyArray.add(new Contact("name 2", "tel 2"));
        contactMyArray.add(new Contact("name 3", "tel 3"));

        ArrayList<String> strings = new ArrayList<>();
        strings.add("123");
        for (int i = 0; i < strings.size(); i++) {
            System.out.println(strings.get(i));
        }
    }
}
