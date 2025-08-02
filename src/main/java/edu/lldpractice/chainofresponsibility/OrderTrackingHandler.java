package edu.lldpractice.chainofresponsibility;

public class OrderTrackingHandler extends OrderHandler {

    public OrderTrackingHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void processOrder() {
        System.out.println("Tracking the order...");
        // Simulate order tracking logic
        System.out.println("Order is in transit.");

        if (nextHandler != null) {
            nextHandler.processOrder();
        }
    }
}
