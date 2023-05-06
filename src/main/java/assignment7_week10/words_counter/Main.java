package assignment7_week10.words_counter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static String wordsCounter(String fileName, String searchWord){
        int counter = 0;
        String line;
        try(BufferedReader br = new BufferedReader(new FileReader(fileName))){

            while((line = br.readLine()) != null){
                String[] strs = line.split(" ");
                for(String word: strs){
                    if(word.equalsIgnoreCase(searchWord)){
                        counter++;
                    }
                }
            }
        }catch (IOException | NullPointerException  e){
            System.out.println("I/O Exception occurred: " + e);
            //e.printStackTrace();
        }
        return (counter + " occurrences of '" + searchWord + "' were found");
    }

    public static void main(String[] args){
        System.out.println(wordsCounter("books.txt", "Emmanuel"));
    }
}
