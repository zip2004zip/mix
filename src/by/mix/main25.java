package by.mix;

// Дано число n. Создайте массив int A[n][n], и заполните его по следующему правилу:
// Числа на диагонали, идущей из правого верхнего в левый нижний угол равны 1.
// Числа, стоящие выше этой диагонали, равны 0. Числа, стоящие ниже этой диагонали, равны 2.

public class main25 {
    public static void main(String[] args) {
        int[][] A = new int[4][4];
        int n = 4;

        initMas(A);
        printMas(A);
    }

    public static void initMas(int[][] fmas) {
        for (int j = 0; j < fmas.length; j++) {
            for (int i = 0; i < fmas[j].length; i++)
                fmas[j][i] = 0;
              //  fmas[i][j] = 2;
                fmas[j][j] = 1;

        }
    }


    public static void printMas(int[][] fmas) {
        for (int j = 0; j < fmas.length; j++) {
            for (int i = 0; i < fmas[j].length; i++) {
                System.out.printf("%5d", fmas[j][i]);
            }
            System.out.println();
        }
    }
}

