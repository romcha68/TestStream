package com.brainacad.oop.teststream2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by User on 14.03.2018.
 */
public class PrintFile {
    public static void main(String[] args) {
        if(args.length > 0) {
            try(BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
                System.out.println(args[0] + ":\n");
                String currentLine;
                while ((currentLine = reader.readLine()) != null) {
                    System.out.println(currentLine);
                }
            } catch (IOException e) {
                System.out.println("Incorrect filename!");
                e.printStackTrace();
            }
        } else {
            System.out.println("There is no args!");
        }
    }
}
