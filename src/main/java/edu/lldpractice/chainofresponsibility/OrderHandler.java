package edu.lldpractice.chainofresponsibility;

public abstract class OrderHandler {
    protected OrderHandler nextHandler;

    public OrderHandler(OrderHandler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract void processOrder();

}
