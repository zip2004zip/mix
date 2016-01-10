package by.mix;

import java.util.Random;

// не смог вывести толко последнее число!!!!
// Задача 2 посчитать процентное соотношение положительных и отрицательных чисел в массиве

public class Main5 {
    public static void main(String[] args) {
        int[] m1 = new int[10];
        int sumPol = 0;
        int sumOtr = 0;
        Random random = new Random();
        for (int i = 0; i < m1.length; i++) {
            m1[i] = -50 + random.nextInt(1000);
        }

        // вывод массива для себя, что бы витеть цифры
        for (int i = 0; i < m1.length; i++) {
            System.out.println(i + ": " + m1[i]);
        }

        // вывод суммы положительных и отрицательных
        for (int i = 0; i < m1.length; i++) {
            if (m1[i] >= 0) {
                sumPol++;
            } else {
                if (m1[i] < 0) {
                    sumOtr++;
                }
            }
            System.out.println("Сумма положительных чисел = " + sumPol + ", что составляет " + (sumPol * 100) / 10 + " %");
            System.out.println("Сумма отрицательных чисел = " + sumOtr + ", что составляет " + (sumOtr * 100) / 10 + " %");
        }
    }
}







// про год висок или нет
/*
 int g = 2003;
if(g%4==0)
{
if(g%100==0)
{
if(g%400==0)
{
System.out.println('Високосный');
}
else
{
System.out.println('Не високосный');
}
}
else
{
System.out.println('Високосный');
}
}
else
{
System.out.println('Не високосный');
}*/


// факториал числа
/*
public class HelloWorld {
    public static void main(String[] args) {
      int f = 1;
for(int i=1;i <= 10;i++);
{
f = f * i;
}
System.out.println(\"f=\" + f);
}
}
*/

