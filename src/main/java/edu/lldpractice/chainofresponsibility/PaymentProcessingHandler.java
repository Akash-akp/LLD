package edu.lldpractice.chainofresponsibility;

public class PaymentProcessingHandler extends OrderHandler{
    private static int counter = 0;

    public PaymentProcessingHandler(OrderHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void processOrder() {
        System.out.println("Processing payment for the order...");
        if(counter!=2){
            System.out.println("Payment processing failed. Retrying...");
            counter++;
            this.setNextHandler(new PaymentProcessingHandler(
                    new OrderPreparationHandler(
                        new DeliveryAssignmentHandler(
                                new OrderTrackingHandler(
                                        null
                                )
                        )
                    )
            ));
        }else{
            // Simulate payment processing logic
            System.out.println("Payment processed successfully.");
        }

        if (nextHandler != null) {
            nextHandler.processOrder();
        }
    }
}
