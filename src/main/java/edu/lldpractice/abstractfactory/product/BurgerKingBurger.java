package edu.lldpractice.abstractfactory.product;

public class BurgerKingBurger implements Burger {
    @Override
    public String serveBurger() {
        return "Burger King Burger served successfully";
    }
}
