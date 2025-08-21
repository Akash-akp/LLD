package edu.lldpractice.factorymethod.creator;

import edu.lldpractice.factorymethod.product.Cars;
import edu.lldpractice.factorymethod.product.SUVCar;

public class SUVCarFactory implements CarFactory {
    @Override
    public Cars createCars() {
        return new SUVCar();
    }
}
