/*
 * To create class use keyword `class`
 */

public class JavaClassAndObject {
    int x = 5;

    public static void main(String[] args) {

        /*
         * These below is the way to access a class
         */

        JavaClassAndObject myObj1 = new JavaClassAndObject(); // Init a class to variable
        JavaClassAndObject myObj2 = new JavaClassAndObject(); // Init a class to variable
        System.out.println(myObj1.x); // access whatever inside class with . (dot) because it's object form
        System.out.println(myObj2.x); // access whatever inside class with . (dot) because it's object form
    }

}
