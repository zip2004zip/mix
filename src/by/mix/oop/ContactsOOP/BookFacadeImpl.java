package by.mix.oop.ContactsOOP;

/**
 * Created by st on 12.04.2016.
 */

public class BookFacadeImpl implements BookFacade {
    private BookService bookService;

    public BookFacadeImpl(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void add(Contacts contacts) {
        bookService.add(contacts);
    }
}
