package by.mix.FiguraOOP;

/**
 * Created by st on 17.03.2016.
 */
public class Krug1 {

    private int radius;

    public Krug1(int radius) {
        this.radius = radius;
    }

    public double colculateLength() {
        return 2 * Math.PI * radius;
    }

    public double colculateSquare(){
        return Math.PI * (radius * radius);
    }

}
