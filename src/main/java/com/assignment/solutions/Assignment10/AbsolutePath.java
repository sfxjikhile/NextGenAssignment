package com.assignment.solutions.Assignment10;
/*Write a program that accepts an absolute file path, such as D:\Textfile.txt,
        and the content to write into the file from the user. The program should continue
        accepting the content from the user until the user inputs the text, end.*/
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
public class AbsolutePath {
    String str;
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    void ShowCase() {
        System.out.println("Enter text ('end' to quit).");
        try (FileWriter fw = new FileWriter("C:\\Users\\Lenovo\\Seamfix\\NewText.txt")) {
            do {
                System.out.print(": ");
                str = br.readLine();
                if (str.compareTo("end") == 0) break;
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("end") != 0);
        } catch (IOException exp) {
            System.out.println("I/O Error: " + exp);
        }
    }
    public static void main(String[] args) {
        AbsolutePath file = new AbsolutePath();
        file.ShowCase();
    }
}
