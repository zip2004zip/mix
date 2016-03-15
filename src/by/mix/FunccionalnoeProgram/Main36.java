package by.mix.FunccionalnoeProgram;

/**
 * указатели в java
 */

import by.mix.utils.MasUtils;

import java.util.Random;

public class Main36 {

    public static void main(String[] args) {

        int[] m = initMas(10);
        MasUtils.printMas(m);
        int i = 1;
        int next = 0;
        while (true) {
            if (i == 21) {
                break;
            }
            System.out.println(i + ":" + m[next]);
            next = m[next];
            i++;
        }
    }


    public static int[] initMas(int max) {
        int[] m = new int[max];
        Random random = new Random();
        for (int i = 0; i < m.length; i++) {
            m[i] = random.nextInt(10);
        }
        return m;
    }

}






