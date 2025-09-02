package edu.lldpractice.builderdesignpattern;

public class Ride {
    private String rideType;
    private String pickupLocation;
    private String dropLocation;
    private String paymentMethod;

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getRideType() {
        return rideType;
    }

    public String getPickupLocation() {
        return pickupLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }
}
