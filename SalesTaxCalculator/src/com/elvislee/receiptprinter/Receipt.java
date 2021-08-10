package com.elvislee.receiptprinter;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Receipt {

    public void printReceipt(ShoppingBasket shoppingBasket) {
        BigDecimal beforeTaxSum = BigDecimal.ZERO;
        BigDecimal totalPrice = BigDecimal.ZERO;

        for(PurchaseItem item : shoppingBasket.shopItems) {
            String name = item.getItemName();
            double price = item.getPrice();
            double taxRate = item.getTaxRate();
            beforeTaxSum = beforeTaxSum.add(BigDecimal.valueOf(price));

            BigDecimal salePrice = BigDecimal.valueOf(price).add(BigDecimal.valueOf(calcTax(price, taxRate))).setScale(2, RoundingMode.HALF_UP);
            totalPrice = totalPrice.add(salePrice);

            System.out.println("1 " + name + ": " + salePrice);
        }

        BigDecimal salesTax = totalPrice.subtract(beforeTaxSum);
        System.out.println("Sales Tax: " + salesTax);
        System.out.println("Total: " + totalPrice);
    }

    public double calcTax(double price, double taxRate) {
        return Math.round(price * taxRate * 20.0) / 20.0;
    }
}
