package by.mix.oop.arraylist2x;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/**
 * Created by st on 03.05.2016.
 * тестируем время добавления элементов в начало и конец массива
 */

public class Tester {
    public static Integer MAX = 1000000;

    public static void main(String[] args) {
        Tester.testArrayListEnd();
        Tester.testLinkedListEnd();
        Tester.testArrayListBegin();
        Tester.testLinkedListBegin();
        Tester.testArrayListRandom();
        Tester.testLinkedListRandom();
    }

    public static void testArrayListEnd() {
        long t1 = System.currentTimeMillis();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < MAX; i++) {
            integers.add(i);
        }
        System.out.println(integers.size());
        long t2 = System.currentTimeMillis();
        System.out.println("testArraylistEnd msec: " + (t2 - t1));
    }

    public static void testLinkedListEnd() {
        long t1 = System.currentTimeMillis();
        LinkedList<Integer> integers = new LinkedList<>();
        for (int i = 0; i < MAX; i++) {
            integers.add(i);
        }
        System.out.println(integers.size());
        long t2 = System.currentTimeMillis();
        System.out.println("testLinkedListEnd msec: " + (t2 - t1));
    }

    public static void testArrayListBegin() {
        long t1 = System.currentTimeMillis();
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < MAX; i++) {
            integers.add(0, i);
        }
        System.out.println(integers.size());
        long t2 = System.currentTimeMillis();
        System.out.println("testArrayListBegin msec: " + (t2 - t1));
    }

    public static void testLinkedListBegin() {
        long t1 = System.currentTimeMillis();
        LinkedList<Integer> integers = new LinkedList<>();
        for (int i = 0; i < MAX; i++) {
            integers.addFirst(i);
        }
        System.out.println(integers.size());
        long t2 = System.currentTimeMillis();
        System.out.println("testLinkedListBegin msec: " + (t2 - t1));
    }

    public static void testArrayListRandom() {
        long t1 = System.currentTimeMillis();
        ArrayList<Integer> integers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < MAX; i++) {
            integers.add(integers.size() == 0 ? 0 : random.nextInt(integers.size()));
        }
        System.out.println(integers.size());
        long t2 = System.currentTimeMillis();
        System.out.println("testArrayListRandom msec: " + (t2 - t1));
    }

    public static void testLinkedListRandom() {
        long t1 = System.currentTimeMillis();
        LinkedList<Integer> integers = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < MAX; i++) {
            integers.add(integers.size() == 0 ? 0 : random.nextInt(integers.size()));
        }
        System.out.println(integers.size());
        long t2 = System.currentTimeMillis();
        System.out.println("testLinkedListRandom msec: " + (t2 - t1));
    }
}