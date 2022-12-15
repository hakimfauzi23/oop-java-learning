public class JavaClassMethods {

    public static void main(String[] args) {
        myStaticMethod(); // A static method can be accessed without create an object class.

        JavaClassMethods myObj = new JavaClassMethods(); // A public methods must be called by create an object class.
        myObj.myPublicMethod();
    }

    static void myStaticMethod() {
        System.out.println("Helllo this is static method");
    }

    public void myPublicMethod() {
        System.out.println("Hello this is pubilc method");
    }
}

/*
 * Go to the Transportation.java to see implentation of this topic.
 */
