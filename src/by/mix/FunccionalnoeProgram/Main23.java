package by.mix.FunccionalnoeProgram;


// многомерный массив посчитать таблицу умножения


public class Main23 {
    public static void main(String[] args) {
        int[][] tabl = new int[11][15];

        initMas(tabl);
        printMas(tabl);
    }

    public static void initMas(int[][] fmas) {
        for (int i = 0; i < fmas.length; i++) {
            for (int j = 0; j < fmas[i].length; j++) {
                fmas[i][j] = (i + 1) * (j + 1);
            }
        }
    }

    public static void printMas(int[][] fmas) {
        for (int i = 0; i < fmas.length; i++) {
            for (int j = 0; j < fmas[i].length; j++) {
                System.out.printf ("%7d", fmas[i][j]);
            }
            System.out.println();
        }
    }
}