public class JavaEncapsulation {
    /*
     * Encapsulation is to make user cannot see
     * the sensitive or how data is processed.
     * 
     * This can be done by declare class variables/attributes as private
     * 
     * To modify an see a private variable provide getter and setter methods.
     */

    private String name;

    // Getter method for see the private attribute
    public String getName() {
        return name;
    }

    // Setter method for modify the private attribute
    public void setName(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {

        JavaEncapsulation myObj = new JavaEncapsulation();
        myObj.setName("Hakim"); // Modify private attribute with setter 
        System.out.println(myObj.getName()); // See private attribute with get 
    }
}
