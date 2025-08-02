package edu.lldpractice.chainofresponsibility;

public class Main {
    public static void main(String[] args) {
        OrderHandler order = new OrderValidationHandler(
                new PaymentProcessingHandler(
                        new OrderPreparationHandler(
                                new DeliveryAssignmentHandler(
                                        new OrderTrackingHandler(
                                                null
                                        )
                                )
                        )
                )
        );
        order.processOrder();
    }
}
