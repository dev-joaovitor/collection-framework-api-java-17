package main.java.map.Sorting;

import java.nio.DoubleBuffer;

public class Book implements Comparable<Book> {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(Book book) {
        return Double.compare(price, book.getPrice());
    }

    @Override
    public String toString() {
        return "\n" +
                "title='" + title + "\n" +
                "author='" + author + "\n" +
                "price=" + price +
                "\n\n";
    }
}
