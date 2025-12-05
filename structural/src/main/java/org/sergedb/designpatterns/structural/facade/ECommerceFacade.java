package org.sergedb.designpatterns.structural.facade;

public class ECommerceFacade {
    private final Inventory inventory = new Inventory();
    private final Payment payment = new Payment();
    private final Shipping shipping = new Shipping();

    public void placeOrder(String item, double price) {
        System.out.println("[Facade] Starting order process for: " + item);

        if (!inventory.checkStock(item)) {
            System.out.println("[Facade] Sorry, item out of stock.");
            return;
        }

        if (!payment.processPayment(item, price)) {
            System.out.println("[Facade] Payment failed.");
            return;
        }

        shipping.arrangeShipping(item);
        System.out.println("[Facade] Order placed successfully.");
    }
}
