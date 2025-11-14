package org.sergedb.designpatterns.creational.factorymethod.electronics;

import org.sergedb.designpatterns.creational.factorymethod.Product;
import org.sergedb.designpatterns.creational.factorymethod.Shop;

public class ElectronicsShop implements Shop {

    public Product sell() {
        return new ElectronicsProduct();
    }
}
