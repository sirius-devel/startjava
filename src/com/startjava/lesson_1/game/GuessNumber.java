package com.startjava.lesson_1.game;

public class GuessNumber {	
    public static void main(String[] args) {
        long myAssumption = 0;
        long compNumber = 45;

        while (myAssumption != compNumber) {
            myAssumption = 1 + System.currentTimeMillis() % 100;
            if (myAssumption < compNumber) {
                System.out.println("Введённое вами число меньше того, что загадал компьютер");
            } else {
                System.out.println("Введённое вами число больше того, что загадал компьютер");
            }
        }
        System.out.println("Вы угадали!");
    }
}