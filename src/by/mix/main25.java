package by.mix;

// Задача 3 не решена
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
        for (int i = 0; i < fmas.length; i++) {
            for (int j = 0; j < fmas[i].length; j++)
                fmas[j][i] = 0;
                fmas[i][i] = 1;

        }
    }


    public static void printMas(int[][] fmas) {
        for (int i = 0; i < fmas.length; i++) {
            for (int j = 0; j < fmas[i].length; j++) {
                System.out.printf("%5d", fmas[j][i]);
            }
            System.out.println();
        }
    }
}