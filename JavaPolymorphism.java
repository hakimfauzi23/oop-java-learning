public class JavaPolymorphism {
    /*
     * Polymorphism is use for make methods that inherit from superclass
     * could perform different task.
     * 
     * It means we can perform a single action in different ways.
     */

    public static void main(String[] args) {
        Animal myAnimal = new Animal(); // This is Animal Object.
        Animal myTiger = new Tiger(); // This is Tiger Object.
        Animal myDog = new Dog(); // This is Dog Object.

        myAnimal.animalSound();
        myTiger.animalSound();
        myDog.animalSound();

        /*
         * in the above has same Animal but has different object classes
         * and it's called polymorphism
         */
    }
}

class Animal {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Tiger extends Animal {
    public void animalSound() {
        System.out.println("Tiger says : Rawrrr rawrrr");
    }
}

class Dog extends Animal {
    public void animalSound() {
        System.out.println("The dog says : Wooff Woof");
    }
}
