package org.sergedb.designpatterns.structural.decorator;

public abstract class CoffeeDecorator implements Coffee {
    protected final Coffee decoratedCoffee;

    protected CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public void serve() {
        decoratedCoffee.serve();
    }
}
