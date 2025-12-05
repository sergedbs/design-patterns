package org.sergedb.designpatterns.behavioral.strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("[CreditCard] Paying $" + amount + " with credit card...");
        System.out.println("[CreditCard] Payment processed.)");
    }
}
