package com.miazga.main;

import java.util.InputMismatchException;
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

        try {
            System.out.println("Choose the operation \"encrypt\" or \"decrypt\"");
            String operation = operationScanner.nextLine();

            switch (operation) {
                case "encrypt":
                    System.out.println("Write text to encrypt");
                    text = textScanner.nextLine();
                    System.out.println("Put the password");
                    password = passwordScanner.nextInt();
                    ceasar = new Ceasar(text, password);
                    result = ceasar.encrypt();
                    System.out.println(result);
                    break;

                case "decrypt":
                    System.out.println("Write text to decrypt");
                    text = textScanner.nextLine();
                    System.out.println("Put the password");
                    password = passwordScanner.nextInt();
                    ceasar = new Ceasar(text, password);
                    result = ceasar.decrypt();
                    System.out.println(result);
                    break;

                default:
                    System.out.println("You choose wrong operations");
                    break;
            }
        } catch (InputMismatchException exception) {
            System.out.println("You write wrong password");
        }
    }
}

