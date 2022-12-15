public class JavaConstructor {
    /*
     * When class init, java automatically create a constructor
     * So with constructor we can set init a class attributes or methods.
     */

    // class attribute.
    int modelYear;
    String modelName;

    public JavaConstructor(int year, String name) {
        /*
         * This is a constuctor, it has public and the name must have same with the file
         * or the Class.
         * Params inside this constructor can use for set class attributes whenn class
         * object is create
         */

        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        JavaConstructor myLaptop = new JavaConstructor(2018, "Asus A442UR");
        System.out.println("I bought my laptop in " + myLaptop.modelYear + " and it's " + myLaptop.modelName);
    }

}
