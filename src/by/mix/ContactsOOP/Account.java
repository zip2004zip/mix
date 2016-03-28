package by.mix.ContactsOOP;

/**
 * Created by Sergei on 28.03.2016.
 */
public class Account {
    static int idCounter = 0;
    int id;

    public Account() {
        id = idCounter++;
    }

    public static Account greateAccount() {
        System.out.println("Аккаунт создан");
        return new Account();
    }

    @Override
    public String toString() {
        return "Account{" + "id=" + id + '}';
    }
}
