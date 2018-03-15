package com.brainacad.oop.teststream5;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by User on 15.03.2018.
 */
public class AccountingUser {
    RandomAccessFile file;

    public AccountingUser(String file) throws IOException {
        this.file = new RandomAccessFile(file, "rw");
    }

    public AccountingUser() throws IOException{
        this("users.txt");
    }

    public void testUsers(String name) throws IOException{
        String line;
        while ((line = file.readLine()) != null) {
            if(line.contains(name)) {
                String[] args = line.split(":");
                int count = Integer.parseInt(args[1]);
                file.seek(file.getFilePointer() - line.length() - 1);
                file.writeBytes(args[0] + ":" + ++count + "\n");
            }
        }
    }

    public void printFile() throws IOException{
        String line;
        while ((line = file.readLine()) != null) {
            System.out.println(line);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        file.close();
    }
}
