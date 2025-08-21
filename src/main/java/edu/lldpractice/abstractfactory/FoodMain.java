package edu.lldpractice.abstractfactory;

import edu.lldpractice.abstractfactory.creator.BurgerKingFoodFactory;
import edu.lldpractice.abstractfactory.creator.FoodFactory;
import edu.lldpractice.abstractfactory.creator.McDonaldFoodFactory;

public class FoodMain {
    public static void main(String[] args) {
        FoodFactory foodFactory = new BurgerKingFoodFactory();
        System.out.println(foodFactory.createBurger().serveBurger());
        System.out.println(foodFactory.createFrenchFries().serveFrenchFries());
        foodFactory = new McDonaldFoodFactory();
        System.out.println(foodFactory.createBurger().serveBurger());
        System.out.println(foodFactory.createFrenchFries().serveFrenchFries());
    }
}
