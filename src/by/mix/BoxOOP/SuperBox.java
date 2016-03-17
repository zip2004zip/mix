package by.mix.BoxOOP;

/**
 * Created by st on 3/10/2016.
 */

public class SuperBox extends Box {
    private static int hStarWars = 1;
    private static int lStarWars = 1;
    private static int dStarWars = 1;

    @Override
    public int getD() {
        return super.getD() + dStarWars;
    }

    @Override
    public int getL() {
        return super.getL() + lStarWars;
    }

    @Override
    public int getH() {
        return super.getH() + hStarWars;
    }
}