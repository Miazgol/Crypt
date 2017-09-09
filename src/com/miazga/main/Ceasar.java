package com.miazga.main;

public class Ceasar implements ICrypt {

    private String text;
    private int password;

    Ceasar(String text, int password) {
        this.text = text;
        this.password = password;
    }

    @Override
    public String encrypt() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            int letter = text.charAt(i) + password;
            result.append((char)letter);
        }
        return result.toString();
    }

    @Override
    public String decrypt() {
        StringBuilder result2 = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            int letter2 = text.charAt(i) - password;
            result2.append((char)letter2);
        }
        return result2.toString();
    }
}
