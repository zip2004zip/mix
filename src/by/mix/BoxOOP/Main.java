package by.mix.BoxOOP;

/**
 * Created by st on 3/10/2016.
 */

public class Main {
    public static void main(String[] args) {
        Box box = new Box();
        box.setD(10);
        box.setH(15);
        box.setL(20);
        System.out.println(box.getVolume());

        SuperBox sBox = new SuperBox();
        sBox.setD(10);
        sBox.setH(15);
        sBox.setL(20);
        System.out.println(sBox.getVolume());
    }
}
