package com.elvislee.receiptprinter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ReceiptTest {
    Receipt receipt = new Receipt();

    @Test
    public void getZeroWhenPriceIsZero() {
        double tax = receipt.calculateTax(0.0, 0.1);
        assertEquals(0.00, tax, 0.001);
    }

    @Test
    public void getZeroWhenTaxRateIsZero() {
        double tax = receipt.calculateTax(12.0, 0.0);
        assertEquals(0.00, tax, 0.001);
    }

    @Test
    public void calculateTaxCorrectly() {
        double tax = receipt.calculateTax(12.49, 0.0);
        assertEquals(0.00, tax, 0.001);

        tax = receipt.calculateTax(10.00, 0.05);
        assertEquals(0.5, tax, 0.001);

        tax = receipt.calculateTax(18.99, 0.10);
        assertEquals(1.9, tax, 0.001);

        tax = receipt.calculateTax(27.99, 0.15);
        assertEquals(4.2, tax, 0.001);
    }
}
