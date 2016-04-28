package by.mix.proceduralProgramming;

// Задача 6 посчитать факториал числа

public class Main7 {
    public static void main(String[] args) {
        int n = 19;
        int fact = 1;
        for (int i = 1; i <= n; i++)
        {
            fact *= i;
            System.out.println(n+"! = " + fact);
        }
    }
}
//https://ru.wikipedia.org/wiki/Факториал
