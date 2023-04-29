package assignment06_week9.newAxis;

public class InvalidAgeException extends Exception{

    @Override
    public String toString(){
        return "Age must be between 20 and 55 years";
    }
}
