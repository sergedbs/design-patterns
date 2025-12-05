package org.sergedb.designpatterns.structural.decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public void serve() {
        System.out.println("[Coffee] Serving plain coffee.");
    }
}
