package by.mix.CatOOP;

/**
 * Created by st on 3/10/2016.
 */
public class Cat {
    private boolean sex;
    private String name;
    private String color;
    private int age;

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPrint() {
        return getAge();
    }
}
