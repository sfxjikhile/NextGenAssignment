import java.util.Scanner;

public class Student extends LearnMore {

    String courses[];
    int noOfCourses;
    String studId;

    public void studentDetails() {
        super.details();
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of courses");
        noOfCourses = input.nextInt();
        courses = new String[noOfCourses];
        System.out.println("enter the name of course");
        for( int i = 0; i < noOfCourses; i++){
            courses[i] = input.next();
        }
        System.out.print("Student identification number: ");
        studId = input.nextLine();
        System.out.println();
        showDetails();
        System.out.println();
    }

    public void showDetails() {
        System.out.println("These are your details");
        System.out.println("first name is: " + super.firstN);
        System.out.println("last name is: " + super.lastN);
        System.out.println("age is: " + super.age);
        for(int i = 0; i < noOfCourses; i++)
            System.out.println("course enrolled  is: " + courses[i]);
        System.out.println("student identification is: " + studId);

    }
}
