package edu.lldpractice.commanddesignpattern.concretecommand;

import edu.lldpractice.commanddesignpattern.command.ICommand;
import edu.lldpractice.commanddesignpattern.reciever.RideService;

public class CancelRideCommand implements ICommand {
    private RideService reciever;
    private String passengerName;

    public CancelRideCommand(RideService reciever, String passengerName) {
        this.reciever = reciever;
        this.passengerName = passengerName;
    }

    @Override
    public void execute() {
        reciever.cancelRide(passengerName);
    }
}
