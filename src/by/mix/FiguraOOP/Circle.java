package by.mix.FiguraOOP;

/**
 * Created by st on 17.03.2016.
 */

public class Circle extends Figura {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double colculateLength() {
        return 2 * Math.PI * radius;
    }

    public double colculateSquare() {
        return Math.PI * (Math.pow(radius, 2));
    }

    // здесь мы выводим на печать в Main
    @Override
    public String toString() {
        return "Круг - radius = " + radius + "-- длина = " + colculateLength() + "-- площадь = " + colculateSquare();
    }
}