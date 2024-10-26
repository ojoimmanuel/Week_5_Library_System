package model;

import baseModel.Person;
import utils.PersonComparator;

import java.util.*;

public class Library {
    private Map<String, List<Book>> booksList;
    private PriorityQueue<Person> queue;

    public Library() {
        this.booksList = new HashMap<>();
        queue = new PriorityQueue<>(new PersonComparator());
    }

    public Map<String, List<Book>> getBooksList() {
        return booksList;
    }

    public PriorityQueue<Person> getQueue() {
        return queue;
    }
}
