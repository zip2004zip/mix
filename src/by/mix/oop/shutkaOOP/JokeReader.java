package by.mix.oop.shutkaOOP;

import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Created by st on 21.04.2016.
 * читаем файл Jokes на диске
 */
// http://ru.stackoverflow.com/questions/221398/%D0%A7%D1%82%D0%B5%D0%BD%D0%B8%D0%B5-%D0%B8-%D0%B2%D1%8B%D0%B2%D0%BE%D0%B4-%D0%BD%D0%B0-%D1%8D%D0%BA%D1%80%D0%B0%D0%BD-%D1%81%D0%BE%D0%B4%D0%B5%D1%80%D0%B6%D0%B8%D0%BC%D0%BE%D0%B5-%D1%84%D0%B0%D0%B9%D0%BB%D0%B0
// http://www.cyberforum.ru/java-j2se/thread948034.html

public class JokeReader {
    /*BufferedReader reader = new BufferedReader(new FileReader("D://idea/mix/lib/Jokes.txt"));
    String line;
    List<String> lines = new ArrayList<String>();
    while((line=reader.readLine())!=null)
    {
        lines.add(line);
    }*/

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    File f = new File("/root/2/Files.txt");
    BufferedReader fin = new BufferedReader(new FileReader(f));
    String name;
    String line;
    System.out.println("Print File "+f.getName()+"? y/n");
    name = br.readLine();
    if(name.equals("y"))
            while ((line = fin.readLine()) != null) System.out.println(line);

}