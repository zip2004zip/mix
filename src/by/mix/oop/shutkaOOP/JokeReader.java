package by.mix.oop.shutkaOOP;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by st on 21.04.2016.
 * читаем файл Jokes на диске
 */
// http://ru.stackoverflow.com/questions/221398/%D0%A7%D1%82%D0%B5%D0%BD%D0%B8%D0%B5-%D0%B8-%D0%B2%D1%8B%D0%B2%D0%BE%D0%B4-%D0%BD%D0%B0-%D1%8D%D0%BA%D1%80%D0%B0%D0%BD-%D1%81%D0%BE%D0%B4%D0%B5%D1%80%D0%B6%D0%B8%D0%BC%D0%BE%D0%B5-%D1%84%D0%B0%D0%B9%D0%BB%D0%B0
// http://www.cyberforum.ru/java-j2se/thread948034.html

public class JokeReader {
    public static String FILE = "C:\\Users\\Sergei\\IdeaProjects\\mix\\src\\by\\mix\\oop\\shutkaOOP\\Joke.txt";

    public static List<String> readJokes(String file) {
        List<String> jokes = new ArrayList<>();
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(file));
            String s;
            while ((s = bufferedReader.readLine()) != null) {
                jokes.add(s);
            }

        } catch (IOException e) {
            throw new JokeException("file" + file + " not found");

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

            return jokes;
        }
    }
}