package com.elvislee.receiptprinter;

public class Cashier {
    public static void main(String[] args) {
        System.out.println(Math.round(27.99 * 0.15 * 20) / 20.0);

        ShoppingBasket myBasket = new ShoppingBasket();
        myBasket.addItem(new PurchaseItem("book", 12.49, true, false, false, false));
        myBasket.addItem(new PurchaseItem("music CD", 14.99, false, false, false, false));
        myBasket.addItem(new PurchaseItem("chocolate bar", 0.85, false, true, false, false));

        Receipt receipt = new Receipt();
        receipt.printReceipt(myBasket);
    }
}
