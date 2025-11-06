package org.sergedb.designpatterns.creational.shops;

public class ElectronicsShop implements Shop {

    public Product sell() {
        return new Electronics();
    }
}
