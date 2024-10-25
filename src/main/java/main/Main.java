package main;

import enums.PersonGroup;
import model.*;
import serviceImplementation.LibraryServiceImpl;

public class Main {



    public static void main(String[] args) {
        Book book1 = new Book("Think and Grow Rich", 4);
        Book book2 = new Book("Failing Forward", 1);
        Book book3 = new Book("As a man Thinketh", 10);

//        BookServiceImpl bookServiceImpl1 = new BookServiceImpl();
        LibraryServiceImpl libraryServiceImpl = new LibraryServiceImpl();

        libraryServiceImpl.addBook(book1);
        libraryServiceImpl.addBook(book2);
        libraryServiceImpl.addBook(book3);

        Student student1 = new Student("Bolu", PersonGroup.STUDENT, 100);
        Student student2 = new Student("James", PersonGroup.STUDENT, 300);
        Student student3 = new Student("Seun", PersonGroup.STUDENT, 300);

        Teacher teacher1 = new Teacher("Samuel", PersonGroup.TEACHER);


        libraryServiceImpl.addQueue(teacher1);
        libraryServiceImpl.addQueue(student1);
        libraryServiceImpl.addQueue(student2);
        libraryServiceImpl.addQueue(student3);

        System.out.println(libraryServiceImpl.issueBook("Think and grow rich"));
        System.out.println(libraryServiceImpl.issueBook("Think and grow rich"));
        System.out.println(libraryServiceImpl.issueBook("Think and grow rich"));
        System.out.println(libraryServiceImpl.issueBook("Think and grow rich"));

//        libraryServiceImpl.returnBook("Think and grow rich");
//
//        libraryServiceImpl.addQueue(student3);
//
//        System.out.println(libraryServiceImpl.issueBook("Think and grow rich"));



//        RequestServiceImpl requestStudent1 = new RequestServiceImpl(student1, "think and grow rich");
//
//        RequestServiceImpl requestTeacher = new RequestServiceImpl(teacher1, "think and grow rich");
//        RequestServiceImpl requestStudent2 = new RequestServiceImpl(student2, "think and grow rich");
//        RequestServiceImpl requestStudent3 = new RequestServiceImpl(student3, "think and grow rich1");

        //scenerio 1. Teacher has priority over Student.
//        libraryServiceImpl.borrowBook(requestStudent2, requestTeacher);

        //Scenerio 2. Senior student over Junior Student
//        libraryServiceImpl.borrowBook(requestStudent2, requestStudent1);

        //Scenerio 3. First come first Serve
//        libraryServiceImpl.borrowBook(requestStudent2, requestStudent3);
//        libraryServiceImpl.borrowBook(requestStudent3, requestStudent2);



//        libraryServiceImpl.borrowBook(requestStudent2);
//        libraryServiceImpl.borrowBook(requestStudent1);

//        libraryServiceImpl.borrowBook(requestTeacher);

//        requestTeacher.compareTo(requestStudent2);

//        libraryServiceImpl.removeBook(book1);
//        libraryServiceImpl.borrowBook(book1);

//        System.out.println();


//        System.out.println(book1.getCopies());
//
//        bookServiceImpl1.borrowCopy(book1);
//        bookServiceImpl1.borrowCopy(book2);
//        bookServiceImpl1.borrowCopy(book3);
//        System.out.println(book1.getBookTitle() + " , " + book1.getCopies());
//        System.out.println(book2.getBookTitle() + " , " + book2.getCopies());
//        System.out.println(book3.getBookTitle() + " , " + book3.getCopies());
//        System.out.println();
//        bookServiceImpl1.returnCopy(book3);
//        System.out.println(book3.getBookTitle() + " , " + book3.getCopies());

    }
}
