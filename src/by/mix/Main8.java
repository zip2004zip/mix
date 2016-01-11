package by.mix;

//import java.util.Random;

// Задача 3 Посчитать процентное соотношение прописных и строчных символов в строке

public class Main8 {
    public static void main(String[] args) {
        //String[] m1 = new int[10];
        String slova = "У меня Ничего не выходиТ";
        int sumPr = 0;
        int sumStr = 0;
       // Random random = new Random();
        for (int i = 0; i < slova.length; i++) {
            m1[i] = -50 + random.nextInt(1000);
        }

        // вывод массива для себя, что бы витеть цифры
        for (int i = 0; i < slova.length; i++) {
            System.out.println(i + ": " + m1[i]);
        }

        // вывод суммы положительных и отрицательных
        for (int i = 0; i < m1.length; i++) {
            if (m1[i] >= 0) {
                sumPr++;
            } else {
                if (m1[i] < 0) {
                    sumStr++;
                }
            }
        }
        System.out.println("Сумма положительных чисел = " + sumPr + ", что составляет " + (sumPr * 100) / 10 + " %");
        System.out.println("Сумма отрицательных чисел = " + sumStr + ", что составляет " + (sumStr * 100) / 10 + " %");
    }
}


//http://www.cyberforum.ru/java-j2se/thread445697.html
//http://www.inf1.info/kumir/percentage-char прописные и строчные
// http://pas1.ru/percentage-char