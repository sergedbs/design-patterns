package org.sergedb.designpatterns.creational;

import org.sergedb.designpatterns.creational.abstractfactory.FoodPlaceFactory;
import org.sergedb.designpatterns.creational.factorymethod.Shop;

import java.util.ArrayList;

public final class Mall {
    private static Mall instance;
    public final ArrayList<Shop> shops = new ArrayList<>();
    public final ArrayList<FoodPlaceFactory> foodPlaces = new ArrayList<>();

    private Mall() {
    }

    public static Mall getInstance() {
        if (instance == null) {
            instance = new Mall();
        }
        return instance;
    }

    public void addShop(Shop shop) {
        shops.add(shop);
    }

    public void addFoodPlace(FoodPlaceFactory foodPlaceFactory) {
        foodPlaces.add(foodPlaceFactory);
    }

    public int getShopsCount() {
        return shops.size();
    }

    public int getFoodPlacesCount() {
        return foodPlaces.size();
    }
}
