package edu.lldpractice.singletondesignpattern;

public class FoodApp {
    public static void main(String[] args) {
        CartManager cartManager = CartManager.getInstance();
        cartManager.addItem("Pizza");
        cartManager.addItem("Burger");
        System.out.println("Items in cart: " + cartManager.getItems());
        cartManager.removeItem("Pizza");
        System.out.println("Items in cart after removal: " + cartManager.getItems());
        cartManager.clearCart();
        System.out.println("Items in cart after clearing: " + cartManager.getItems());
    }
}
