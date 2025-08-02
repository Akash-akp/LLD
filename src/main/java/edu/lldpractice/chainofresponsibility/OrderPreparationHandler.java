package edu.lldpractice.chainofresponsibility;

public class OrderPreparationHandler extends OrderHandler {
    public OrderPreparationHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }
    @Override
    public void processOrder() {
        System.out.println("Preparing the order...");
        // Simulate order preparation logic
        System.out.println("Order prepared successfully.");

        if (nextHandler != null) {
            nextHandler.processOrder();
        }
    }
}
