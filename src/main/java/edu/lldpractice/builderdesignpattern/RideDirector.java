package edu.lldpractice.builderdesignpattern;

public class RideDirector {
    private RideBuilder rideBuilder;

    public RideDirector(RideBuilder rideBuilder) {
        this.rideBuilder = rideBuilder;
    }

    public String constructRide() {
        return rideBuilder.getRide().getRideType()+" Ride created with pickup at " + rideBuilder.getRide().getPickupLocation() + " and drop at " + rideBuilder.getRide().getDropLocation();

    }
}
