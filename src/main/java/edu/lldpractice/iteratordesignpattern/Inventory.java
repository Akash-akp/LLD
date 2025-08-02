package edu.lldpractice.iteratordesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Inventory {
    List<Product> productList;

    public Inventory() {
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public void removeProduct(Product product) {
        productList.remove(product);
    }

    public Iterator<Product> createIterator() {
        return new ProductIterator(productList);
    }
}
