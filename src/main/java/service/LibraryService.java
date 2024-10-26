package service;

import baseModel.Person;
import model.Book;

public interface LibraryService {

    void addBook(Book book);

    void addQueue(Person person);

    String issueBook(String bookTitle);

    String returnBook(String bookTitle);
}