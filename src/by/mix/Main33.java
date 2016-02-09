package by.mix;

/**
 * двумерный массив переводим в множество
 */

import by.mix.utils.MasUtils;

import java.util.Random;

public class Main33 {
    public static int NULL_ELEMENT = -1;        // это исспользуем для статической константы именнованная она есть дальше в нескольких местах

    public static void main(String[] args) {
        int[][] m = initMas(10, 15);
        MasUtils.printMas(m);
        MasUtils.printMas(getset(m));
    }


    public static int[][] initMas(int max1, int max2) {
        int[][] m = new int[max1][max2];
        Random random = new Random();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = random.nextInt(10);
            }
        }
        return m;
    }


    public static int[] getset(int[][] m) {
        int[] m2 = new int[m.length * m[0].length];
        for (int i = 0; i < m2.length; i++) {
            m2[i] = NULL_ELEMENT;
        }

        int k = 0;

        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) { // переменная для счетчика
                if (!findMas(m[i][j], m2)) {
                    m2[k] = m[i][j];
                    k++;
                }
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
}






