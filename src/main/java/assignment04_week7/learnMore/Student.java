package assignment04_week7.learnMore;

import java.util.ArrayList;

public class Student extends Person{
    ArrayList<String> coursesEnrolled;

    String studentID;

    public Student(String studentID, ArrayList<String> coursesEnrolled){
        super();
        this.studentID = studentID;
        this.coursesEnrolled = coursesEnrolled;
    }

    public static Student register(ArrayList<Student> students){
        System.out.print("Enter your ID: ");
        String id = validateStudentID(sc.next(), students);

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
        Student newStudent = new Student(id, courses);
        System.out.println("Your details have been saved.\nThanks for registering");
        return newStudent;
    }

    public String getStudentID() {
        return studentID;
    }

    protected static String validateStudentID(String id, ArrayList<Student> students){
        for(Student student: students){
            if(student.getStudentID().equalsIgnoreCase(id)){
                System.out.println("ID already exists.\nPlease enter another value");
                id = sc.next();
                validateStudentID(id, students);
            }
        }
        return id;
    }
}
