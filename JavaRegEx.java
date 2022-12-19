import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegEx {
    /*
     * RegEx stands for Regular Expression used for searching data with search
     * pattern to all the character.
     * 
     * A RegEx can be single character or more complex pattern.
     * 
     * RegEx can be used to perform all types of text search & replace
     * 
     * In Java you can use RegEx from package java.util
     */

    public static void main(String[] args) {
        patternAndMatcher();

    }

    public static void patternAndMatcher() {

        /* Create a search pattern */
        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);

        /* Create a matcher with another sentence */
        Matcher matcher = pattern.matcher("Visit W3Schools!");

        /* Assign result matcher with pattern in a variable */
        boolean matchFound = matcher.find(); // will get true if match

        if (matchFound) {
            System.out.println("Match Found!");
        } else {
            System.out.println("Match not found!");
        }
    }
}
