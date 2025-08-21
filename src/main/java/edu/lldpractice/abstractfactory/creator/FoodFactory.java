package edu.lldpractice.abstractfactory.creator;

import edu.lldpractice.abstractfactory.product.Burger;
import edu.lldpractice.abstractfactory.product.FrenchFries;

public abstract class FoodFactory {
    public abstract Burger createBurger();
    public abstract FrenchFries createFrenchFries();
}
