package by.mix.oop.citiesOOP;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by st on 28.04.2016.
 */

public class CitiesReader {
    public static String FILE = "D:\\Idea\\mix\\src\\by\\mix\\oop\\citiesOOP\\cities.txt";

    public static List<String> readCities(String file) {
        List<String> cities = new ArrayList<>();
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                cities.add(s);
            }

        } catch (IOException e) {
            throw new CitiesException("file" + file + " not found");

        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        {
            return cities;
        }
    }


}
