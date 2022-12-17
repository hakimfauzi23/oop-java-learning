public class JavaInterface {
    /*
     * To achieve abstraction we can use interfaces
     * Interfaces is really completely and strict abstract class that is used to
     * group related methods with empty bodies;
     */

    public static void main(String[] args) {
        Rooster myRooster = new Rooster();
        Whale myWhale = new Whale();

        myRooster.animalSound();
        myWhale.animalSound();

        myRooster.sleep();
        myWhale.sleep();
    }

}

interface AnimalInterface {
    /*
     * even though there's no abstract keywords
     * the method cannot have a body
     * because inside the interface
     */

    public void animalSound();

    public void sleep();
}

/*
 * To access interface use `implements` keywords.
 * same like inheritance which use `extends`
 * but in the interface should do polymorphism
 */

class Whale implements AnimalInterface {
    public void animalSound() {
        System.out.println("Whale says woff woff woff");
    }

    public void sleep() {
        System.out.println("Whale : ZZZZZ");
    }

}

class Rooster implements AnimalInterface {
    public void animalSound() {
        System.out.println("Rooster says roarrr roarrr roarr");
    }

    public void sleep() {
        System.out.println("Rooster : ZZZZZ");
    }
}

/**
 * Java does not support multi inheritance that means
 * a subclass cannot inherit more than one classes.
 * 
 * And with interface, it possible to implement multi inheritance
 * 
 */

interface FirstInterface {
    public void methodFirstInterface();
}

interface SecondInterface {
    public void myOtherMethod(); // interface method
}

class DemoClass implements FirstInterface, SecondInterface {
    public void methodFirstInterface() {
        System.out.println("Method from First interface");
    }

    public void myOtherMethod() {
        System.out.println("Method from Second interface");
    }
}