import java.util.Scanner;

public class LearnMore {
    String firstN;
    String lastN;
    int age;

    public void details() {

        System.out.println("Input your details as follows ".toUpperCase());
        Scanner id = new Scanner(System.in);
        System.out.print("First name: ");
        firstN = id.nextLine();
        System.out.print("Last name: ");
        lastN = id.nextLine();

        while (true) {
            System.out.println("input your age in numbers (i.e 12,13,14...)".toUpperCase());
            System.out.print("Your age: ");
            String ageL = id.next();
            age = 0;
            try {
                age = Integer.parseInt(ageL);
                break;
            } catch (NumberFormatException epp){
            }



        }


    }

}

