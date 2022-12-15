public class JavaClassAttributes {
    /*
     * A class can have many of attributes
     */

    int x = 6; // This is called variable or class attributes
    String fname = "Hakim";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        JavaClassAttributes myObj = new JavaClassAttributes();
        System.out.println(myObj.x); // This is how to access class attributes.

        myObj.x = 99; // Class attributes also can be modify by assign a value to it.
        System.out.println(myObj.x); // 99

        JavaClassAttributes person = new JavaClassAttributes();
        System.out.println("Name: " + person.fname + " " + person.lname);
        System.out.println("Age: " + person.age);
    }
}
