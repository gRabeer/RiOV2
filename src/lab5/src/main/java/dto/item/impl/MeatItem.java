package lab5.src.main.java.dto.item.impl;

import lab5.src.main.java.dto.Catalog;
import lab5.src.main.java.dto.item.GroceryItem;
import lab5.src.main.java.dto.item.Item;

import java.util.Date;

public class MeatItem extends GroceryItem {

    private final String type;

    public MeatItem(String name, double price, Catalog catalog, Date expiration, String type) {
        super(name, price, catalog, expiration);
        this.type = type;
    }
}
