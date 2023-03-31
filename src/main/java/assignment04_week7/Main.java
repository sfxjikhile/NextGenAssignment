package assignment04_week7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> employees = new ArrayList<>();
    static ArrayList<Student> students = new ArrayList<>();

    public static void run(){
        System.out.println("To register as a student, press 1\nTo register as employee, press 2\nTo terminate, press 3");
        System.out.print(">>");
        int userChoice = sc.nextInt();
        switch (userChoice){
            case 1:
                for(Student student: students){
                    System.out.println(student.getId());
                }
                students.add(new Student().register(students));
                run();
            case 2:
                employees.add(new Employee().register(employees));
                run();
            case 3:
                System.exit(0);
            default:
                System.out.println("Invalid selection");
                run();
        }
    }

    public static void main(String[] args){
        run();
    }
}
