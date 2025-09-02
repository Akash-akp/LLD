package edu.lldpractice.builderdesignpattern;

public class Main {
    public static void main(String[] args) {
        // Building a Car Ride
        RideBuilder carRideBuilder = new CarRideBuilder()
                .setPickupLocation("123 Main St")
                .setDropLocation("456 Elm St")
                .setPaymentMethod("Credit Card");
        RideDirector carRideDirector = new RideDirector(carRideBuilder);
        System.out.println(carRideDirector.constructRide());

        // Building a Bike Ride
        RideBuilder bikeRideBuilder = new BikeRideBuilder()
                .setPickupLocation("789 Oak St")
                .setDropLocation("101 Pine St")
                .setPaymentMethod("Cash");
        RideDirector bikeRideDirector = new RideDirector(bikeRideBuilder);
        System.out.println(bikeRideDirector.constructRide());
    }
}
