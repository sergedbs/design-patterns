package org.sergedb.designpatterns.creational.foodcourts;

public class McDonaldsFactory implements FoodPlaceFactory {
    @Override
    public Burger sellBurger() {
        return new BigMacBurger();
    }

    @Override
    public Drink sellDrink() {
        return new CokeDrink();
    }
}
