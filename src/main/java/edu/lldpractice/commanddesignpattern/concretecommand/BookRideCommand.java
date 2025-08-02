package edu.lldpractice.commanddesignpattern.concretecommand;

import edu.lldpractice.commanddesignpattern.command.ICommand;
import edu.lldpractice.commanddesignpattern.reciever.RideService;

public class BookRideCommand implements ICommand {
    private RideService reciever;
    private String passengerName;
    private String pickupLocation;
    private String dropLocation;

    public BookRideCommand(RideService reciever, String passengerName, String pickupLocation, String dropLocation) {
        this.reciever = reciever;
        this.passengerName = passengerName;
        this.pickupLocation = pickupLocation;
        this.dropLocation = dropLocation;
    }

    @Override
    public void execute() {
        reciever.bookRide(passengerName, pickupLocation, dropLocation);
    }
}
