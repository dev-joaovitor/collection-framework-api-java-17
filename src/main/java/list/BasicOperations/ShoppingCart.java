package main.java.list.BasicOperations;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> shoppingList;
    private double subTotal = 0.0;

    public ShoppingCart() {
        this.shoppingList = new ArrayList<>();
    }

    public void addItem(String name, double price, int quantity) {
        shoppingList.add(new Item(name, price, quantity));
        this.subTotal += price * quantity;
    }

    public void removeItemByName(String name) {
        List<Item> itemsToRemove = new ArrayList<>();

        if (!shoppingList.isEmpty()) {
            for (Item i : shoppingList) {
                if (i.getName().equalsIgnoreCase(name)) {
                    itemsToRemove.add(i);
                    this.subTotal -= i.getPrice();
                }
            }
            shoppingList.removeAll(itemsToRemove);
            return;
        }
        System.out.println("The shopping list is empty!");
    }

    public void getSubTotal() {
        System.out.println("Shopping Cart Subtotal: " + this.subTotal);
    }

    public void showItems() {
        System.out.println(shoppingList);
    }

    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();

//        shoppingCart.addItem("basic white t-shirt", 100, 3);
//        shoppingCart.addItem("adventure time t-shirt",  50.0, 1);
        shoppingCart.addItem("adventure time t-shirt",  50.0, 1);
//        shoppingCart.addItem("mr robot jacket",  120.98, 1);

        shoppingCart.showItems();
        shoppingCart.getSubTotal();

        shoppingCart.removeItemByName("adventure time t-shirt");
//        shoppingCart.addItem("mouse zowie ec2", 300.29, 1);
        shoppingCart.showItems();
        shoppingCart.getSubTotal();
    }
}
