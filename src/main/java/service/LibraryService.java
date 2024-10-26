package service;

import baseModel.Person;
import model.Book;

public interface LibraryService {

    public void addBook(Book book);

    public void addQueue(Person person);

    //    public void borrowBook(RequestServiceImpl request1, RequestServiceImpl request2);
    public String issueBook(String bookTitle);

    public String returnBook(String bookTitle);
}