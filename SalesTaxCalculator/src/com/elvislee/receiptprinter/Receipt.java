package com.elvislee.receiptprinter;

public class Receipt {

    public void printReceipt(ShoppingBasket shoppingBasket) {
        double beforeTax = 0.00;
        double totalPrice = 0.00;
        for(PurchaseItem item : shoppingBasket.shopItems) {
            String name = item.getItemName();
            double price = item.getPrice();
            beforeTax += price;
            double salePrice = price * (1 + item.getTaxRate());
            totalPrice += salePrice;

            System.out.println("1 " + name + ": " + salePrice);
        }

        System.out.println("Sales Tax: " + (totalPrice - beforeTax));
        System.out.println("Total: " + totalPrice);
    }
}
