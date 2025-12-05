package org.sergedb.designpatterns.creational.factorymethod.electronics;

import org.sergedb.designpatterns.creational.factorymethod.Product;

public class ElectronicsProduct implements Product {

    public void info() {
        System.out.println("[Electronics] This is an electronic device.");
    }
}
