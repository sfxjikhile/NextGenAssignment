public class averageTen {
    double[] x = {1,2,3,4,5,6,7,8,9,10};
    public double averageTen() {
        double a = 0;
        for (int i = 0; i < x.length; i++)
            a += x[i];
        return a / x.length;
    }
    public static void main(String[] args) {
        averageTen num = new averageTen();
        System.out.println(num.averageTen());
    }
}