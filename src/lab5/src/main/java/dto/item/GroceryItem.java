package lab5.src.main.java.dto.item;

import lab5.src.main.java.dto.Catalog;
import lombok.*;

import java.util.Date;


@ToString
public abstract class GroceryItem extends AbstractItem{

    @Getter
    private final Date expiration;

    public GroceryItem(String name, Double price, Catalog catalog, Date expiration) {
        super(name, price, catalog);
        this.expiration = expiration;
    }
}
