package org.sergedb.designpatterns.creational.factorymethod.electronics;

import org.sergedb.designpatterns.creational.factorymethod.Product;

public class ElectronicsProduct implements Product {

    public void info() {
        System.out.println("This is an electronic device.");
    }
}
