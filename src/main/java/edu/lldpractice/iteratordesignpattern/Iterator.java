package edu.lldpractice.iteratordesignpattern;

public interface Iterator<T> {
    T first();
    T next();
    boolean hasNext();

}
