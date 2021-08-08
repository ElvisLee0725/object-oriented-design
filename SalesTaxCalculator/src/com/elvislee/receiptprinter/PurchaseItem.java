package com.elvislee.receiptprinter;

public class PurchaseItem {
    private String itemName;
    private double price;
    private boolean isBook;
    private boolean isFood;
    private boolean isMedical;
    private boolean isImported;
    private double taxRate;
    private static final double BASIC_SALES_TAX = 0.10;
    private static final double IMPORT_DUTY = 0.05;

    public PurchaseItem(String itemName, double price, boolean isBook, boolean isFood, boolean isMedical, boolean isImported) {
        this.itemName = itemName;
        this.price = price;
        this.isBook = isBook;
        this.isFood = isFood;
        this.isMedical = isMedical;
        this.isImported = isImported;

        this.taxRate = setTaxRate();
    }

    public double setTaxRate() {
        double rate = 0.00;
        if(!isBook && !isFood && !isMedical) {
            rate += BASIC_SALES_TAX;
        }

        if(isImported) {
            rate += IMPORT_DUTY;
        }
        return rate;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
