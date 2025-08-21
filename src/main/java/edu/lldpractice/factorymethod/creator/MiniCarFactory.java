package edu.lldpractice.factorymethod.creator;

import edu.lldpractice.factorymethod.product.Cars;
import edu.lldpractice.factorymethod.product.MiniCar;

public class MiniCarFactory implements CarFactory{
    @Override
    public Cars createCars() {
        return new MiniCar();
    }
}
