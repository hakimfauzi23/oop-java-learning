public class JavaAbstraction {

    /*
     * Data abstraction has function to hide certain details (show important only)
     * Abstraction can be done with abstract classes or interfaces.
     * there are `abstract` keyword and it is a non-access modifier.
     */
    public static void main(String[] args) {

        // best practice : Use polymorphism for access abstracts method
        Animal myLion = new Lion();
        Animal mySnake = new Snake();

        myLion.animalSound();
        myLion.slepp();

        mySnake.animalSound();
        mySnake.slepp();
    }
}

// These abstract class cannot produce an object.
// If you tried, it will generate error though.
abstract class Animal {
    // abstract method does not have body.
    public abstract void animalSound();

    public void slepp() {
        System.out.println("zzzzzz");
    }
}

/*
 * To access abstract class, it must be inherited from another class.
 * use Polymorphism to access abstract methods from abstract class.
 */

class Lion extends Animal {

    public void animalSound() {
        System.out.println("The lion says : Roarr!!!");
    }
}

class Snake extends Animal {
    public void animalSound() {
        System.out.println("The snake says : SSssttttt");
    }
}
