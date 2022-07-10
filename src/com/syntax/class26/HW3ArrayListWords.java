package com.syntax.class26;

import java.util.ArrayList;

public class HW3ArrayListWords {
    //Create an arrayList of words. Remove every word that ends with “e”.

    public static void main(String[] args) {
        ArrayList<String> words=new ArrayList<>();

        words.add("book");
        words.add("music");
        words.add("blame");
        words.add("white");
        words.add("money");

        for(int i=0; i<words.size(); i++){
            if(words.get(i).endsWith("e")){
                words.remove(i);
            }

        }
        System.out.println(words);
    }
}
