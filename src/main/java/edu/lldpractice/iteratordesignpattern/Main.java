package edu.lldpractice.iteratordesignpattern;

public class Main {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addProduct(new Product("Laptop", 1500.00));
        inventory.addProduct(new Product("Smartphone", 800.00));
        inventory.addProduct(new Product("Tablet", 300.00));

        Iterator<Product> iterator = inventory.createIterator();
        Product currentProduct = iterator.first();
        while(currentProduct != null) {
            System.out.println(currentProduct.getName() + " - $" + currentProduct.getPrice());
            currentProduct = iterator.next();
        }
    }
}
