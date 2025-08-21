package edu.lldpractice.factorymethod.product;

public class SUVCar implements Cars {
    @Override
    public String bookRide() {
        return "SUV Car booked successfully";
    }
}
