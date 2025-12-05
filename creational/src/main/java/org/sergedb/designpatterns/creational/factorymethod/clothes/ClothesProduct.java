package org.sergedb.designpatterns.creational.factorymethod.clothes;

import org.sergedb.designpatterns.creational.factorymethod.Product;

public class ClothesProduct implements Product {

    public void info() {
        System.out.println("[Clothes] This is a piece of clothing.");
    }
}
