/*
 * It is possible to inherit atttributes and method from class to another. 
 * There are subclass and superclass
 * to inherit from superclass to subclass we can use extends keyword.
 */
public class JavaInheritance {
}

class Vehicle {
    protected String brand = "Ford"; // Vehicle attribute

    public void honk() { // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}

/*
 * This is subclass from Vehicle superclass
 */
class Car extends Vehicle {

    private String modelName = "Mustang";

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.brand + " " + myCar.modelName);
    }
}
