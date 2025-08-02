package edu.lldpractice.commanddesignpattern;

import edu.lldpractice.commanddesignpattern.command.ICommand;
import edu.lldpractice.commanddesignpattern.concretecommand.BookRideCommand;
import edu.lldpractice.commanddesignpattern.concretecommand.CancelRideCommand;
import edu.lldpractice.commanddesignpattern.invoker.RideInvoker;
import edu.lldpractice.commanddesignpattern.reciever.RideService;

public class RideMain {
    public static void main(String[] args) {
        String passengerName = "John Doe";
        String pickupLocation = "123 Main St";
        String dropLocation = "456 Elm St";
        RideService rideService = new RideService();

        ICommand bookRideCommand = new BookRideCommand(rideService,passengerName,pickupLocation,dropLocation);
        ICommand cancelRideCommand = new CancelRideCommand(rideService,passengerName);

        RideInvoker rideInvoker = new RideInvoker(bookRideCommand, cancelRideCommand);
        rideInvoker.bookRide();
        rideInvoker.cancelRide();

    }
}
