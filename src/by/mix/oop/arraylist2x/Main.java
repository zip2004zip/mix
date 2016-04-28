package by.mix.oop.arraylist2x;

import java.util.ArrayList;

/**
 * Created by st on 28.04.2016.
 */
public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> arrayLists = new ArrayList<>();
        arrayLists.add(new ArrayList<String>());
        arrayLists.get(0).add("Blaha!");
        arrayLists.get(0).add("laha!");
        arrayLists.get(0).add("Vlas!");

        for (ArrayList <String> arrayList : arrayLists){
            for (String s : arrayList){
                System.out.println(s);
            }
        }
    }
}
