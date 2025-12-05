package org.sergedb.designpatterns.structural.decorator;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public void serve() {
        System.out.println("[Decorator] Adding sugar...");
        super.serve();
        System.out.println("[Decorator] Sugar dissolved, enjoy the sweetness!");
    }
}
