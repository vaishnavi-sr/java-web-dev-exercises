package org.launchcode.java.demos.lsn6inheritance;

public class main {
    public static void main(String[] args) {

        Cat suki = new HouseCat("suki",8);

    HouseCat garfield = new HouseCat("Garfield", 12);
    HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight()); //prints:13.0

        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire",12);
        System.out.println(plainCat.noise()); // prints:Meeeeeeooooowww!
        System.out.println(cheshireCat.noise()); // prints:Hello, my name is Cheshire!

        garfield.eat();
//    garfield.sleep();
    // prints true
        System.out.println(garfield.isTired());
        System.out.println(garfield.isHungry());//prints:false
        System.out.println(garfield.getWeight());//prints:12.0
        System.out.println(garfield.getFamily()); //prints:Felidae

        // Calls HouseCat's noise() method
        System.out.println(suki.noise()); // Hello, my name is Suki!(line 6)
// Results in a compiler error, since Cat
// doesn't have such a method
//        suki.isSatisfied();//(6)

// As long as suki really is a HouseCat, this works
//        System.out.println((HouseCat) suki).isSatisfied();//gives RunTime exception ,sukimis declared as a Cat.(6)

    }
}