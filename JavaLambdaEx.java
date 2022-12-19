import java.util.ArrayList;
import java.util.function.Consumer;

interface StringFunction {

    String run(String str);
}

public class JavaLambdaEx {
    /*
     * Lambda ex is a short block of code which takes in parameter and returns a
     * value!, similiar to methods, but they don't need name and can be implemented
     * right in the body of a method!
     */

    public static void main(String[] args) {
        // lambdaEx();
        lambdaExConsumer();
    }

    public static void lambdaEx() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(10);
        numbers.forEach((n) -> {
            System.out.println(n);
        });

    }

    /* Assign a Lambda Ex in a method! */
    public static void lambdaExConsumer() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(10);
        numbers.add(7);
        Consumer<Integer> method = (n) -> {
            System.out.println(n + 1);
        };

        numbers.forEach(method);
    }

    public static void lambdaExAsParams() {
        StringFunction intimidate = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", intimidate);
        printFormatted("Hello", ask);

    }

    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);

    }

}
