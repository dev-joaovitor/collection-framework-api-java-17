package main.java.list.Search;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private List<Book> bookList;

    public BookCatalog() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(String title, String author, int publishedYear) {
        bookList.add(new Book(title, author, publishedYear));
    }

    public List<Book> searchByAuthor(String author) {
        List<Book> booksByAuthor = new ArrayList<>();

        if (!bookList.isEmpty()) {
            for (Book book: bookList) {
                if (book.getAuthor().equalsIgnoreCase(author)) {
                    booksByAuthor.add(book);
                }
            }
        }
        return booksByAuthor;
    }

    public List<Book> searchByYearRange(int startYear, int endYear) {
        List<Book> booksByYearRange = new ArrayList<>();

        if (!bookList.isEmpty()) {
            for (Book book: bookList) {
                if (book.getPublishedYear() >= startYear && book.getPublishedYear() <= endYear) {
                    booksByYearRange.add(book);
                }
            }
        }
        return booksByYearRange;
    }

    public Book searchByTitle(String name) {
        Book bookByTitle = null;

        if (!bookList.isEmpty()) {
            for (Book book: bookList) {
                if (book.getTitle().equalsIgnoreCase(name)) {
                    bookByTitle = book;
                    break;
                }
            }
        }
        return bookByTitle;
    }

    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog();

        bookCatalog.addBook("Title 1", "Author 1", 2021);
        bookCatalog.addBook("Title 1", "Author 2", 2020);
        bookCatalog.addBook("Title 2", "Author 2", 2022);
        bookCatalog.addBook("Title 3", "Author 3", 2023);
        bookCatalog.addBook("Title 4", "Author 4", 1964);

        System.out.println(bookCatalog.searchByAuthor("Author 2"));
        System.out.println(bookCatalog.searchByYearRange(2020, 2021));
        System.out.println(bookCatalog.searchByTitle("Title 1"));

    }
}
