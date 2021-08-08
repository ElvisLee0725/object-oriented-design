package com.elvislee.receiptprinter;

import java.util.ArrayList;
import java.util.List;

public class ShoppingBasket {
    List<PurchaseItem> shopItems;

    public ShoppingBasket() {
        this.shopItems = new ArrayList<>();
    }

    public void addItem(PurchaseItem item) {
        shopItems.add(item);
    }
}
