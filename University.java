import java.util.InputMismatchException;
import java.util.Scanner;

public class University {
    public static void displayMenu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("1: to register as a student\n2: to register as staff\n3: exit".toUpperCase());
        System.out.print("Please select an option to continue: ".toUpperCase());
    }
    static void exitMenu() {
        System.out.println("logging out...\nthank you");
        System.exit(0);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        Student student = new Student();
        Scanner put = new Scanner(System.in);
        int select = 0;
        try {
            do {
                displayMenu();
                select = put.nextInt();
                if (select == 1) {
                    student.studentDetails();

                } else if (select == 2) {
                    employee.employeeDetails();
                } else if (select == 3) {
                    exitMenu();
                } else {
                    System.out.println("invalid input, try again".toUpperCase());
                    System.out.println();
                }
            } while (select != 3);

        } catch (InputMismatchException exp) {
            System.out.println("invalid input, try again ");
        }
        finally {
            displayMenu();
        }
    }
}
