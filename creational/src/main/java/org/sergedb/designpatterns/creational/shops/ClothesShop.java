package org.sergedb.designpatterns.creational.shops;

public class ClothesShop implements Shop {

    public Product sell() {
        return new Clothes();
    }
}
