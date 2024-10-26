package serviceImplementation;

import model.Book;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookServiceImplTest {

    @Test
    void testSubtractCopy(){
        Book book1 = new Book("Testing in Java", 20);
        BookServiceImpl bookServiceImpl = new BookServiceImpl();
        bookServiceImpl.subtractCopy(book1);

        assertEquals(19, book1.getCopies());
    }

    @Test
    void testAddCopy(){
        Book book1 = new Book("Testing in Java", 20);
        BookServiceImpl bookServiceImpl = new BookServiceImpl();
        bookServiceImpl.addCopy(book1);

        assertEquals(21, book1.getCopies());
    }

}