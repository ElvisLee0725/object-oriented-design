package com.elvislee.receiptprinter;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class ShoppingBasketTest {
    ShoppingBasket shoppingBasket = new ShoppingBasket();

    @Test
    public void sizeOfShopItemsIsZeroByDefault() {
        assertTrue(shoppingBasket.shopItems.size() == 0);
    }

    @Test
    public void sizeIncreaseByOneWhenAddItem() {
        shoppingBasket.addItem(new PurchaseItem("imported box of chocolate", 10.00, false, true, false, true));
        assertTrue(shoppingBasket.shopItems.size() == 1);

        shoppingBasket.addItem(new PurchaseItem("imported bottle of perfume",  47.50, false, false, false, true));
        assertTrue(shoppingBasket.shopItems.size() == 2);
    }
}
