package edu.lldpractice.commanddesignpattern.invoker;

import edu.lldpractice.commanddesignpattern.command.ICommand;

public class RideInvoker {
    private final ICommand bookRideCommand;
    private final ICommand cancelRideCommand;

    public RideInvoker(ICommand bookRideCommand, ICommand cancelRideCommand) {
        this.bookRideCommand = bookRideCommand;
        this.cancelRideCommand = cancelRideCommand;
    }

    public void bookRide() {
        bookRideCommand.execute();
    }

    public void cancelRide() {
        cancelRideCommand.execute();
    }
}
