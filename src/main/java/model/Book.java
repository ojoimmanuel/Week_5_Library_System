package model;

public class Book {
    private String bookTitle;
    private int copies;

    public Book(String bookTitle, int copies) {
        this.bookTitle = bookTitle.toUpperCase();   //make book title non case sensitive
        this.copies = copies;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", copies=" + copies +
                '}';
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public int getCopies() {
        return copies;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }
}
