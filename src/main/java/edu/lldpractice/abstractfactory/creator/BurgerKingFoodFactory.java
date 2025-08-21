package edu.lldpractice.abstractfactory.creator;

import edu.lldpractice.abstractfactory.product.Burger;
import edu.lldpractice.abstractfactory.product.BurgerKingBurger;
import edu.lldpractice.abstractfactory.product.BurgerKingFrenchFries;
import edu.lldpractice.abstractfactory.product.FrenchFries;

public class BurgerKingFoodFactory extends FoodFactory {

    @Override
    public Burger createBurger() {
        return new BurgerKingBurger();
    }

    @Override
    public FrenchFries createFrenchFries() {
        return new BurgerKingFrenchFries();
    }
}
