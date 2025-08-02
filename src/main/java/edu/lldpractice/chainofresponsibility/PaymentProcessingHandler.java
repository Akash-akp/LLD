package edu.lldpractice.chainofresponsibility;

public class PaymentProcessingHandler extends OrderHandler{
    public PaymentProcessingHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void processOrder() {
        System.out.println("Processing payment for the order...");
        // Simulate payment processing logic
        System.out.println("Payment processed successfully.");

        if (nextHandler != null) {
            nextHandler.processOrder();
        }
    }
}
