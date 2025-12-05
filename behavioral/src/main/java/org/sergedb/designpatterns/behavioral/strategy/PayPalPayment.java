package org.sergedb.designpatterns.behavioral.strategy;

public class PayPalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("[PayPal] Paying $" + amount + " via PayPal...");
        System.out.println("[PayPal] Payment processed.");
    }
}
