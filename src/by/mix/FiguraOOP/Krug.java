package by.mix.FiguraOOP;

/**
 * Created by st on 17.03.2016.
 */

public class Krug extends Figura {
    private int radius;

    public Krug(int radius) {
        this.radius = radius;
    }

    public double colculateLength() {
        return 2 * Math.PI * radius;
    }

    public double colculateSquare() {
        return Math.PI * (Math.pow(radius, 2));
    }

    // здесь мы выводим на печать в Main2
    @Override
    public String toString() {
        return "Круг - radius = " + radius + "-- длина = " + colculateLength() + "-- площадь = " + colculateSquare();
    }

}