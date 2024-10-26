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
//        library.getBooksList().add(book);
//        for (Book bks : library.getBooksList()) {
//            System.out.println(bks.getBookTitle() + " , " + bks.getCopies());
//        }
    }

    @Override
    public void addQueue(Person person) {
        library.getQueue().add(person);
//        issueBook(person, bookTitle);
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
//                System.out.println("cpoies remaining " + availableBook.getCopies());

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
//    Book returnedBook = new Book(bookTitle.toUpperCase(), 1);
    return "";
}

}



//    @Override
//    public void borrowBook(RequestServiceImpl request) {
//        library.getQueue().add(request);  //add request to queue
//        //check if book is available
//        List<Book> booksList = library.getBooksList().get(request.getBookTitle());
//        BookServiceImpl bookServiceImpl = new BookServiceImpl();
//
//        if (booksList != null && !booksList.isEmpty() && booksList.get(0).getCopies() != 0 ) {
//            Book availableBook = booksList.get(0);
//            bookServiceImpl.subtractCopy(availableBook);
////            if(availableBook.getCopies() == 0) {
////                library.getBooksList().remove(availableBook);
////            }
//            System.out.println("Book: " + request.getBookTitle() + ", is issued to "
//                    + request.getPerson().getPersonGroup() + " " + request.getPerson().getName());
//            System.out.println("cpoies remaining " + availableBook.getCopies());
//
//        } else {
//            System.out.println("Book: " + request.getBookTitle() + ", is not available.");
//        }
//
////        for (Book bks : booksList)
////        {
////            System.out.println(bks.toString());
////        }
////        if (booksList.contains(request.getBookTitle())){
////            System.out.println(request.getBookTitle() + " is available");
////            request = library.getQueue().poll();
////            System.out.println(request.getPerson().toString() + " borrowed " + request.getBookTitle());
////        }
////        library.getQueue().add(request2);  //add request to queue
//
////        System.out.println("request for " + request1.getBookTitle() + " & " + request2.getBookTitle());
////        System.out.println("priority queue " + library.getQueue().toString());
//
//
////
////        Book availableBook = booksList.get(0);
//
////        System.out.println(availableBook.getBookTitle() + "is issued to " + request.getPerson().getPersonGroup() + " "
////        + request.getPerson().getName());
////        for (Book bks : library.getBooksList()) {
////            if(bks.getBookTitle().equals(request.getBookTitle())) {
////            System.out.println(request.getBookTitle() + " is available and issued to " +
////                    request.getPerson().getPersonGroup() + " " + request.getPerson().getName());
////            library.getBooksList().remove(bks);
////        }
////        }
//
//
////        library.getBooksList().remove(bookTitle);
//
////        System.out.println("after removal");
//
////        for (Book bks : library.getBooksList()) {
////            System.out.println(bks.getBookTitle() + " , " + bks.getCopies());
////        }
//
////        request = library.getQueue().poll();
//      //  List<Book> bookList = library.getBooksList().get(request.getBookTitle());
////        if (library.getBooksList().contains(request.getBookTitle())){
////            System.out.println("book available");
////        }
//
//
//
////        library.getBooksList().remove(request.getBookTitle());
//    }
//
//    @Override
//    public void borrowBook(RequestServiceImpl request1, RequestServiceImpl request2) {
//        library.getQueue().add(request1);  //add request to queue
//        library.getQueue().add(request2);  //add request to queue
//
//        while (!library.getQueue().isEmpty()) {
////                System.out.println(req.getPerson().toString());
//                RequestServiceImpl req = library.getQueue().poll();
//                List<Book> booksList = library.getBooksList().get(req.getBookTitle());
//                BookServiceImpl bookServiceImpl = new BookServiceImpl();
//
//                if (booksList != null && !booksList.isEmpty() && booksList.get(0).getCopies() != 0 ) {
//                    Book availableBook = booksList.get(0);
//                    bookServiceImpl.subtractCopy(availableBook);
//                    System.out.println("Book: " + req.getBookTitle() + ", is issued to "
//                            + req.getPerson().getPersonGroup() + " " + req.getPerson().getName());
//                    System.out.println("cpoies remaining " + availableBook.getCopies());
//
//                } else {
//                    System.out.println("Book: " + req.getBookTitle() + ", is not available.");
//                }
//            }

//        for (RequestServiceImpl request : library.getQueue()) {
//            request = library.getQueue().poll();
//            List<Book> booksList = library.getBooksList().get(request.getBookTitle());
//            BookServiceImpl bookServiceImpl = new BookServiceImpl();
//
//            if (booksList != null && !booksList.isEmpty() && booksList.get(0).getCopies() != 0 ) {
//                Book availableBook = booksList.get(0);
//                bookServiceImpl.subtractCopy(availableBook);
//    //            if(availableBook.getCopies() == 0) {
//    //                library.getBooksList().remove(availableBook);
//    //            }
//                System.out.println("Book: " + request.getBookTitle() + ", is issued to "
//                        + request.getPerson().getPersonGroup() + " " + request.getPerson().getName());
//                System.out.println("cpoies remaining " + availableBook.getCopies());
//
//            } else {
//                System.out.println("Book: " + request.getBookTitle() + ", is not available.");
//            }
//        }

//check if book is available
//        List<Book> booksList = library.getBooksList().get(request1.getBookTitle());
//        BookServiceImpl bookServiceImpl = new BookServiceImpl();
//
//        if (booksList != null && !booksList.isEmpty() && booksList.get(0).getCopies() != 0 ) {
//            Book availableBook = booksList.get(0);
//            bookServiceImpl.subtractCopy(availableBook);
////            if(availableBook.getCopies() == 0) {
////                library.getBooksList().remove(availableBook);
////            }
//            System.out.println("Book: " + request.getBookTitle() + ", is issued to "
//                    + request.getPerson().getPersonGroup() + " " + request.getPerson().getName());
//            System.out.println("cpoies remaining " + availableBook.getCopies());
//
//        } else {
//            System.out.println("Book: " + request.getBookTitle() + ", is not available.");
//        }

//        RequestServiceImpl request = library.getQueue().poll();
//        System.out.println(request.getPerson().toString() + " borrowed " + request.getBookTitle());
//
//        request = library.getQueue().poll();
//        System.out.println(request.getPerson().toString() + " borrowed " + request.getBookTitle());


