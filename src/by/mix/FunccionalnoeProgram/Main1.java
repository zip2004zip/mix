package by.mix.FunccionalnoeProgram;

// создали массив и в нем сделали копию этого массива

public class Main1 {
    public static void main(String[] args) {
        int[] m1 = new int[10];
        for (int i = 0; i < m1.length; i++) {
            m1[i] = i+1;
            System.out.println(i + ":" + m1[i]);
        }
        int[] m2 = new int[10];
        for (int i = 0; i < m2.length; i++) {

            m2[i] = m1[i];
            System.out.println(i + ":" + m2[i]);
        }
    }
}
