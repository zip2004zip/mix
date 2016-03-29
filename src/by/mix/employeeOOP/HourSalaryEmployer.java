package by.mix.employeeOOP;

import java.math.BigDecimal;

/**
 * Created by st on 29.03.2016.
 */
public class HourSalaryEmployer extends AbstractEmployer implements Salary {
    private int hour;
    private BigDecimal tarif;

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setTarif(BigDecimal tarif) {
        this.tarif = tarif;
    }

    @Override
    public BigDecimal getSalary() {
        return null;
    }

    @Override
    public void print() {
        System.out.println(getName() + " работает " + hour + " часов по тарифу " + tarif);
    }
}
