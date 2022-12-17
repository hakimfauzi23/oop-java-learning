import java.util.LinkedList;

public class JavaLinkedList {
    /*
     * LinkedList is almost identical to the ArrayList;
     * LinkedList class is a collection which can contain many objects of the SAME
     * TYPE
     * 
     * LinkedList class has all of same methods as the ArrayList because they both
     * implement the List interface.
     * 
     * Use an ArrayList for storing and accessing data, and LinkedList to manipulate
     * data.
     */

     public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Honda");
        System.out.println(cars);

        System.out.println(cars.getFirst());
     }
}
