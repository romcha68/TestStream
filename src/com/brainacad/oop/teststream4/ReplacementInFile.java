package com.brainacad.oop.teststream4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by User on 15.03.2018.
 */
public class ReplacementInFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter java file path:");
        String path = scanner.nextLine();
        List<String> fileLines = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if(line.contains("public")) {
                    fileLines.add(line.replace("public", "private"));
                } else {
                    fileLines.add(line);
                }
            }

            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            for (String fileLine : fileLines) {
                writer.write(fileLine + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
