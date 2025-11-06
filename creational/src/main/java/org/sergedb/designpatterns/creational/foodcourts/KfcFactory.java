package org.sergedb.designpatterns.creational.foodcourts;

public class KfcFactory implements FoodPlaceFactory {
    @Override
    public Burger sellBurger() {
        return new ZingerBurger();
    }

    @Override
    public Drink sellDrink() {
        return new PepsiDrink();
    }
}
