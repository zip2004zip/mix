package by.mix;
// создали массив и в нем сделали копию этого массива
public class Main {
    public static void main(String[] args) {
        int[] m1 = new int[1000];
        for (int i = 0; i < m1.length; i++) {
            m1[i] = 5;
        }
        int[] m2 = new int[1000];
        for (int i = 0; i < m2.length; i++) {
            m2[i] = m1[i];
        }
    }
}
