package assignment5;

public class Average {
    double[] x = {1,2,3,4,5,6,7,8,9,10};
    public double average(){
        double a = 0;
        for (int i = 0; i < x.length; i++ )
            a += x[i];
            return a / x.length;

    }
    public static void main(String[] args) {
        Average num = new Average();
        System.out.println(num.average());


        }


}
