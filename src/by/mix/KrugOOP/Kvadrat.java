package by.mix.KrugOOP;

/**
 * Created by st on 17.03.2016.
 */
public class Kvadrat extends Figura {
    private int side;

    public Kvadrat(int side) {
        this.side = side;
    }

    @Override
    public double colculateLength() {
        return side * 4;
    }

    @Override
    public double colculateSquare() {
        return side * side;
    }
}
