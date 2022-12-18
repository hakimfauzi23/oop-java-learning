import java.util.HashMap;

public class JavaHashMap {
    /*
     * Hashmap store items in "key/value" pairs
     * Not like ArrayList which store items in index number
     * 
     * Key and Value can be different type
     * i.e : You can have String Key, but Integer Value!
     */

    public static void main(String[] args) {
        /* Init a HashMap with String Key and String Value */
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        /*
         * Because HashMap is one of the classes from java.util package
         * HashMap has many methods.
         */

        /* Add keys and values into capitalCities HashMap with put() */
        capitalCities.put("England", "London");
        capitalCities.put("Indonesia", "Jakarta");
        capitalCities.put("Germany", "Berlin");

        /* Access an value use get(key) with reference key as arguments */
        System.out.println(capitalCities.get("Indonesia")); // Jakarta

        System.out.println(capitalCities);

        /*
         * And there are another useful methods
         * remove(key) => to remove an item refer to it's key
         * clear() => to remove all item from HashMap
         * size() => to count HashMap items.
         */

        /* Loop Through HashMap */

        /* keySet() to get keys only */
        for (String i : capitalCities.keySet()) {
            System.out.println(i);
        }

        /* values() to get values only */
        for (String i : capitalCities.values()) {
            System.out.println(i);
        }

        /* Handle print key and values */
        for (String i : capitalCities.keySet()) {
            System.out.println("Key: " + i + " value: " + capitalCities.get(i));
        }

    }
}
