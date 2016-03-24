package by.mix.ProcedyrnoeProgramirovani;

// НЕ РЕШИЛ Задача 7 Вывести все простые числа до заданного


public class Main10 {
    public static void main(String[] args) {
        int[] s1 = new int[10];
        int i = 0;
        for (i = 0; i <= 9; i++) {
            s1[i] = i + 1;
        }

// вывод всех чисел
        for (i = 0; i <= 9; i++) {
            System.out.println(s1[i]);
        }

        // ищем натуральные числа
        for (i = 2; i <= 9; i++) {
            if (s1[i] % i == 0) ;
            s1[i] =  i + 1;
            System.out.println("натуральные числа - " + i);
        }
    }
}
