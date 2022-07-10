package com.syntax.class26;

import java.util.ArrayList;

public class HW4ArrayList {
    //Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water.
    public static void main(String[] args) {
        ArrayList<String> drink= new ArrayList<>();
        drink.add("Mojito");
        drink.add("Orange juice");
        drink.add("Green Tea");
        drink.add("Pina Colada");
        drink.add("Pivo");

        for(int i=0; i<drink.size(); i++){
            if(drink.get(i).contains("a") || drink.get(i).contains("e")) {
                drink.remove(i);
                drink.add(i, "water");
            }
        }
        System.out.println(drink);

    }
}
