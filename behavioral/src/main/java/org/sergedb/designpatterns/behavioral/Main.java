package org.sergedb.designpatterns.behavioral;

import org.sergedb.designpatterns.behavioral.observer.NewsChannel;
import org.sergedb.designpatterns.behavioral.observer.PhoneUser;
import org.sergedb.designpatterns.behavioral.strategy.CreditCardPayment;
import org.sergedb.designpatterns.behavioral.strategy.PayPalPayment;
import org.sergedb.designpatterns.behavioral.strategy.ShoppingCart;
import org.sergedb.designpatterns.behavioral.command.Light;
import org.sergedb.designpatterns.behavioral.command.LightOnCommand;
import org.sergedb.designpatterns.behavioral.command.LightOffCommand;
import org.sergedb.designpatterns.behavioral.command.RemoteControl;

public class Main {
    public static void main(String[] args) {
        System.out.println("Behavioral Design Patterns Demo\n");

        // Observer demo
        System.out.println("--- Observer Pattern Demo ---");
        NewsChannel channel = new NewsChannel();
        PhoneUser alice = new PhoneUser("Alice");
        PhoneUser bob = new PhoneUser("Bob");

        channel.subscribe(alice);
        channel.subscribe(bob);
        channel.publishNews("Breaking: Design patterns are awesome!");

        // Strategy demo
        System.out.println("\n--- Strategy Pattern Demo ---");
        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new CreditCardPayment());
        cart.checkout(49.99);

        cart.setPaymentStrategy(new PayPalPayment());
        cart.checkout(25.00);

        // Command demo
        System.out.println("\n--- Command Pattern Demo ---");
        Light livingRoomLight = new Light();
        RemoteControl remote = new RemoteControl();

        remote.setCommand(new LightOnCommand(livingRoomLight));
        remote.pressButton();

        remote.setCommand(new LightOffCommand(livingRoomLight));
        remote.pressButton();
    }
}