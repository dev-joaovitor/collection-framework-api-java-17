package main.java.map.Sorting;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class OnlineLibrary {
    private Map<String, Book> bookMap;

    public OnlineLibrary(){
        this.bookMap = new HashMap<>();
    }

    public void addBook(String url, String title, String author, double price){
        bookMap.put(url, new Book(title, author, price));
    }

    public void removeBookByTitle(String title){
        for (Map.Entry<String, Book> bookEntry: bookMap.entrySet()){
            if (bookEntry.getValue().getTitle().equalsIgnoreCase(title)){
                bookMap.remove(bookEntry.getKey());
                break;
            }
        }
    }

    public Map<String, Book> sortBooksByPrice(){
        return new TreeMap<>(bookMap);
    }

    public Map<String, Book> findBooksByAuthor(String author){
        Map<String, Book> booksByAuthor = new HashMap<>();

        for (Map.Entry<String, Book> bookEntry: bookMap.entrySet()){
            if (bookEntry.getValue().getAuthor().contains(author)){
                booksByAuthor.put(bookEntry.getKey(), bookEntry.getValue());
            }
        }
        return booksByAuthor;
    }

    public Book getMostExpensiveBook(){
        Book mostExpensiveBook = null;
        double highestPrice = Double.MIN_VALUE;

        for (Map.Entry<String, Book> bookEntry: bookMap.entrySet()){
            if (bookEntry.getValue().getPrice() > highestPrice){
                mostExpensiveBook = bookEntry.getValue();
                highestPrice = bookEntry.getValue().getPrice();
            }
        }
        return mostExpensiveBook;
    }

    public Book getCheapestBook(){
        Book cheapestBook = null;
        double highestPrice = Double.MAX_VALUE;

        for (Map.Entry<String, Book> bookEntry: bookMap.entrySet()){
            if (bookEntry.getValue().getPrice() < highestPrice){
                cheapestBook = bookEntry.getValue();
                highestPrice = bookEntry.getValue().getPrice();
            }
        }
        return cheapestBook;
    }

    public void showBooks(){
        System.out.println(bookMap);
    }

    public static void main(String[] args) {
        OnlineLibrary library = new OnlineLibrary();

        library.addBook("https://a.co/d/6dxn9XB", "Learning Java: An Introduction to Real-World Programming with Java", "Daniel Leuck, Marc Loy, Patrick Niemeyer", 316.13);
        library.addBook("https://a.co/d/2w9kgCp", "Código limpo: Habilidades práticas do Agile Software", "Robert C. Martin", 75.90);
        library.addBook("https://a.co/d/8TVmRbW", "Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos", "Aditya Y. Bhargava", 67.49);
        library.addBook("https://a.co/d/394sTWR", "Java para leigos", "Barry Burd", 86.22);

//        System.out.println(library.getCheapestBook());
//        System.out.println(library.getMostExpensiveBook());
//        System.out.println(library.sortBooksByPrice());
//        library.showBooks();
//        library.removeBookByTitle("Código limpo: Habilidades práticas do Agile Software");
//        library.showBooks();

        System.out.println(library.findBooksByAuthor("Barry"));
    }
}
