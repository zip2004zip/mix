package by.mix.oop.arraylist2x;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by st on 03.05.2016.
 * <p/>
 * Дан файл с городами. Они повторяются. Создать map, где ключем будет город, а значением количество раз, сколько он встречается в файле.
 */

public class Main3 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        for (String s : MapReader.readMaps(MapReader.FILE)) {
            if (map.containsKey(s)) {
                map.put(s, map.get(s) + 1);
            } else {
                map.put(s, 1);
            }
        }


        for (Map.Entry<String, Integer> s : map.entrySet()) {
            System.out.println(s.getKey() + " => " + s.getValue());
        }
    }


    public static class MapReader {
        public static String FILE = "D:\\Idea\\mix\\src\\by\\mix\\oop\\arraylist2x\\Map.txt";

        public static List<String> readMaps(String file) {
            List<String> maps = new ArrayList<>();
            BufferedReader bufferedReader = null;

            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                String s;
                while ((s = bufferedReader.readLine()) != null) {
                    maps.add(s);
                }

            } catch (IOException e) {
                throw new MapException("file" + file + " not found");

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
                return maps;
            }
        }
    }


    public static class MapException extends RuntimeException {
        public MapException(String message) {
            super(message);
        }
    }

}
