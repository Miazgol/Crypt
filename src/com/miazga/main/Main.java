package com.miazga.main;

import java.util.Scanner;

public class Main {

    private static Scanner operationScanner = new Scanner(System.in);
    private static Scanner textScanner = new Scanner(System.in);
    private static Scanner passwordScanner = new Scanner(System.in);

    public static void main(String[] args) {

        Ceasar ceasar;
        String text;
        int password;
        String result;

        System.out.println("Choose the operation \"encrypt\" or \"decrypt\"");
        String operation = operationScanner.nextLine();

        if (operation.equals("encrypt")) {

            System.out.println("Write text to encrypt");
            text = textScanner.nextLine();
            System.out.println("Put the password");
            password = passwordScanner.nextInt();
            ceasar = new Ceasar(text, password);
            result = ceasar.encrypt();
            System.out.println(result);
        }

        if (operation.equals("decrypt")) {

            System.out.println("Write text to decrypt");
            text = textScanner.nextLine();
            System.out.println("Put the password");
            password = passwordScanner.nextInt();
            ceasar = new Ceasar(text, password);
            result = ceasar.decrypt();
            System.out.println(result);
        }
    }
}
