package main;

import enums.PersonGroup;
import model.*;
import serviceImplementation.BookServiceImpl;
import serviceImplementation.LibraryServiceImpl;

import java.util.Map;

public class Main {



    public static void main(String[] args) {
        Book book1 = new Book("Think and Grow Rich", 6);
        Book book2 = new Book("Failing Forward", 1);
        Book book3 = new Book("As a man Thinketh", 10);


        LibraryServiceImpl libraryServiceImpl = new LibraryServiceImpl();

        libraryServiceImpl.addBook(book1);
        libraryServiceImpl.addBook(book2);
        libraryServiceImpl.addBook(book3);

        // Scenerio 1. Pick Teacher over Student
        System.out.println("\n******PICK TEACHER OVER STUDENT******");
        Student student1 = new Student("Bolu-100", PersonGroup.STUDENT, 100);
        Teacher teacher1 = new Teacher("Samuel", PersonGroup.TEACHER);
        libraryServiceImpl.addQueue(teacher1);
        libraryServiceImpl.addQueue(student1);
        System.out.println(libraryServiceImpl.issueBook("Think and grow rich"));
        System.out.println(libraryServiceImpl.issueBook("Think and grow rich"));

        //Scenerio 2: Pick senior student over junior student
        System.out.println("\n******PICK SENIOR STUDENT OVER JUNIOR STUDENT******");
        Student student2 = new Student("James-200", PersonGroup.STUDENT, 200);
        Student student3 = new Student("Seun-300", PersonGroup.STUDENT, 300);
        libraryServiceImpl.addQueue(student2);
        libraryServiceImpl.addQueue(student3);
        System.out.println(libraryServiceImpl.issueBook("Think and grow rich"));
        System.out.println(libraryServiceImpl.issueBook("Think and grow rich"));

        //Scenerio 3: First come first serve
        System.out.println("\n******FIRST COME FIRST SERVE******");
        Student student4 = new Student("Leah-300", PersonGroup.STUDENT, 300);
        Student student5 = new Student("Jane-300", PersonGroup.STUDENT, 300);
        libraryServiceImpl.addQueue(student4);
        libraryServiceImpl.addQueue(student5);
        System.out.println(libraryServiceImpl.issueBook("Think and grow rich"));
        System.out.println(libraryServiceImpl.issueBook("Think and grow rich"));

        // If book copy is unavailable
        System.out.println("\n******WHEN BOOK COPY IS FINISHED******");
        libraryServiceImpl.addQueue(student3);
        System.out.println(libraryServiceImpl.issueBook("Think and grow rich"));


        // if book is returned and issued to a student
        System.out.println("\n******WHEN BOOK COPY IS RETURNED******");
        System.out.println(libraryServiceImpl.returnBook("Think and grow rich"));
        libraryServiceImpl.addQueue(student3);
        System.out.println();
        System.out.println(libraryServiceImpl.issueBook("Think and grow rich"));



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
