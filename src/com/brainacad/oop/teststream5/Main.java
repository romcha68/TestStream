package com.brainacad.oop.teststream5;

import java.io.IOException;

/**
 * Created by User on 15.03.2018.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        AccountingUser accountingUser = new AccountingUser();

        accountingUser.testUsers("Alice");
        accountingUser.printFile();
    }
}
