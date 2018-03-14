package com.brainacad.oop.teststream3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by User on 14.03.2018.
 */
public class MyFileCopy {
    public static void main(String[] args) {
        if (args.length >= 2) {
            try (FileInputStream input = new FileInputStream(args[0]);
                 FileOutputStream output = new FileOutputStream(args[1])) {

                byte[] buf = new byte[1024];
                int bytesRead;
                while ((bytesRead = input.read(buf)) > 0) {
                    output.write(buf, 0, bytesRead);
                }
                System.out.println("File copied!");
            } catch (IOException e) {
                System.out.println("Incorrect file args: " + Arrays.toString(args));
            }
        } else {
            System.out.println("Incorrect args!");
        }
    }
}
