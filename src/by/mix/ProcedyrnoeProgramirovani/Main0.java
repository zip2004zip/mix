package by.mix.ProcedyrnoeProgramirovani;

// тренировочный Main


import java.util.Scanner;

public class Main0 {
    public static void main(String[] args)
    throws java.io.IOException {
        char ch, ign;
        for (; ; ) {
            do {
                System.out.println("1");
                System.out.println("2");
                System.out.println("3");
                System.out.println("vim или q");
                Scanner scanner = new Scanner(System.in);
                ch = (char) System.in.read();
                do {
                    ign = (char) System.in.read();
                } while (ign != '\n');
            } while (ch < '1' | ch > '3' & ch != '6');

            if (ch == '6') break;
            System.out.println("\n");

            switch (ch) {
                case '1':
                    System.out.println("vibr1");
                    break;
                case '2':
                    System.out.println("vibr2");
                    break;
                case '3':
                    System.out.println("vibr3");
                    break;
            }
            System.out.println();
        }
    }
}