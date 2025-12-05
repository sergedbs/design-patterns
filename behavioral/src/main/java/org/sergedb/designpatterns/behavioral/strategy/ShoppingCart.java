package org.sergedb.designpatterns.behavioral.strategy;

public class ShoppingCart {
    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
        System.out.println("[ShoppingCart] Payment strategy set.");
    }

    public void checkout(double amount) {
        System.out.println("[ShoppingCart] Checking out $" + amount);
        if (paymentStrategy == null) {
            System.out.println("[ShoppingCart] No payment method selected!");
            return;
        }
        paymentStrategy.pay(amount);
    }
}
