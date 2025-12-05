package org.sergedb.designpatterns.creational.abstractfactory.mcdonalds;

import org.sergedb.designpatterns.creational.abstractfactory.Burger;
import org.sergedb.designpatterns.creational.abstractfactory.Cola;
import org.sergedb.designpatterns.creational.abstractfactory.FoodPlaceFactory;

public class McDonaldsFactory implements FoodPlaceFactory {
    @Override
    public Burger sellBurger() {
        return new BigMacBurger();
    }

    @Override
    public Cola sellDrink() {
        return new CocaCola();
    }
}
