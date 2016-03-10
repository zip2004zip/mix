package by.mix.OOPnewDTO;

/**
 * Created by st on 3/10/2016.
 */

public class Box {
    private int l;
    private int h;
    private int d;

    public int getD() {
        return d;
    }

    public void setD(int d) {
        this.d = d;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getVolume() {
        return getD()*getH()*getL();
    }
}

