import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {
    /*
     * In Java there's package for handling time it is java.time
     * It can use for work with date and time API
     */

    public static void main(String[] args) {
        /*
         * Sometimes when work with date time
         * We want the format suit with the needs
         * so we can use DateTimeFormatter class and use it's ofPattern() method
         */

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);

        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
    }
}
