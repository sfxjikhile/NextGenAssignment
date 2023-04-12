package assignment05_week8.libary;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    Scanner sc = new Scanner(System.in);
    ArrayList<SoftwareBook> softwareBooks = new ArrayList<>();
    ArrayList<HardwareBook> hardwareBooks = new ArrayList<>();

    public void run(){
        System.out.println("To enter book details, enter 1.\nTo display book details enter 2\nTo exit, enter 3");
        System.out.print(">");
        int actionDefinition = validateOneTwoOrThree(sc.next());

        if(actionDefinition == 1){
            System.out.println("To accept Software book details, enter 1.\nTo accept Hardware book details, enter 2");
            System.out.print(">");
            int bookOption = validateOneOrTwo(sc.next());
            if(bookOption == 1){
                softwareBooks.add(new SoftwareBook().acceptBookDetails());
            }else{
                hardwareBooks.add(new HardwareBook().acceptBookDetails());
            }
            run();
        }else if(actionDefinition == 2){
            System.out.println("To view Software book details, enter 1.\nTo view Hardware book details, enter 2");
            System.out.print(">");
            int bookOption = validateOneOrTwo(sc.next());
            System.out.print("Enter book title:");
            String bookTitle = sc.next();

            boolean bookFound = false;
            if(bookOption == 1){
                for(SoftwareBook softwareBook: softwareBooks){
                    if(softwareBook.bookTitle.equalsIgnoreCase(bookTitle)){
                        bookFound = true;
                        softwareBook.displayBookDetails();
                        break;
                    }
                }
            }else{
                for(HardwareBook hardwareBook: hardwareBooks){
                    if(hardwareBook.bookTitle.equalsIgnoreCase(bookTitle)){
                        bookFound = true;
                        hardwareBook.displayBookDetails();
                        break;
                    }
                }
            }

            if(!bookFound){
                System.out.println("Book not found");
            }
            run();
        }else{
            System.exit(0);
        }
    }

    public static void main(String[] args){
        App main = new App();
        main.run();
    }

    private int validateOneOrTwo(String inputString){
        Pattern intRegex = Pattern.compile("[12]");
        Matcher intMatcher = intRegex.matcher(inputString);
        if(!intMatcher.matches()){
            System.out.print("Invalid entry.\nPlease enter 1 or 2: ");
            String newInput = sc.next();
            return validateOneOrTwo(newInput);
        }else{
            return Integer.parseInt(inputString);
        }
    }

    protected int validateOneTwoOrThree(String inputString){
        Pattern intRegex = Pattern.compile("[123]");
        Matcher intMatcher = intRegex.matcher(inputString);
        if(!intMatcher.matches()){
            System.out.print("Invalid number provided.\nPlease enter 1 or 2: ");
            String newInput = sc.next();
            return validateOneTwoOrThree(newInput);
        }else{
            return Integer.parseInt(inputString);
        }
    }
}
