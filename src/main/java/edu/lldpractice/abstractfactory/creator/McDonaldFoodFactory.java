package edu.lldpractice.abstractfactory.creator;

import edu.lldpractice.abstractfactory.product.Burger;
import edu.lldpractice.abstractfactory.product.FrenchFries;
import edu.lldpractice.abstractfactory.product.McDonaldBurger;
import edu.lldpractice.abstractfactory.product.McDonaldFrenchFries;

public class McDonaldFoodFactory  extends FoodFactory {

    @Override
    public Burger createBurger() {
        return new McDonaldBurger();
    }

    @Override
    public FrenchFries createFrenchFries() {
        return new McDonaldFrenchFries();
    }
}
