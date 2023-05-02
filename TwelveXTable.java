import org.w3c.dom.ls.LSOutput;

public class TwelveXTable {
    public static void main(String[] args) {
        // using l to print the multiplication table of 12
        int a;
        int b;
            System.out.println("12 Times Table");
        System.out.println();
        // Loop to print 12 times table from 1 - 12
        for (a = 1; a <= 12; ++a){
            for(b = 1; b <= 12; ++b){
                System.out.print(a*b + "\t\t\t");
            }
            System.out.println();
        }
    }

}

