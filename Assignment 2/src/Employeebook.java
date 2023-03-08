import java.util.Scanner;
public class Employeebook {

    public static void main(String[] args) {
        Scanner input = new
                Scanner(System.in);

        int choice = 0;
        do {
            System.out.println("1. Enter Data");
            System.out.println("2. Display Data");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    enterData();
                    break;
                case 2:
                    displayData();
                    break;
                case 3:
                    exitMenu();
                    break;
                default:

                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 3);
    }

    public static void enterData() {
    // method to enter employee data
        System.out.println("You chose to enter data.");
    }

    public static void displayData() {
        // method to display employee data
        System.out.println("You chose to display data");
    }

    public static void exitMenu() {
        // method to exit the program
        System.out.println("You chose to exit the menu.");
    }
}
