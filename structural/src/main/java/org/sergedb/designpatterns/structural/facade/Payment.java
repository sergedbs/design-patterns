package org.sergedb.designpatterns.structural.facade;

public class Payment {
    public boolean processPayment(String item, double amount) {
        System.out.println("[Payment] Processing payment for: " + item + " - amount: $" + amount);
        System.out.println("[Payment] Payment processed.");
        return true;
    }
}
