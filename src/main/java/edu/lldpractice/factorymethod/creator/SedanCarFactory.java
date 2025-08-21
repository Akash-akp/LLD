package edu.lldpractice.factorymethod.creator;

import edu.lldpractice.factorymethod.product.Cars;
import edu.lldpractice.factorymethod.product.SedanCar;

public class SedanCarFactory implements CarFactory {

    @Override
    public Cars createCars() {
        return new SedanCar();
    }
}
