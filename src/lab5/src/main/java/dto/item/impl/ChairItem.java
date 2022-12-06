package lab5.src.main.java.dto.item.impl;

import lab5.src.main.java.dto.Catalog;
import lab5.src.main.java.dto.item.AbstractItem;
import lab5.src.main.java.dto.item.Item;

public class ChairItem extends AbstractItem {

    private final String material;
    private final String style;

    public ChairItem(String name, double price, Catalog catalog, String material, String style) {
        super(name, price, catalog);
        this.material = material;
        this.style = style;
    }
}
