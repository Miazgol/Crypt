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
                    String[] parm = text.split(" ");
                    String connectText = builderText(parm);
                    System.out.println("Put the password");
                    password = passwordScanner.nextInt();
                    ceasar = new Ceasar(connectText, password);
                    result = ceasar.encrypt();
                    System.out.println(result);
                    break;

                case "decrypt":
                    System.out.println("Write text to decrypt");
                    text = textScanner.nextLine();
                    parm = text.split(" ");
                    connectText = builderText(parm);
                    System.out.println("Put the password");
                    password = passwordScanner.nextInt();
                    ceasar = new Ceasar(connectText, password);
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

    private static String builderText(String[] parm) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String aParm : parm) {
            stringBuilder
                    .append(aParm)
                    .append(' ');
        }
        return stringBuilder.toString();
    }
}

