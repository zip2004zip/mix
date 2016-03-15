package by.mix.CatOOP;

import java.util.Scanner;

/**
 * Created by st on 3/10/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cat[] cats = new Cat[2];

        /*Cat cat1 = new Cat();
        cat1.setName("Barsik");
        cat1.setAge(17);
        cat1.setColor("Black");
        cat1.setSex(true);

        Cat cat2 = new Cat();
        cat2.setName("Mashka");
        cat2.setAge(11);
        cat2.setColor("Rigij");
        cat2.setSex(false);*/

        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
            cats[i].setSex(true);
            System.out.println("name");
            cats[i].setName(scanner.nextLine());
            System.out.println("color");
            cats[i].setColor(scanner.nextLine());
            System.out.println("age");
            cats[i].setAge(Integer.valueOf(scanner.nextLine()));
            System.out.println();
        }
        System.out.println();
    }
}
