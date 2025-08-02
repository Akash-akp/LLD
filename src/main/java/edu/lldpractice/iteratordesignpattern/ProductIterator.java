package edu.lldpractice.iteratordesignpattern;

import java.util.List;

public class ProductIterator implements Iterator<Product> {
    List<Product> products;
    int currentIndex;

    public ProductIterator(List<Product> products) {
        this.products = products;
        this.currentIndex = 0;
    }

    public Product first() {
        currentIndex = 0;
        return products.get(currentIndex);
    }

    public Product next() {
        if (hasNext()) {
            return products.get(++currentIndex);
        }
        return null;
    }

    public boolean hasNext() {
        return currentIndex < products.size() - 1;
    }

}
