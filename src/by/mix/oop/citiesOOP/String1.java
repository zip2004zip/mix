package by.mix.oop.citiesOOP;

/**
 * Created by st on 28.04.2016.
 */

public class String1 {
    private String s;

    public String1 (String s){
        this.s = s;
    }

    public String getS() {
        return s;
    }

    @Override
    public int hashCode() {
        return s.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return s.equals(((String1)obj).getS());
    }
}