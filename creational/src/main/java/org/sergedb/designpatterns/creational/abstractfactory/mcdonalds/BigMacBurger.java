package org.sergedb.designpatterns.creational.abstractfactory.mcdonalds;

import org.sergedb.designpatterns.creational.abstractfactory.Burger;

public class BigMacBurger implements Burger {
    public void info() {
        System.out.println("[McDonalds] This is a Big Mac Burger");
    }
}
