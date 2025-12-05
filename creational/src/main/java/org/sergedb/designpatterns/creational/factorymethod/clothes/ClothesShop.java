package org.sergedb.designpatterns.creational.factorymethod.clothes;

import org.sergedb.designpatterns.creational.factorymethod.Product;
import org.sergedb.designpatterns.creational.factorymethod.Shop;

public class ClothesShop implements Shop {

    public Product createProduct() {
        return new ClothesProduct();
    }
}
