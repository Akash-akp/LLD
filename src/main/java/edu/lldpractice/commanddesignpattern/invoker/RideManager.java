package edu.lldpractice.commanddesignpattern.invoker;

import edu.lldpractice.commanddesignpattern.command.ICommand;
import edu.lldpractice.commanddesignpattern.concretecommand.BookRideCommand;
import edu.lldpractice.commanddesignpattern.concretecommand.CancelRideCommand;
import edu.lldpractice.commanddesignpattern.reciever.RideService;

public class RideManager {
    private String passengerName;
    private String pickupLocation;
    private String dropLocation;
    private final ICommand bookRideCommand;
    private final ICommand cancelRideCommand;
    private final RideService rideService;

    public RideManager(String passengerName, String pickupLocation,String dropLocation) {
        this.passengerName = passengerName;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
        this.rideService = new RideService();
        this.bookRideCommand = new BookRideCommand(rideService, passengerName, pickupLocation, dropLocation);
        this.cancelRideCommand = new CancelRideCommand(rideService, passengerName);
    }

    public void bookRide() {
        bookRideCommand.execute();
    }

    public void cancelRide() {
        cancelRideCommand.execute();
    }
}
