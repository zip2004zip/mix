package by.mix.oop.FiguraOOP;

/**
 * Created by st on 17.03.2016.
 */

public class Square extends Figura {
    private int side;

    public Square(int side) {
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

    public double diagonal() {
        return side * Math.sqrt(2);
    }

    // здесь мы выводим на печать в Main
    @Override
    public String toString() {
        return "Квадрат - side = " + side + " - длина = " + colculateLength() + " - площадь = " + colculateSquare();
    }
}
