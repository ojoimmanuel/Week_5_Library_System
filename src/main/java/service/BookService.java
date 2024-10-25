package service;

import model.Book;

public interface BookService {
    void subtractCopy (Book book);

    void addCopy(Book book);
}
