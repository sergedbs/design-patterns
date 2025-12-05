package org.sergedb.designpatterns.structural.facade;

public class Inventory {
    public boolean checkStock(String item) {
        System.out.println("[Inventory] Checking stock for: " + item);
        System.out.println("[Inventory] Item is available.");
        return true;
    }
}
