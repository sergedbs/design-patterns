package org.sergedb.designpatterns.creational.abstractfactory.mcdonalds;

import org.sergedb.designpatterns.creational.abstractfactory.Cola;

public class CocaCola implements Cola {
    public void info() {
        System.out.println("[McDonalds] This is a CocaCola.");
    }
}
