package edu.lldpractice.builderdesignpattern;

public class CarRideBuilder implements RideBuilder{
    private Ride ride;

    public CarRideBuilder() {
        this.ride = new Ride();
        this.ride.setRideType("Car");
    }

    @Override
    public RideBuilder setPickupLocation(String pickupLocation) {
        ride.setPickupLocation(pickupLocation);
        return this;
    }

    @Override
    public RideBuilder setDropLocation(String dropLocation) {
        ride.setDropLocation(dropLocation);
        return this;
    }

    @Override
    public RideBuilder setPaymentMethod(String paymentMethod) {
        ride.setPaymentMethod(paymentMethod);
        return this;
    }

    @Override
    public Ride getRide() {
        return this.ride;
    }
}
