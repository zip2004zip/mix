package by.mix.oop.ContactsOOP;

import java.util.ArrayList;

/**
 * Created by st on 12.04.2016.
 */

public class BookServiceImpl implements BookService {
private ArrayList<Contacts> contactses  = new ArrayList<>();

    @Override
    public void add(Contacts contacts) {
        contactses.add(contacts);
    }
}
