package by.mix.oop.BoxOOP;

/**
 * Created by st on 3/10/2016.
 */

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.setD(2);
        box.setH(2);
        box.setL(2);
        System.out.println(box.getVolume());

        SuperBox sBox = new SuperBox();
        sBox.setD(2);
        sBox.setH(2);
        sBox.setL(2);
        System.out.println(sBox.getVolume());
    }
}
