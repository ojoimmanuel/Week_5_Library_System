package serviceImplementation;

import service.BookService;
import model.Book;

public class BookServiceImpl implements BookService {
    @Override
    public void subtractCopy(Book book) {
        int copies = book.getCopies();
        if (copies != 0) {
        copies--;
        book.setCopies(copies);}
    }

    @Override
    public void addCopy(Book book) {
        int copies = book.getCopies();
        copies++;
        book.setCopies(copies);
    }
}
