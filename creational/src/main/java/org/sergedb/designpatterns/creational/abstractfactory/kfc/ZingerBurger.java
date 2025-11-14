package org.sergedb.designpatterns.creational.abstractfactory.kfc;

import org.sergedb.designpatterns.creational.abstractfactory.Burger;

public class ZingerBurger implements Burger {
    public void info() {
        System.out.println("This is a Zinger Burger");
    }
}
