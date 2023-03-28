public class DoubleValue {
    public static void main(String[] args) {
       double[] randomNums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       double sum = 0;
       double length = randomNums.length;
       double avg;
        for(int i = 0; i < length; i++){
            sum += randomNums[i];

        }
        avg = (sum/length);
        System.out.println(avg);



    }
}