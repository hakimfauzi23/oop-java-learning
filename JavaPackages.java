/*
 *  Java Packages and API
 *  In java you can use Built-in packages or Create a custom packages.
 */

/*
 * Use keyword `import` to use packages
 * You can import packages each class, or can import all packages.
 */

// import java.util.Scanner; // Import Scanner Class from java.util packages
import java.util.*; // Import all classes from java.util packages
import mypackages.*; // Import user defined mypackages packages

public class JavaPackages {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            System.out.println("Enter username");

            String userName = myObj.nextLine(); // use nextLine() method from scanner object.
            System.out.println("Username you input is: " + userName);
        }
        /* 
         * Create and use User Defined Packages
         * mypackages\MyPackageClass.java
         */
        MyPackageClass myObj2 = new MyPackageClass(); 
        System.out.println(myObj2.test()); // use test() method from user defined packages
    }
}
