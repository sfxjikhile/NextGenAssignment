package Assignment03;

import java.util.Random;

public class FindAverage {
    static Random random = new Random();
    public static void main(String[] args){
        double[] doublesArray = new double[10];

        for(int i = 0; i < doublesArray.length; i++){
            doublesArray[i] = random.nextDouble() * 100;
            System.out.printf("%.2f \n", doublesArray[i]);

        }

        double sum = 0;
        for(double num: doublesArray){
            sum += num;
        }

        double result = sum/doublesArray.length;
        System.out.printf("The result is: %.2f",result);
    }
}
