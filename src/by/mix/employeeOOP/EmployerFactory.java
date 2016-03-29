package by.mix.employeeOOP;

import javax.swing.*;
import java.math.BigDecimal;

/**
 * Created by st on 29.03.2016.
 */

public class EmployerFactory {
    public AbstractEmployer create(AbstractEmployer employer) {
        if (employer instanceof FixedSalaryEmployer) {
            fillFixedSalaryEmployer((FixedSalaryEmployer) employer);
        } else if (employer instanceof HourSalaryEmployer) {
            fillHourSalaryEmployer((HourSalaryEmployer) employer);
        } else if (employer instanceof NewEmployer) {
            fillNewEmployer((NewEmployer) employer);
        }
        return employer;
    }

    // новый работник фиксированная зп
    private void fillFixedSalaryEmployer(FixedSalaryEmployer employer) {
        employer.setName(JOptionPane.showInputDialog("name: "));
        employer.setSalary(BigDecimal.valueOf(Long.valueOf(JOptionPane.showInputDialog("salary: "))));
    }

    // новый работник часовая зп
    private void fillHourSalaryEmployer(HourSalaryEmployer employer) {
        employer.setName(JOptionPane.showInputDialog("name: "));
        employer.setHour(Integer.valueOf(JOptionPane.showInputDialog("hour: ")));
        employer.setTarif(BigDecimal.valueOf(Long.valueOf(JOptionPane.showInputDialog("tarif: "))));
    }

    // новый стажер
    private void fillNewEmployer(NewEmployer employer) {
        employer.setName(JOptionPane.showInputDialog("name: "));
    }
}
