package by.mix.OOPnewDTO;

/**
 * Created by st on 3/10/2016.
 */

public class SuperBox extends Box {
    private static int hStarWars = 10;

    @Override
    public int getH() {
        return super.getH() + hStarWars;
    }
}