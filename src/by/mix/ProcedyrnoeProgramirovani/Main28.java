package by.mix.ProcedyrnoeProgramirovani;


// массив лотерея


import java.util.Random;
import java.util.Scanner;

public class Main28 {
    public static void main(String[] args) {
        int i;
        for (i = 0; i < 5; i++) {
            newGame();
        }
    }

    public static void newGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int i = scanner.nextInt();
        if (zadumChetn()) {
            if (i % 2 == 0) {
                System.out.println("Вы выйграли");
            } else {
                System.out.println("Вы проиграли");
            }
        } else {
            if (i % 2 != 0) {
                System.out.println("Вы выйграли");
            } else {
                System.out.println("Вы проиграли");
            }
        }
    }

    public static boolean zadumChetn() {
        Random random = new Random();
        int i = random.nextInt(10);
        if (i % 2 != 0) {
            System.out.println("Задумали нечетное");
            return false;
        } else {
            System.out.println("Задумали четное");
            return true;
        }
    }
}

