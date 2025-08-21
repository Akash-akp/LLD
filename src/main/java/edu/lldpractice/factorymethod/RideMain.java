package edu.lldpractice.factorymethod;

import edu.lldpractice.factorymethod.creator.CarFactory;
import edu.lldpractice.factorymethod.creator.MiniCarFactory;
import edu.lldpractice.factorymethod.creator.SUVCarFactory;
import edu.lldpractice.factorymethod.creator.SedanCarFactory;

public class RideMain {
    public static void main(String[] args) {
        CarFactory carFactory = new MiniCarFactory();
        System.out.println(carFactory.createCars().bookRide());
        carFactory = new SedanCarFactory();
        System.out.println(carFactory.createCars().bookRide());
        carFactory = new SUVCarFactory();
        System.out.println(carFactory.createCars().bookRide());
    }
}
