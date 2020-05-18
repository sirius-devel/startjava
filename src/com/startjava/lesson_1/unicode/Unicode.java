package com.startjava.lesson_1.unicode;

public class Unicode {	
    public static void main(String[] args) {
        for(int i = 9398; i < 10179; i++) {
            System.out.println("Символ unicode " + i + " это " + (char)i);
        }
    }
}