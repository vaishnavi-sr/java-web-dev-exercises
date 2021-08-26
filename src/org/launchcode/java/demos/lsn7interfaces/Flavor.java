package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Flavor extends Ingredient {
     String Name;

    public Flavor(String aName, double aCost, ArrayList<String> someAllergens){
        super (aName, aCost, someAllergens);
    }


    public Comparable getName() {
        return Name;
    }
}
