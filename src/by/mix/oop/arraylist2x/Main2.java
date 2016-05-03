package by.mix.oop.arraylist2x;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * Created by st on 03.05.2016.
 * Двухмерный массив неровной случайной размерности случайных чисел используя JCF
 * пример:
 * 12345
 * 12434345
 * 123234
 * 23423424234
 * 23423425
 */


public class Main2 {
    public static void main(String[] args) {

        Collection<Collection<Integer>> collections = new ArrayList<>();
        Random random = new Random();

        int iMax = random.nextInt(15);
        for (int i = 0; i < iMax; i++) {
            int jMax = random.nextInt(20);
            Collection<Integer> integers = new ArrayList<>();
            for (int j = 0; j < jMax; j++) {
                integers.add(random.nextInt(100));
            }
            collections.add(integers);
        }

        // вывод на экран
        for (Collection<Integer> integers : collections) {
            for (Integer integer : integers) {
                System.out.print(integer + " ");
            }
            System.out.println();
        }
    }
}
