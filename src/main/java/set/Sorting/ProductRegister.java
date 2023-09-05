package main.java.set.Sorting;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ProductRegister {
    private Set<Product> productSet;

    public ProductRegister() {
        this.productSet = new HashSet<>();
    }

    public void addProduct(String name, long code, double price, int quantity){
        productSet.add(new Product(name, code, price, quantity));
    }

    public Set<Product> showProductsByName() {
        Set<Product> productsByName = new TreeSet<>(productSet);
        return productsByName;
    }

    public Set<Product> showProductsByPrice() {
        Set<Product> productsByPrice = new TreeSet<>(new ComparatorByPrice());
        productsByPrice.addAll(productSet);

        return productsByPrice;
    }

    public void showAllProducts() {
        System.out.println(productSet);
    }

    public static void main(String[] args) {
        ProductRegister productRegister = new ProductRegister();

        productRegister.addProduct("T-shirt", 1, 100.00, 3);
        productRegister.addProduct("Sweater", 3, 300.00, 5);
        productRegister.addProduct("Pants", 2, 250.00, 5);
        productRegister.addProduct("Jacket", 4, 125.00, 7);


//        productRegister.showAllProducts();
//        System.out.println(productRegister.showProductsByName());
        System.out.println(productRegister.showProductsByPrice());
    }

}
