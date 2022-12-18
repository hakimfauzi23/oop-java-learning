public class JavaWrapperClasses {
    /*
     * Wrapper classes is use to facilitate primitive data types as objects.
     * Wrapper classes used when working with Collection object such as ArrayList.
     * In ArrayList and another list can only store objects
     */

    public static void main(String[] args) {
        /*
         * To create wrapper object, use the wrapper class instead of the primitive
         * type.
         */

        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        /*
         * Because the primitive type is already converted to objects
         * now we can use certain methods to get specific object.
         * To get value associated with corresponding wrapper object
         * use one of these method :
         * intValue() ; byteValue() ; shortValue(); longValue(); floatValue()
         * doubleValue() ; charValue() ; booleanValue();
         */

    }
}
