package org.sergedb.designpatterns.creational.abstractfactory.kfc;

import org.sergedb.designpatterns.creational.abstractfactory.Burger;
import org.sergedb.designpatterns.creational.abstractfactory.Cola;
import org.sergedb.designpatterns.creational.abstractfactory.FoodPlaceFactory;

public class KfcFactory implements FoodPlaceFactory {
    @Override
    public Burger sellBurger() {
        return new ZingerBurger();
    }

    @Override
    public Cola sellDrink() {
        return new PepsiCola();
    }
}
