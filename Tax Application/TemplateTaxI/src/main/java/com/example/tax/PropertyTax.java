package com.example.tax;

public class PropertyTax implements Tax {
     double taxableAmount;
     double taxAmount;
     boolean isTaxPayed;

    public PropertyTax() {
        this.isTaxPayed = false;
        
    }

    @Override
    public void setTaxableAmount(int amount) {
        taxableAmount = amount;
    }

    @Override
    public void calculateTaxAmount() {
        // Calculate property tax (5% of property value)
        taxAmount = taxableAmount * 0.05;
    }

    @Override
    public double getTaxAmount() {
        return taxAmount;
    }

    @Override
    public String getTaxType() {
        return "property";
    }

    @Override
    public boolean isTaxPayed() {
        return isTaxPayed;
    }

    @Override
    public void payTax() {
        
        System.out.println("Hi, your property tax is paid.");
        isTaxPayed = true;
    }
}
