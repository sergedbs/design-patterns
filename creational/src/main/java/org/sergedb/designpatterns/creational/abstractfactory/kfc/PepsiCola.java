package org.sergedb.designpatterns.creational.abstractfactory.kfc;

import org.sergedb.designpatterns.creational.abstractfactory.Cola;

public class PepsiCola implements Cola {
    public void info() {
        System.out.println("This is a Pepsi Cola.");
    }
}
