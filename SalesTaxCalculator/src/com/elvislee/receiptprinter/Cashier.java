package com.elvislee.receiptprinter;

/*

Objects:
- ShoppingBasket: Use a List to store items to purchase
- PurchaseItem: The item to purchase. Specify name, price, is book, is food, is medical, and it imported
- Receipt: Print each purchased product with name and sale price, total sales tax and total amount.

 */
public class Cashier {
    public static void main(String[] args) {
        ShoppingBasket myBasket = new ShoppingBasket();
        // Input 1:
        myBasket.addItem(new PurchaseItem("book", 12.49, true, false, false, false));
        myBasket.addItem(new PurchaseItem("music CD", 14.99, false, false, false, false));
        myBasket.addItem(new PurchaseItem("chocolate bar", 0.85, false, true, false, false));

        // Input 2:
//        myBasket.addItem(new PurchaseItem("imported box of chocolate", 10.00, false, true, false, true));
//        myBasket.addItem(new PurchaseItem("imported bottle of perfume",  47.50, false, false, false, true));

        // Input 3:
//        myBasket.addItem(new PurchaseItem("imported bottle of perfume", 27.99, false, false, false, true));
//        myBasket.addItem(new PurchaseItem("bottle of perfume",  18.99, false, false, false, false));
//        myBasket.addItem(new PurchaseItem("headache pills", 9.75, false, false, true, false));
//        myBasket.addItem(new PurchaseItem("imported box of chocolates",  11.25, false, true, false, true));

        Receipt receipt = new Receipt();
        receipt.printReceipt(myBasket);
    }
}
