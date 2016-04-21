package by.mix.oop.employeeOOP;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Calendar;

/**
 * Created by st on 31.03.2016.
 * ��� ���������� �����. � Main Log log
 */

public class Log {
    private static final String FILE_NAME = "log.txt";
    private static final String DELIMITER = "\n";


    private FileWriter fileWriter;

    // ��� private ��� ���� ��� �� �� ������� ��� ���� ������ Log. ���� � Main ����������� ������� ��� ���� ������ Log log = new log ����� ������
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