package week12;
import java.util.Scanner;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebPortalValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept the Web portal name from the user
        System.out.print("Enter a Web portal name: ");
        String webPortalName = scanner.nextLine();

        // Define the regular expression pattern for Web portal name validation
        String patternString = "^(http|https)://[a-zA-Z0-9]+\\.[a-zA-Z]+\\.[a-zA-Z]{2,}\\.[a-zA-Z]+$";
        Pattern pattern = Pattern.compile(patternString);

        // Create a Matcher object to perform pattern matching
        Matcher matcher = pattern.matcher(webPortalName);

        // Check if the Web portal name matches the pattern
        if (matcher.matches()) {
            System.out.println("Web portal name is valid.");
        } else {
            System.out.println("Invalid Web portal name.");
        }
    }
}


