package week12_assignment9.web_portal;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebPortal {
    static Scanner sc = new Scanner(System.in);

    public static void acceptPortalName(){
        System.out.println("Hello and Welcome.");
        System.out.print("Enter the portal name here: ");

        String portalName = validatePortalName(sc.next());
        System.out.println(portalName + " is valid.\nThanks and Goodbye!!!");
    }

    private static String validatePortalName(String input){
        Pattern portalNamePattern = Pattern.compile("(http)s?://[a-zA-Z]{6,}.[a-zA-Z.]{2,}");
        Matcher portalNameMatcher = portalNamePattern.matcher(input);
        if(!portalNameMatcher.matches()){
            System.out.println(input + " is not a valid input");
            System.out.println("Expected pattern: http(s)://abcdec.ab");
            System.out.print("Enter another portal name: ");
            return validatePortalName(sc.next());
        }
        return input;
    }

    public static void main(String[] args){
        acceptPortalName();
    }
}
