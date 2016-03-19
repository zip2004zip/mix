package by.mix.JavaRush;

import java.util.regex.*;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;

/**
 * Created by Sergei on 19.03.2016.
 */
public class RegexTestSearchString {
    public static void main(String args[]) {
        String pattern = "[А-Я]+";
        String text = "Мама я пошлА";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while(m.find()) {
            System.out.print(text.substring(m.start(), m.end()) + "*");
        }
    }
}