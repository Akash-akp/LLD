package edu.lldpractice.builderdesignpattern;

public interface RideBuilder {
    RideBuilder setPickupLocation(String pickupLocation);
    RideBuilder setDropLocation(String dropLocation);
    RideBuilder setPaymentMethod(String paymentMethod);
    Ride getRide();
}
