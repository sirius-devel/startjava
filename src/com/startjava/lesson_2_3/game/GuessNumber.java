package com.startjava.lesson_2_3.game;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private int guessNumber;
	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void play() {
		boolean player2Win = false;
		guessNumber = (new Random()).nextInt(100) + 1;
		System.out.println("Компьютер загадал число.");
		do {
			inputNumber(player1);
			if (compareNumber(player1)) {
				break;
			}
			inputNumber(player2);
		} while(!compareNumber(player2));
	}

	private void inputNumber(Player player) {
		Scanner scan = new Scanner(System.in);
		System.out.print(player.getName() + ", введите загаданное число: ");
		player.setNumber(scan.nextInt());
	}

	private boolean compareNumber(Player player) {
		boolean hasWinner = false;

		if (player.getNumber() < guessNumber) {
			System.out.println("Введённое вами число меньше того, что загадал компьютер");
		} else if (player.getNumber() > guessNumber) {
			System.out.println("Введённое вами число больше того, что загадал компьютер");
		} else {
			System.out.println("Вы угадали и победили!");
			hasWinner = true;
		}
		return hasWinner;
	}
}
