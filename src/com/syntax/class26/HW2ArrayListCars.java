package com.syntax.class26;

import java.util.ArrayList;

public class HW2ArrayListCars {
    //Create an arraylist of cars and retrieve all the values using 3 different ways.

    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>();
        cars.add("Volkswagen");
        cars.add("Daimler Chrysler");
        cars.add("Volvo");
        cars.add("Smart");
        cars.add("Audi");

        System.out.println(cars);

        for(String car:cars){
            System.out.print(car+ " ");
        }

        for(int i=0; i< cars.size(); i++){
            System.out.println(cars.get(i));
        }
    }
}
