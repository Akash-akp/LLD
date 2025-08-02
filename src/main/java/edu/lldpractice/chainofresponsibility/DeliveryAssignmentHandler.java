package edu.lldpractice.chainofresponsibility;

public class DeliveryAssignmentHandler extends OrderHandler {
    public DeliveryAssignmentHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }
    @Override
    public void processOrder() {
        System.out.println("Assigning delivery personnel for the order...");
        // Simulate delivery assignment logic
        System.out.println("Delivery personnel assigned successfully.");

        if (nextHandler != null) {
            nextHandler.processOrder();
        }
    }
}
