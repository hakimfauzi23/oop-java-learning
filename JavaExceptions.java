public class JavaExceptions {
    /*
     * When executing Java code, different errors can occur
     * When error happen, Java will normally stop and generate an error
     */

    public static void main(String[] args) {
        // tryAndCatch();
        // finallyState();
        // throwKeyword(15);

    }

    public static void tryAndCatch() {
        /*
         * In java there is Try and catch
         * `try` statement allows you to test block of code for getting errors
         * `carch` statement will executed if error happen in `try` block
         */

        try {
            int[] myNumbers = { 1, 3, 4 };
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("something went wrong");
        }
    }

    public static void finallyState() {
        /*
         * `finally` state lets you execute code, after try catch
         * the result of try catch is not important, the code in finally
         * block will be always executed anyway.
         * 
         */

        try {
            int[] myArrayofNum = { 1, 3, 4, 5, 2 };
            System.out.println(myArrayofNum[99]);
        } catch (Exception e) {
            System.out.println("Something went wrong.");
        } finally {
            System.out.println("The 'try catch' is finished");
        }
    }

    public static void throwKeyword(int age) {
        /*
         * Throw statement allows to create a custom error
         * 
         */

         if (age<18) {
            throw new ArithmeticException("Access denied - you must be at least 18 years old");
         } else {
            System.out.println("Access granted - you are old enough");
         }
    }
}
