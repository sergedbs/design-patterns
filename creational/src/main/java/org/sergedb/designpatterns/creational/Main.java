package org.sergedb.designpatterns.creational;

import org.sergedb.designpatterns.creational.foodcourts.*;
import org.sergedb.designpatterns.creational.shops.ClothesShop;
import org.sergedb.designpatterns.creational.shops.ElectronicsShop;
import org.sergedb.designpatterns.creational.shops.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creational Design Patterns Demo: Mall Example");

        Mall mall = Mall.getInstance();

        ClothesShop clothesShop = new ClothesShop();
        ElectronicsShop electronicsShop = new ElectronicsShop();

        mall.addShop(clothesShop);
        mall.addShop(electronicsShop);

        Product clothing = clothesShop.sell();
        clothing.info();

        Product electronics = electronicsShop.sell();
        electronics.info();

        System.out.println("Total shops in the mall: " + mall.getShopsCount());

        FoodPlaceFactory kfcFactory = new KfcFactory();
        FoodPlaceFactory mcDonaldsFactory = new McDonaldsFactory();

        mall.addFoodPlace(kfcFactory);
        mall.addFoodPlace(mcDonaldsFactory);

        Burger burger1 = kfcFactory.sellBurger();
        burger1.info();

        Drink drink1 = kfcFactory.sellDrink();
        drink1.info();

        Burger burger2 = mcDonaldsFactory.sellBurger();
        burger2.info();

        Drink drink2 =  mcDonaldsFactory.sellDrink();
        drink2.info();

        System.out.println("Total food places in the mall: " + mall.getFoodPlacesCount());
    }
}