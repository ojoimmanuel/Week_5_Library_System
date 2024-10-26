package serviceImplementation;

import baseModel.Person;
import model.Book;
import model.Library;
import service.LibraryService;

import java.util.ArrayList;
import java.util.List;


public class LibraryServiceImpl implements LibraryService {

    Library library = new Library();

    @Override
    public void addBook(Book book) {
        library.getBooksList().computeIfAbsent(book.getBookTitle(), k -> new ArrayList<>()).add(book);
    }

    @Override
    public void addQueue(Person person) {
        library.getQueue().add(person);
    }

    @Override
    public String issueBook(String bookTitle) {
        while (!library.getQueue().isEmpty()) {
            Person person1 = library.getQueue().poll();

            List<Book> booksList = library.getBooksList().get(bookTitle.toUpperCase());  //make bookTitle non case sensitive
            BookServiceImpl bookServiceImpl = new BookServiceImpl();

            if (booksList != null && !booksList.isEmpty() && booksList.get(0).getCopies() != 0 ) {
                Book availableBook = booksList.get(0);
                bookServiceImpl.subtractCopy(availableBook);
                return "Book: " + bookTitle + ", is issued to "
                        + person1.getPersonGroup() + " " + person1.getName();
            } else {
                return "Book: " + bookTitle + ", is not available.";
            }
        }
        return bookTitle;
    }

    @Override
    public String returnBook(String bookTitle) {
        List<Book> booksList = library.getBooksList().get(bookTitle.toUpperCase());  //make bookTitle non case sensitive

        for (Book books : booksList ) {
            if(books.getBookTitle().toUpperCase().equals(bookTitle.toUpperCase())) {
                BookServiceImpl returnedBookImpl = new BookServiceImpl();
                returnedBookImpl.addCopy(books);
                return (bookTitle + " has been returned and available for issue.");
            }
        }
        return "";
    }
}
