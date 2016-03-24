package by.mix.ProcedyrnoeProgramirovani;


// многомерный массив посчитать таблицу умножения от 2 до 9
// вывести 15 случайных примеров
// при этом повторяющие 2*3 = 3*2 считать повторяющимися и не выводить повторно


import java.util.Random;

public class Main30 {
    public static void main(String[] args) {

        int b = 8;
        int c = 8;
        int[][] tabl = new int[b][c];

        initMas(tabl);
        printMas(tabl);
        sluchajnost(tabl);
        randMas(tabl);

    }

    public static void initMas(int[][] fmas) {
        for (int i = 0; i < fmas.length; i++) {
            for (int j = 0; j < fmas[i].length; j++) {
                fmas[i][j] = (i + 2) * (j + 2);
            }
        }
    }

    public static void printMas(int[][] fmas) {
        System.out.printf("  ");
        for (int i = 0; i < 8; i++) {
            System.out.printf("%5d", i + 2);
        }
        System.out.println();
        System.out.println("     -------------------------------------");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + 2 + " |");
            for (int j = 0; j < 8; j++) {
                System.out.printf("%5d", fmas[i][j]);
            }
            System.out.println();
        }
    }

    public static void sluchajnost(int[][] fmas) {      // вывести 15 случайных примеров
        System.out.println("\nСлучайные");
        Random random = new Random();
        for (int k = 0; k < 15; k++) {
            int i = random.nextInt(7);
            int j = random.nextInt(7);
            System.out.println((k + 1) + ":" + (i + 2) + "*" + (j + 2) + "=" + fmas[i][j]);
        }
    }

    public static void randMas(int[][] fmas) {               // вывести 15 случайных примеров без повторений
        System.out.println("\nслучайные без повторов");
        int[][] used = new int[8][8];
        Random random = new Random();
        int c = 0;
        int iter = 0;
        for (; ; ) {
            for (; ; ) {
                iter++;
                int i = random.nextInt(7);
                int j = random.nextInt(7);
                if (used[i][j] == 0) {
                    c++;
                    used[i][j] = 1;
                    used[j][i] = 1;
                    System.out.println(c + ":" + (i + 2) + "*" + (j + 2) + "=" + fmas[i][j]);
                    break;
                }
            }
            if (c == 15) {
                break;
            }
        }
        System.out.println("\nКоличество раз повторений " + iter);
    }
}





