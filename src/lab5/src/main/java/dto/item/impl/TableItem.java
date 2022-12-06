package lab5.src.main.java.dto.item.impl;

import lab5.src.main.java.dto.Catalog;
import lab5.src.main.java.dto.item.AbstractItem;

public class TableItem extends AbstractItem {

    private final String material;
    private final String style;

    public TableItem(String name, double price, Catalog catalog, String material, String style) {
        super(name, price, catalog);
        this.material = material;
        this.style = style;
    }
}
