package by.mix.oop.MyStringOOP;

/**
 * Created by st on 22.03.2016.
 */

// Разработать свой класс String с методами equals, concat, length, substring


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");
        StringBuffer s = new StringBuffer("0");
        for (int i = 0; i <= 9; i++) {
            s.append(i).append(",");
        }

        MyString myString = new MyString("123");

        // ������� 1
        myString.append(new MyString("456")).append(new MyString("789 "));

        // ������� 2
        myString = myString.append(new MyString("456"));
        myString = myString.append(new MyString("789 "));

        // ������� 3
        myString.append(new MyString("456"));
        myString.append(new MyString("789"));

        System.out.println(myString.getS());

        MyString myString2 = myString.substring(0, 11);

        System.out.println(myString2.getS());


    }
}