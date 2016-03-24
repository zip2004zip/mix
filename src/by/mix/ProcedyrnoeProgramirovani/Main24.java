package by.mix.ProcedyrnoeProgramirovani;


// многомерный массив посчитать таблицу умножения и вывести любое число заданное


public class Main24 {
    public static void main(String[] args) {
        int[][] tabl = new int[11][15];
        int a = 1;
        int b = 143;

        initMas(tabl);
        printMas(tabl);
        cifrMas(tabl, a, b);

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
                System.out.printf("%7d", fmas[i][j]);
            }
            System.out.println();
        }
    }

    public static void cifrMas(int[][] fmas, int chislo1, int chislo2) {


        for (int i = 0; i < fmas.length; i++) {
            for (int j = 0; j < fmas[i].length; j++) {
                if (fmas[i][j] == chislo1 || fmas[i][j] == chislo2) {
                    System.out.print("нашли наше число " + chislo1 + " ");
                    System.out.println("нашли наше число " + chislo2);
                }
            }
        }
    }
}
