public class JavaInnerClass {
    /*
     * Is it possible to nest a classes inside a class.
     * It has purpose to group classes that belong together
     * so the code more readable and maintainable.
     */

    /*
     * Here's the way to access an inner class
     */

    public static void main(String[] args) {
        // Create the outerClass object
        OuterClass myOuter = new OuterClass();

        // Create the inner class object from outer class object
        OuterClass.InnerClass myInner = myOuter.new InnerClass();

        System.out.println(myInner.y + myOuter.x); // output is 15!!
        System.out.println(myInner.innerMethod()); // output is 15!!

        // Static Inner class can be accessed without creating an object of the outer
        // class.
        OuterClass.StaticInnerClass myStaticClass = new OuterClass.StaticInnerClass();
        System.out.println(myStaticClass.z);
    }
}

class OuterClass {
    int x = 10;

    static class StaticInnerClass {
        int z = 111;
    }

    class InnerClass {
        int y = 5;

        // Inner class can access attributes and methods of the outer class.
        public int innerMethod() {
            return x;
        }
    }
}
