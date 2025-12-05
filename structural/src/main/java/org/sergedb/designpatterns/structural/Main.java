package org.sergedb.designpatterns.structural;

import org.sergedb.designpatterns.structural.adapter.EuroSocket;
import org.sergedb.designpatterns.structural.adapter.EuroToUSAdapter;
import org.sergedb.designpatterns.structural.adapter.Plug;
import org.sergedb.designpatterns.structural.decorator.Coffee;
import org.sergedb.designpatterns.structural.decorator.MilkDecorator;
import org.sergedb.designpatterns.structural.decorator.SugarDecorator;
import org.sergedb.designpatterns.structural.decorator.SimpleCoffee;
import org.sergedb.designpatterns.structural.facade.ECommerceFacade;

public class Main {
    public static void main(String[] args) {
        System.out.println("Structural Design Patterns Demo — simple analogies\n");

        // Adapter
        System.out.println("--- Adapter Pattern Demo ---");
        EuroSocket euroSocket = new EuroSocket();
        Plug adapter = new EuroToUSAdapter(euroSocket);
        adapter.plugIn();

        // Decorator
        System.out.println("\n--- Decorator Pattern Demo ---");
        Coffee coffee = new SimpleCoffee();
        coffee = new MilkDecorator(coffee);
        coffee = new SugarDecorator(coffee);
        coffee.serve();

        // Facade
        System.out.println("\n--- Facade Pattern Demo ---");
        ECommerceFacade facade = new ECommerceFacade();
        facade.placeOrder("Capra cu trei iezi", 29.99);
    }
}