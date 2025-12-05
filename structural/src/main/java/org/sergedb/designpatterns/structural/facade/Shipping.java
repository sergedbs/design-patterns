package org.sergedb.designpatterns.structural.facade;

public class Shipping {
    public void arrangeShipping(String item) {
        System.out.println("[Shipping] Arranging shipping for: " + item);
        System.out.println("[Shipping] Shipping scheduled.");
    }
}
