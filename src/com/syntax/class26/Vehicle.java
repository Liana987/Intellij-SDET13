package com.syntax.class26;

public class Vehicle {
    /*
    Create a Class Vehicle that would have the following fields:
    vehiclePrice and method calculateSalePrice() which should be returning a price of the Vehicle
     */

    static double vehiclePrice;
    public double calculateSalePrice(){
        return vehiclePrice;
    }
}

public class Track extends Vehicle{

    /*
    The Truck class has field as weight and has its own implementation of  calculateSalePrice() method in which returned price calculated as following:
    if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
     */

    double weight;

    @Override
    public double calculateSalePrice() {
        if(weight>2000) {
            vehiclePrice-=vehiclePrice*0.1;
        } else {
            vehiclePrice-=vehiclePrice*0.2;
        }
        return vehiclePrice;
    }
}
public class Test {
    public static void main(String[] args) {

        Vehicle.vehiclePrice=20000;
        Sedan sedan = new Sedan();
        sedan.length=19;
        System.out.println("Sedan prise is "+sedan.calculateSalePrice());
        Track track = new Track();
        track.weight=1900;
        System.out.println("Track prise is "+track.calculateSalePrice());
    }
}

