package main.java.set.Sorting;

import java.util.Comparator;
import java.util.Objects;

public class Product implements Comparable<Product> {
    private String name;
    private long productCode;
    private double price;
    private int quantity;

    public Product(String name, long productCode, double price, int quantity) {
        this.name = name;
        this.productCode = productCode;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public long getProductCode() {
        return productCode;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return getProductCode() == product.getProductCode();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProductCode());
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", productCode=" + productCode +
                ", price=" + price +
                ", quantity=" + quantity +
                "}\n";
    }

    @Override
    public int compareTo(Product product) {
        return this.name.compareToIgnoreCase(product.getName());
    }
}

class ComparatorByPrice implements Comparator<Product> {

    @Override
    public int compare(Product product1, Product product2) {
        return Double.compare(product1.getPrice(), product2.getPrice());
    }
}