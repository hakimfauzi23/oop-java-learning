import java.util.Scanner;

public class JavaUserInput {
    /*
     * To get user input use Scanner class from java.util package
     * we can create object from Scanner class and access it's method
     */

    public static void main(String[] args) {
        try (Scanner myScanner = new Scanner(System.in)) {
            System.out.println("Enter name, age and GPA");

            // To validate user input string use nextLine() method
            String name = myScanner.nextLine();

            // To validate user input integer use nextInt() method
            int age = myScanner.nextInt();

            // To validate user input double use nextDouble() method
            Double gpa = myScanner.nextDouble();

            System.out.println("Name : " + name);
            System.out.println("Age : " + age);
            System.out.println("GPA : " + gpa);
        }
    }

}
