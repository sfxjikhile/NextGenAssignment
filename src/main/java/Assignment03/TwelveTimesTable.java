package Assignment03;

public class TwelveTimesTable {
    public static void main(String[] args){
        int[] resultArray = new int[12];

        for(int i = 1; i <= resultArray.length; i++){
            resultArray[i - 1] = i * 12;
        }

        for(int i = 0; i < resultArray.length; i++){
            System.out.println("12 x " + (i + 1) + ": " +resultArray[i]);
        }
    }
}
