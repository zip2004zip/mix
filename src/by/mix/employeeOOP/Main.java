package by.mix.employeeOOP;

import java.io.IOException;

/**
 * Created by st on 29.03.2016.
 *
 Создать программу для описания сотрудников. Сотрудники бывают 3 типов, с зп зависящей от отработанных часов,
 с зп фиксированной в месяц и стажеры на практике без зп. Сотрудники закреплены за отделами, у отдела есть свой начальник.
 Предусмотреть интерфейс, отвечающий за печать сотрудников и интерфейс, отвечающий за подсчет зп.
 Должен быть отдельный класс, отвечающий за вывод на экран. Отдельный класс фабрики для получения новых записей.
 Добавить класс логгирования (создать один метод который будет записывать в текст. типа делает логи программы, есть описание в ШАГ), используя паттерн синглтон.
 */

public class Main {
    public static void main(String[] args) throws IOException {

        EmployerFactory employerFactory = new EmployerFactory();
        FixedSalaryEmployer fixedSalaryEmployer = new FixedSalaryEmployer();
        HourSalaryEmployer hourSalaryEmployer = new HourSalaryEmployer();
        NewEmployer newEmployer = new NewEmployer();

        fixedSalaryEmployer = (FixedSalaryEmployer)employerFactory.create(fixedSalaryEmployer);
        hourSalaryEmployer = (HourSalaryEmployer)employerFactory.create(hourSalaryEmployer);
        newEmployer = (NewEmployer)employerFactory.create(newEmployer);

        fixedSalaryEmployer.print();
        hourSalaryEmployer.print();
        newEmployer.print();

      //  LogLevel logLevel = LogLevel.ERROR;

        Log.getInstance().write("123", LogLevel.INFO);
        Log.getInstance().write("4567", LogLevel.WARNING);
        Log.getInstance().write("8910", LogLevel.ERROR);
    }
}