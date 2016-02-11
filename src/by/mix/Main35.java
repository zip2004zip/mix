package by.mix;

/**
 * одномерный массив переводим в множество и после этого создаем новый массив,
 * его так же переводим в множество и прибовляем к предыдущему множеству
 * и так 10 раз
 */

import by.mix.utils.MasUtils;

import java.util.Random;

public class Main35 {
    public static int NULL_ELEMENT = -1;        // это исспользуем для статической константы именнованная она есть дальше в нескольких местах

    public static void main(String[] args) {


        int[] m = initMas(15);
        MasUtils.printMas(m);
        MasUtils.printMas(getset(m));
        System.out.println();
        int[] o = getset(m);
        MasUtils.printMas(o);
        for (int i = 0; i < 10; i++) {
            m = initMas(15);
            o = getset(mergeMas(o, m));
            System.out.println(i + 1);
            MasUtils.printMas(m);
            MasUtils.printMas(o);
        }
    }


    public static int[] initMas(int max) {
        int[] m = new int[max];
        Random random = new Random();
        for (int i = 0; i < m.length; i++) {
            m[i] = random.nextInt(41);
        }
        return m;
    }


    public static int[] getset(int[] m) {
        int[] m2 = new int[m.length];
        for (int i = 0; i < m2.length; i++) {
            m2[i] = NULL_ELEMENT;
        }
        int j = 0;

        for (int i = 0; i < m.length; i++) {       // переменная для счетчика
            if (!findMas(m[i], m2)) {
                m2[j] = m[i];
                j++;
            }
        }

        int[] r = new int[calcLength(m2)];           // тут создаем массив той длины что нам нужно без -1
        for (int i = 0; i < r.length; i++) {
            r[i] = m2[i];
        }
        return r;
    }

    public static boolean findMas(int x, int[] m) {
        for (int i = 0; i < m.length; i++) {
            if (x == m[i]) {
                return true;
            }
        }
        return false;
    }

    public static int calcLength(int[] m) {
        int length = 0;
        for (int i = 0; i < m.length; i++) {
            if (m[i] != NULL_ELEMENT) {
                length++;
            }
        }
        return length;
    }

    public static int[] mergeMas(int[] m1, int[] m2) {
        int[] m = new int[m1.length + m2.length];


        for (int i = 0; i < m1.length; i++) {
            m[i] = m1[i];
        }
        for (int i = m1.length; i < m.length; i++) {
            m[i] = m2[i - m1.length];
        }
        return m;
    }
}






