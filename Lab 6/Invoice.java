package taxsystem;

import Lab6.src.taxsystem.TaxCalculator;

public class Invoice extends TaxCalculator {
    public double calculateTotalWithTax(double amount) {
        return amount + (amount * GST_RATE / 100);
    }
}