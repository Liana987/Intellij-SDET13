package com.syntax.class26;

public class Sedan extends Vehicle {
    /*
    The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
    if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
     */
    double length;

    @Override
    public double calculateSalePrice() {
        if (length > 20) {
            vehiclePrice -= vehiclePrice * 0.05;
        } else {
            vehiclePrice -= vehiclePrice * 0.1;
        }
        return vehiclePrice;
    }
}
