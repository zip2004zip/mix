package by.mix.employeeOOP;

/**
 * Created by st on 29.03.2016.
 */


// новый стажер
public class NewEmployer extends AbstractEmployer{

    @Override
    public void print() {
        System.out.println(getName() + " работает бесплатно");
    }
}
