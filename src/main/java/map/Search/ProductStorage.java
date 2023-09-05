package main.java.map.Search;

import java.util.HashMap;
import java.util.Map;

public class ProductStorage {
    private Map<Long, Product> productMap;

    public ProductStorage() {
        this.productMap = new HashMap<>();
    }

    public void addProduct(long productCode, String name, int quantity, double price) {
        productMap.put(productCode, new Product(name, quantity, price));
    }

    public void showProducts() {
        System.out.println(productMap);
    }

    public double StorageSubTotal(){
        double subTotal = 0.00;

        if (!productMap.isEmpty()){
            for (Product product: productMap.values()){
                subTotal += product.getPrice() * product.getQuantity();
            }
        }
        return subTotal;
    }

    public Product getMostExpensiveProduct() {
        Product mostExpensiveProduct = null;
        double highestPrice = Double.MIN_VALUE;

        for (Product product: productMap.values()){
            if (product.getPrice() > highestPrice){
                mostExpensiveProduct = product;
                highestPrice = product.getPrice();
            }
        }
        return mostExpensiveProduct;
    }

    public Product getCheapestProduct() {
        Product cheapestProduct = null;
        double lowestPrice = Double.MAX_VALUE;

        for (Product product: productMap.values()){
            if (product.getPrice() < lowestPrice){
                cheapestProduct = product;
                lowestPrice = product.getPrice();
            }
        }
        return cheapestProduct;
    }

    public Product getMostExpensiveProductByQuantity() {
        Product mostExpensiveProduct = null;
        double highestPrice = Double.MIN_VALUE;

        for (Product product: productMap.values()){
            if ((product.getPrice() * product.getQuantity()) > highestPrice){
                mostExpensiveProduct = product;
                highestPrice = product.getPrice() * product.getQuantity();
            }
        }
        return mostExpensiveProduct;
    }

    public static void main(String[] args) {
        ProductStorage productStorage = new ProductStorage();

        productStorage.addProduct(1, "p1", 1, 19.0);
        productStorage.addProduct(2, "p2", 1, 22.0);
        productStorage.addProduct(3, "p3", 2, 12.0);
        productStorage.addProduct(4, "p4", 1, 16.0);

        productStorage.showProducts();

        System.out.println(productStorage.StorageSubTotal());

        System.out.println(productStorage.getMostExpensiveProduct());

        System.out.println(productStorage.getCheapestProduct());

        System.out.println(productStorage.getMostExpensiveProductByQuantity());
    }
}
