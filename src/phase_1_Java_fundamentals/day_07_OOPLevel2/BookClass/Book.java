package phase_1_Java_fundamentals.day_07_OOPLevel2.BookClass;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages > 0 ? pages : 100;
    }
}
