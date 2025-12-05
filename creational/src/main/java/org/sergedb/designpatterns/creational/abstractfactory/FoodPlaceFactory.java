package org.sergedb.designpatterns.creational.abstractfactory;

public interface FoodPlaceFactory {
    Burger sellBurger();
    Cola sellDrink();
}
