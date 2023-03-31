package assignment04_week7;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Person {
    static Scanner sc = new Scanner(System.in);
    private String firstName;
    private String lastName;
    private int age;

    private String id;

    public Person(String firstName, String lastName, int age, String id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
    }

    public Person(){}


    protected int validateAge(String age){
        Pattern ageRegex = Pattern.compile("\\d+");
        Matcher ageMatcher = ageRegex.matcher(age);
        if(!ageMatcher.matches()){
            System.out.println("Invalid age entered.");
            System.out.println("Please try again! Expecting an integer");
            age = sc.next();
            validateAge(age);
        }
        return Integer.parseInt(age);
    }

    protected double validateDouble(String inputString){
        Pattern doubleRegex = Pattern.compile("([.]?[0-9]+)|([0-9]*[.][0-9]*)");
        Matcher doubleMatcher = doubleRegex.matcher(inputString);
        if(!doubleMatcher.matches()){
            System.out.print("Invalid number provided.\nPlease enter a valid number: ");
            String newInput = sc.next();
            return validateDouble(newInput);
        }else{
            return Double.parseDouble(inputString);
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
