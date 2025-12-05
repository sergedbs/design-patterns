package org.sergedb.designpatterns.creational;

import org.sergedb.designpatterns.creational.abstractfactory.Burger;
import org.sergedb.designpatterns.creational.abstractfactory.Cola;
import org.sergedb.designpatterns.creational.abstractfactory.FoodPlaceFactory;
import org.sergedb.designpatterns.creational.abstractfactory.kfc.KfcFactory;
import org.sergedb.designpatterns.creational.abstractfactory.mcdonalds.McDonaldsFactory;
import org.sergedb.designpatterns.creational.factorymethod.clothes.ClothesShop;
import org.sergedb.designpatterns.creational.factorymethod.electronics.ElectronicsShop;
import org.sergedb.designpatterns.creational.factorymethod.Product;

public class Main {
    public static void main(String[] args) {
        System.out.println("Creational Design Patterns Demo: Mall Example");

        // Singleton
        Mall mall = Mall.getInstance();

        // Factory Method
        System.out.println("\n--- Factory Method Pattern Demo ---"); 
        ClothesShop clothesShop = new ClothesShop();
        ElectronicsShop electronicsShop = new ElectronicsShop();

        mall.addShop(clothesShop);
        mall.addShop(electronicsShop);

        Product clothing = clothesShop.createProduct();
        clothing.info();

        Product electronics = electronicsShop.createProduct();
        electronics.info();

        System.out.println("[Singleton] Total shops in the mall: " + mall.getShopsCount());

        // Abstract Factory
        System.out.println("\n--- Abstract Factory Pattern Demo ---");
        FoodPlaceFactory kfcFactory = new KfcFactory();
        FoodPlaceFactory mcDonaldsFactory = new McDonaldsFactory();

        mall.addFoodPlace(kfcFactory);
        mall.addFoodPlace(mcDonaldsFactory);

        Burger burger1 = kfcFactory.sellBurger();
        burger1.info();

        Cola cola1 = kfcFactory.sellDrink();
        cola1.info();

        Burger burger2 = mcDonaldsFactory.sellBurger();
        burger2.info();

        Cola cola2 =  mcDonaldsFactory.sellDrink();
        cola2.info();

        System.out.println("[Singleton] Total food places in the mall: " + mall.getFoodPlacesCount());
    }
}