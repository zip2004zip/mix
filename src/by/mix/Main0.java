package by.mix;

// тренировочный Main


import java.io.IOException;

public class Main0 {
    public static void main(String[] args) throws IOException {

        vip();

    }


    public static void vip() throws IOException {
        System.out.println("Введите число: ");

        char e;

        for (; ; ) {
            e = (char) System.in.read();

            if (e == 'q') break;
        }
        System.out.println("Vveli 2");
    }
}

