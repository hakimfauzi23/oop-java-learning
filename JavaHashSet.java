import java.util.HashSet;

public class JavaHashSet {
    /*
     * HashSet is a collection of items where every item is unique
     * HashSet is a class inside java.util package.
     */

    public static void main(String[] args) {

        /* Init a HashSet Cars */
        HashSet<String> cars = new HashSet<String>();

        /* Add Items to HashSet with add() method */
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Volvo");
        cars.add("Volvo");
        cars.add("Volvo");

        /* Even the add has some same value, the collection will not duplicate it */
        System.out.println(cars);

        /*
         * There are some useful methods of this HashSet class
         * contains("Mazda") => check collection has "Mazda" item.
         * remove("Mazda") => remove item which "Mazda"
         * clear() => to remove all items in the collection.
         */

        /* contains() method return true if the items exist and return false if not */
        System.out.println(cars.contains("Toyota"));
        System.out.println(cars.contains("Volvo"));

        /*
         * Loop through a HashSet
         */

        for (String i : cars) {
            System.out.println(i);
        }
    }
}
