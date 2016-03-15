package by.mix.FunccionalnoeProgram;

// Задача 5 определить количество дней в году

public class Main6 {
    public static void main(String[] args) {
        int g = 1991;
        if (g % 4 == 0) {
            if (g % 100 == 0) {
                if (g % 400 == 0) {
                    System.out.println("в " + g +" году 366 дней");
                } else {
                    System.out.println("в " + g +" году 365 дней");
                }
            } else {
                System.out.println("в " + g +" году 366 дней");
            }
        } else {
            System.out.println("в " + g +" году 365 дней");
        }
    }
}