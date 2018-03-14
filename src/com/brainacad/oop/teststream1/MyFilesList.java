package com.brainacad.oop.teststream1;

import java.io.File;

/**
 * Created by User on 14.03.2018.
 */
public class MyFilesList {
    public static void main(String[] args) {
        try {
            File directory;
            if (args.length < 1) {
                directory = new File(System.getProperty("user.dir"));
            } else {
                directory = new File(args[0]);
            }

            if(directory.list().length > 0) {
                System.out.println(directory.getAbsoluteFile() + ":");
                for (String unit : directory.list()) {
                    System.out.println("\t-" + unit);
                }
            }
        } catch (NullPointerException e) {
            System.out.println("Incorrect file path: " +  args[0]);
        }
    }
}
