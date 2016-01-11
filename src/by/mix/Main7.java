package by.mix;

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
//http://www.cyberforum.ru/search.php?searchid=10513378
//http://www.inf1.info/kumir/percentage-char прописные и строчные
// http://pas1.ru/percentage-char