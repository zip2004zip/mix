package by.mix.employeeOOP;

import java.math.BigDecimal;

/**
 * Created by st on 29.03.2016.
 */

public class FixedSalaryEmployer extends AbstractEmployer implements Salary {
    private BigDecimal salary;

    @Override
    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public void print() {
        System.out.println(getName() + " зарабатывает :" + salary);
    }

}
