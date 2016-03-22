package by.mix.MyStringOOP;

/**
 * Created by st on 22.03.2016.
 */

// Разработать свой класс String с методами equals, concat, length, substring


public class Main {
    public static void main(String[] args) {
        MyString[] myStrings = new MyString[2];

        for (int i = 0; i < myStrings.length; i++) {
            myStrings[i] = new MyString("Der");
            myStrings[i] = new MyString("Dir");
        }
        myStrings[0].equals(myStrings[1]);
        System.out.println();
    }
}