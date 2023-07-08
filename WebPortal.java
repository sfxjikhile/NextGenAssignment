package com.nextgen.assignment12a;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*  Write a program that accepts a Web portal name from the user. In addition,
   the program should validate the format of the Web portal name.
    The Web portal name should have the following fields
    Protocol, such as https or http.
            Domain, such as xyz
    The top-level domain should be more than one character, such as .co.
*/
public class WebPortal {
    Pattern pattern;
    Scanner scanner = new Scanner(System.in);

    public void webportal() {
        System.out.println("Input the web name");
        String port = scanner.next();
        pattern = Pattern.compile("[h][t]{2}[p][s]?[/]{2}[a-zA-z]+[\\.][a-z]{2,4}");
        Matcher mat = pattern.matcher(port);
        while (!port.matches("[h][t]{2}[p][s]?[/]{2}[a-zA-z]+[\\.][a-z]{2,4}")) {
            System.out.println("Invalid, (web name should start with http and end with a" +
                    " domain not less than one or more than four)\nTry again");
            port = scanner.next();
        }
        if (port.matches("[h][t]{2}[p][s]?[/]{2}[a-zA-z]+[\\.][a-z]{2,4}")) {
            System.out.println("successful");
        }

    }

    public static void main(String[] args) {
        WebPortal web = new WebPortal();
        web.webportal();
    }
}

