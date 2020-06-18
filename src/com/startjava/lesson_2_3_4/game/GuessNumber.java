package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private int guessNumber;
	private Player[] players;
	private int winnerIndex;
	private int maxAttemptCount;

	public GuessNumber(Player player1, Player player2) {
		players = new Player[2];
		players[0] = player1;
		players[1] = player2;
		maxAttemptCount = 10;
		winnerIndex = -1;
	}

	public void play() {
		int gameoverPlayerCount = 0;

		guessNumber = (new Random()).nextInt(100) + 1;
		winnerIndex = -1;
		System.out.println("Компьютер загадал число. У вас " + maxAttemptCount + " попыток угадать.");
		while (winnerIndex == - 1 && gameoverPlayerCount != players.length) {
			for (int i = 0; i < players.length; i++) {
				if (players[i].getAttemptCount() < maxAttemptCount) {
					inputNumber(i);
					if (compareNumber(i)) {
						break;
					}
				} else {
					gameoverPlayerCount++;
				}
			}
		}
		if (winnerIndex != -1) {
			System.out.println("Игрок " + players[winnerIndex].getName() + " угадал число " + guessNumber + " с " +
					players[winnerIndex].getAttemptCount() + " попытки.");
		}
		printAttempts();
		clearAttempts();
	}

	private void printAttempts() {
		for(Player player : players) {
			int[] realAttempts = Arrays.copyOf(player.getAttempts(), player.getAttemptCount());
			for(int attempt : realAttempts) {
				System.out.print(attempt + " ");
			}
			System.out.print("\n");
		}
	}

	private void clearAttempts() {
		for(Player player : players) {
			player.clear();
		}
	}

	private void inputNumber(int playerIndex) {
		Scanner scan = new Scanner(System.in);
		Player player = players[playerIndex];

		System.out.print(player.getName() + ", введите загаданное число: ");
		player.setAttempt(scan.nextInt());
	}

	private boolean compareNumber(int playerIndex) {
		Player player = players[playerIndex];
		int attemptNumber = player.getLastAttempt();

		winnerIndex = -1;
		if (attemptNumber < guessNumber) {
			System.out.println("Введённое вами число меньше того, что загадал компьютер");
		} else if (attemptNumber > guessNumber) {
			System.out.println("Введённое вами число больше того, что загадал компьютер");
		} else {
			System.out.println("Вы угадали и победили!");
			winnerIndex = playerIndex;
		}
		if (player.getAttemptCount() == maxAttemptCount && winnerIndex == -1) {
			System.out.println("У игрока " + player.getName() + " закончились попытки.");
		}
		return winnerIndex != -1;
	}
}
