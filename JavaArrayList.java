import java.util.ArrayList;

public class JavaArrayList {
    /*
     * Arraylist is resizeable array (built-in array cannot be modified.)
     * It's a part of java.util package
     * 
     */

    public static void main(String[] args) {

        // Create new String ArrayList.
        ArrayList<String> cars = new ArrayList<String>();

        // Add element to ArrayList
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        // Access ArrayList element with get();
        System.out.println(cars.get(1));

        // Modify ArrayList element with set();
        System.out.println(cars.set(0, "Supra"));
        System.out.println(cars); // Now the element of 0 ArrayList change to "Supra"

        // To remove an element use remove();
        cars.remove(0);
        System.out.println(cars); // Now "Supra" will deleted!

        // Because it's ArrayList you can loop through it.
        for (String i : cars) {
            System.out.println(i);
        }

        /*
         * Elements in an ArrayList are actually objects.
         * Array List can use other types also.
         * To use other types, have to specify an equivalent wrapper class
         */

        ArrayList<Integer> myNumbers = new ArrayList<Integer>();
        myNumbers.add(99);
        myNumbers.add(32);
        myNumbers.add(88);
        myNumbers.add(78);
        for (int i : myNumbers) {
            System.out.println(i);
        }
    }
}
