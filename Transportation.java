public class Transportation {

    public static void main(String[] args) {
        Transportation myCar = new Transportation();
        myCar.fullThrottle(); // call fullThrottle() method
        myCar.speed(320); // call maxSpeed() method contain an argument in it.
    }

    /* Create a fullThrottle method */
    public void fullThrottle() {
        System.out.println("The car is going as fast as it can");
    }

    /* Create a speed() method and add a parameter integer parameter */
    public void speed(int maxSpeed) {
        System.out.println("Max speed is: " + maxSpeed);
    }

}
