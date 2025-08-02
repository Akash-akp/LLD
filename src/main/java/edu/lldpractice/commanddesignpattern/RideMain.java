package edu.lldpractice.commanddesignpattern;

import edu.lldpractice.commanddesignpattern.command.ICommand;
import edu.lldpractice.commanddesignpattern.concretecommand.BookRideCommand;
import edu.lldpractice.commanddesignpattern.concretecommand.CancelRideCommand;
import edu.lldpractice.commanddesignpattern.invoker.RideManager;
import edu.lldpractice.commanddesignpattern.reciever.RideService;

public class RideMain {
    public static void main(String[] args) {
        String passengerName = "John Doe";
        String pickupLocation = "123 Main St";
        String dropLocation = "456 Elm St";

        RideManager rideManager = new RideManager(passengerName, pickupLocation, dropLocation);
        rideManager.bookRide();
        rideManager.cancelRide();

    }
}
