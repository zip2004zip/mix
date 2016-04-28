package by.mix.oop.citiesOOP;


import java.util.HashSet;
import java.util.Set;


/**
 * Created by st on 28.04.2016.
 */


public class Main {
    public static void main(String[] args) {

        Set<String1> strings = new HashSet<>();
        for (String s : CitiesReader.readCities(CitiesReader.FILE)) {
            strings.add(new String1(s));
        }

        for (String1 s : strings) {
            System.out.println(s.getS());
            System.out.println(s.getS().hashCode());
            System.out.println(s);
        }
    }

}
