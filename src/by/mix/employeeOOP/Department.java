package by.mix.employeeOOP;

/**
 * Created by st on 29.03.2016.
 */
public class Department implements Print {
    private String title;

    private AbstractEmployer boss;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public AbstractEmployer getBoss() {
        return boss;
    }

    public void setBoss(AbstractEmployer boss) {
        this.boss = boss;
    }

    @Override
    public void print() {
        System.out.println(title + "|" + boss.getName());
    }
}
