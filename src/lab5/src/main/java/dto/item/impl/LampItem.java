package lab5.src.main.java.dto.item.impl;

import lab5.src.main.java.dto.Catalog;
import lab5.src.main.java.dto.item.AbstractItem;

public class LampItem extends AbstractItem {

    private final String material;
    private final String style;
    private final String typeOfLamp;

    public LampItem(String name, double price, Catalog catalog, String material, String style, String typeOfLamp) {
        super(name, price, catalog);
        this.material = material;
        this.style = style;
        this.typeOfLamp = typeOfLamp;
    }
}
