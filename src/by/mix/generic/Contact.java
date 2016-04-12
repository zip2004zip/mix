package by.mix.generic;


/**
 * Created by st on 24.03.2016.
 */

public class Contact implements by.mix.generic.Printable {
    private String name;
    private String phone;

    public Contact(String phone, String name) {
        this.phone = phone;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public void print() {
        System.out.println(name + "|" + phone);
    }
}
