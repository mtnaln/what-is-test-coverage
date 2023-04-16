package com.metin.medium.test.coverage;

public class TaxCalculationService {
    public float calculate(float price, float tax) {
       return price + ((price * tax)/100);
    }
}

