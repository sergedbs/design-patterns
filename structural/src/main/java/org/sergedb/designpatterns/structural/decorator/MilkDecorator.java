package org.sergedb.designpatterns.structural.decorator;

public class MilkDecorator extends CoffeeDecorator {
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public void serve() {
        System.out.println("[Decorator] Adding milk...");
        super.serve();
        System.out.println("[Decorator] Milk mixed in, enjoy the creaminess!");
    }
}
