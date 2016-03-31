package by.mix.employeeOOP;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

/**
 * Created by st on 31.03.2016.
 * тут записываем логги. в Main Log log
 */

public class Log {
    private static final String FILE_NAME = "log.txt";
    private static final String DELIMITER = "\n";


    private FileWriter fileWriter;

    // тут private для того что бы не создать еще один объект Log. Если в Main попробовать создать еще один объект Log log = new log будет ошибка
    private Log() throws IOException {
        fileWriter = new FileWriter(FILE_NAME, true);
    }

    public void write(String s, LogLevel level) throws IOException {
        fileWriter.write(level + " - " + Calendar.getInstance().getTime().toString() + " - " + s + DELIMITER);
        fileWriter.flush();
    }

    private static Log log;

    public static Log getInstance() throws IOException {
        if (log == null) {
            log = new Log();
        }
        return log;
    }
}