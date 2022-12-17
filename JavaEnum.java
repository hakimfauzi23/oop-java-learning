public class JavaEnum {
    /*
     * Enum is a special class that represent constants or unchangeable value
     * Yes, it just like `final` for variables.
     */

    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        // ENUMS are often used in switch statement to check a value.
        Level myVar = Level.LOW;
        switch (myVar) {
            case LOW:
                System.out.println("This is low level");
                break;
            case MEDIUM:
                System.out.println("This is medium level");
                break;
            case HIGH:
                System.out.println("This is high level");
                break;
            default:
                System.out.println("There's no level");
                break;
        }

        // You also can loop through th enum to get enum values with values()
        for (Level myVar1 : Level.values()) {
            System.out.println(myVar1);
        }
    }
}
