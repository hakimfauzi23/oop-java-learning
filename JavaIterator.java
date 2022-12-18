import java.util.ArrayList;
import java.util.Iterator;

public class JavaIterator {

    /*
     * Iterator is an object that can be used to loop through collections
     * Iterator is one of classes inside java.util packages.
     */
    public static void main(String[] args) {

        // Init and Add items to ArrayList collection
        ArrayList<String> fruit = new ArrayList<String>();
        fruit.add("Banana");
        fruit.add("Watermelon");
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Melon");

        // Init the iterator
        Iterator<String> it = fruit.iterator();

        // Print the first item.
        System.out.println(it.next());

        /* Lopping through a collection */
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        testRemoveItems();

    }

    public static void testRemoveItems() {
        /*
         * Iterator are desifned to easily change the collections that they loop
         * through.
         * so it's posible to remove items from a collection while looping.
         */

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(9);
        numbers.add(12);
        numbers.add(1);
        numbers.add(19);
        numbers.add(5);
        Iterator<Integer> it = numbers.iterator(); // Init iterator

        /* Loop through collection with iterator */
        while (it.hasNext()) {
            Integer i = it.next();
            if (i < 10) {
                it.remove(); // Remove items if items smaller than 10
            }
        }
        System.out.println(numbers); // Print result of remove with iterator.
    }
}
