package assignment04_week7;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Person {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> coursesEnrolled;

    public Student(String id, String firstname, String lastname, int age, ArrayList<String> coursesEnrolled){
        super(firstname, lastname, age, id);
        this.coursesEnrolled = coursesEnrolled;
    }

    public Student(){}

    public Student register(ArrayList<Student> students){
        System.out.println("Welcome to LearnMore University!\nPlease enter your details below");
        System.out.print("Enter your ID: ");
        String id = validateStudentID(sc.next(), students);

        System.out.print("Enter your firstname: ");
        String firstName = sc.next();

        System.out.print("Enter your lastname: ");
        String lastName = sc.next();

        System.out.print("Enter your age: ");
        int age = validateAge(sc.next());

        ArrayList<String> courses = new ArrayList<>();
        System.out.print("Enter courses enrolled: ");
        String course1 = sc.next();
        courses.add(course1);
        if(sc.hasNextLine()){
            String[] otherCourses = sc.nextLine().split(" ");
            for(int i = 1; i < otherCourses.length; i++){
                courses.add(otherCourses[i].trim());
            }
        }
        System.out.println("Your details have been saved.\nThanks for registering");
        return new Student(id, firstName, lastName, age, courses);

    }

    protected String validateStudentID(String id, ArrayList<Student> students){
        for(Student student: students){
            if(student.getId().equalsIgnoreCase(id)){
                System.out.println("ID already exists.\nPlease enter another value");
                id = sc.next();
                validateStudentID(id, students);
            }
        }
        return id;
    }

    public ArrayList<String> getCoursesEnrolled() {
        return coursesEnrolled;
    }

    public void setCoursesEnrolled(ArrayList<String> coursesEnrolled) {
        this.coursesEnrolled = coursesEnrolled;
    }
}
