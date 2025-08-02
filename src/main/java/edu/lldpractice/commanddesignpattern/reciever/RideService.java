package edu.lldpractice.commanddesignpattern.reciever;

public class RideService {
    public void bookRide(String passengerName, String pickupLocation, String dropLocation) {
        System.out.println("Ride booked for " + passengerName + " from " + pickupLocation + " to " + dropLocation);
    }

    public void cancelRide(String passengerName) {
        System.out.println("Ride cancelled for " + passengerName);
    }
}
