package com.elvislee.receiptprinter;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PurchaseItemTest {
    @Test
    public void setTaxRateToTenPercentForNonBookFoodMedicalNonImport() {
        PurchaseItem item = new PurchaseItem("music CD", 14.99, false, false, false, false);
        double rate = item.getTaxRate();
        assertEquals(0.10, rate, 0.001);
    }

    @Test
    public void setTaxRateToZeroForBookFoodMedicalNonImport() {
        PurchaseItem item1 = new PurchaseItem("music CD", 14.99, true, false, false, false);
        double rate = item1.getTaxRate();
        assertEquals(0.0, rate, 0.001);

        PurchaseItem item2 = new PurchaseItem("music CD", 14.99, false, true, false, false);
        rate = item2.getTaxRate();
        assertEquals(0.0, rate, 0.001);

        PurchaseItem item3 = new PurchaseItem("music CD", 14.99, false, false, true, false);
        rate = item3.getTaxRate();
        assertEquals(0.0, rate, 0.001);
    }

    @Test
    public void setTaxRateToPointZeroFiveForImportedBookFoodMedical() {
        PurchaseItem item1 = new PurchaseItem("music CD", 14.99, true, false, false, true);
        double rate = item1.getTaxRate();
        assertEquals(0.05, rate, 0.001);

        PurchaseItem item2 = new PurchaseItem("music CD", 14.99, false, true, false, true);
        rate = item2.getTaxRate();
        assertEquals(0.05, rate, 0.001);

        PurchaseItem item3 = new PurchaseItem("music CD", 14.99, false, false, true, true);
        rate = item3.getTaxRate();
        assertEquals(0.05, rate, 0.001);
    }

    @Test
    public void setTaxRateToFifteenPercentForImportedNonBookFoodMedical() {
        PurchaseItem item = new PurchaseItem("imported bottle of perfume", 27.99, false, false, false, true);
        double rate = item.getTaxRate();
        assertEquals(0.15, rate, 0.001);
    }
}
