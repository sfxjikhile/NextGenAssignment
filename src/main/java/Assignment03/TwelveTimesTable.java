package Assignment03;

import java.util.Arrays;

public class TwelveTimesTable {
    public static void main(String[] args){
        int[][] resultArray = new int[12][12];

        for(int i = 1; i <= resultArray[1].length; i++){
            int[] newArray = new int[12];
            for(int j = 1; j <= newArray.length; j++){
                newArray[j -1] = j * i;
            }
            //System.out.println(Arrays.toString(newArray));
            resultArray[i -1] = newArray;
        }

        /*
            Could have printed the array within the former for-block. But decided to bring it out to add make things clearer.
         */
        for(int[] subArray: resultArray){
            System.out.println(Arrays.toString(subArray));
        }
    }
}
