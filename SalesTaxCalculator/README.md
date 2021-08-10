# How To Run
The main method is in Cashier class. You can create ShoppingBasket instance and call .addItem(PurchaseItem) to add item into your shopping basket.

To instantiate a PurchaseItem:
new PurchaseItem(ItemName, price, isBook, isFood, isMedical, isImported)

Then, instantiate a Receipt and call .printReceipt(ShoppingBasket) to print the receipt of each item you purchased includes price with tax, sales tax and total amount.

Example:

1 book: 12.49

1 music CD: 16.49

1 chocolate bar: 0.85

Sales Tax: 1.50

Total: 29.83

## Tax Calculation
tax rate * price rounded up to the nearest 0.05. After researching the formula is:
Math.round(price * tax_rate * 20.0) / 20.0
Since 0.05 equals 1/20 and we want to find the nearest, so divide by 0.05 is like multiply to 20. Then, get the round number and divide by 20 to get the original number
Using BigDecimal instead of double for a more precise calculation result

## Test Case Issue
For example input 3: 1 imported box of chocolates 11.25, the tax should be 0.55 and result in 11.80 sales price. However, the document provided says it's 11.85. I'd suggest somebody to modify the result in the Liferay documentation





