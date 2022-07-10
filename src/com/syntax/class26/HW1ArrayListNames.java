package com.syntax.class26;

import java.util.ArrayList;

public class HW1ArrayListNames {
    //Create an ArrayList that will store 5 names into it.
    //Find out whether the given ArrayList is empty or not?
    //Check whether the specific name is present in an ArrayList or not?
    //Find the size of your arrayList and print all values from that

    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList();
        name.add("Liana");
        name.add("Ivan");
        name.add("Luka");
        name.add("Gevorg");
        name.add("Katarina");

        System.out.println(name.isEmpty());
        System.out.println(name.contains("Luka"));
        System.out.println(name.size());
        System.out.println(name);

        for(String n:name){
            System.out.print(n + " ");
        }
    }
}
