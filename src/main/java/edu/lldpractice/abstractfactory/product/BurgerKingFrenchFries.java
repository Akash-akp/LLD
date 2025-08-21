package edu.lldpractice.abstractfactory.product;

public class BurgerKingFrenchFries implements FrenchFries {
    @Override
    public String serveFrenchFries() {
        return "Burger King French Fries served successfully";
    }
}
