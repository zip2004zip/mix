package by.mix.oop.ContactsOOP;

/**
 * Created by Sergei on 03.04.2016.
 */
public class Contacts {
    private long id;
    private String name;
    private String phone;
    private String address;
    private int dayBirthday;
    private int monthBirthday;
    private int yearBirthday;

    public Contacts(long id, String name, String phone, String address, int dayBirthday, int monthBirthday, int yearBirthday) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.dayBirthday = dayBirthday;
        this.monthBirthday = monthBirthday;
        this.yearBirthday = yearBirthday;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getDayBirthday() {
        return dayBirthday;
    }

    public void setDayBirthday(int dayBirthday) {
        this.dayBirthday = dayBirthday;
    }

    public int getMonthBirthday() {
        return monthBirthday;
    }

    public void setMonthBirthday(int monthBirthday) {
        this.monthBirthday = monthBirthday;
    }

    public int getYearBirthday() {
        return yearBirthday;
    }

    public void setYearBirthday(int yearBirthday) {
        this.yearBirthday = yearBirthday;
    }



}
