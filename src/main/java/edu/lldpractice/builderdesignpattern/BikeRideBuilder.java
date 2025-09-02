package edu.lldpractice.builderdesignpattern;

public class BikeRideBuilder implements RideBuilder{
    private Ride ride;

    public BikeRideBuilder() {
        this.ride = new Ride();
        this.ride.setRideType("Bike");
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
