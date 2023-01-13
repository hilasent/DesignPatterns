// Here we have our abstract class, it is declared abstract and meant to be subclassed by classes
// that provide implementation of the operations.

import java.util.Locale;
import java.util.Scanner;

public abstract class CaffeineBeverage {
    // Here's the template method. It's declared final to prevent subclasses from reworking the sequence of
    // steps in the algorithm

    final void prepareRecipe(){
     boilWater();
     brew();
     pourInCup();
     if(customerWantsCondiments()){
         addCondiments();
     }

    }
    abstract boolean customerWantsCondiments();

    void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    void boilWater() {
        System.out.println("Boiling water...");
    }

    abstract void addCondiments();

    abstract void brew();


    // This is a hook because the subclass can override this method, but doesnt have to.
    // Here we've defined a method with a (mostly) empty default implementation. This method just returns true and does nothing else


}
