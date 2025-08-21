package edu.lldpractice.abstractfactory.product;

public class McDonaldBurger implements Burger {
    @Override
    public String serveBurger() {
        return "McDonald Burger served successfully";
    }
}
