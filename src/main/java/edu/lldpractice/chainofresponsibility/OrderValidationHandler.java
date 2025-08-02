package edu.lldpractice.chainofresponsibility;

public class OrderValidationHandler extends OrderHandler {
    public OrderValidationHandler(OrderHandler nextHandler){
        super(nextHandler);
    }

    @Override
    public void processOrder(){
        System.out.println("Order is being validating...");
        System.out.println("Order is validated successfully.");
        if (nextHandler != null) {
            nextHandler.processOrder();
        }
    }
}
