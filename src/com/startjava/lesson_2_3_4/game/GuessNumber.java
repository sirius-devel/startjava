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
		guessNumber = (new Random()).nextInt(100) + 1;
		System.out.println("Компьютер загадал число. У вас " + maxAttemptCount + " попыток угадать.");
		boolean hasWinner = false;
		do {
			if (players[0].getAttemptCount() < maxAttemptCount) {
				inputNumber(0);
				if (compareNumber(0)) {
					break;
				}
			}
			inputNumber(1);
		} while(!compareNumber(1) && (players[1].getAttemptCount() < maxAttemptCount));
		if (winnerIndex != -1)
			System.out.println("Игрок " + players[winnerIndex].getName() + " угадал число " + guessNumber + " с " +
					players[winnerIndex].getAttemptCount() + " попытки.");
		for(Player player : players) {
			int[] realAttempts = Arrays.copyOf(player.getAttempts(), player.getAttemptCount());
			for(int attempt : realAttempts) {
				System.out.print(attempt + " ");
			}
			System.out.print("\n");
		}
		for(Player player : players) {
			player.clear();
		}
	}

	private void inputNumber(int playerIndex) {
		Scanner scan = new Scanner(System.in);
		System.out.print(players[playerIndex].getName() + ", введите загаданное число: ");
		players[playerIndex].setAttempt(scan.nextInt());
	}

	private boolean compareNumber(int playerIndex) {
		int attemptNumber = players[playerIndex].getAttempt( players[playerIndex].getAttemptCount()-1);
		winnerIndex = -1;

		if (attemptNumber < guessNumber) {
			System.out.println("Введённое вами число меньше того, что загадал компьютер");
		}
		else if (attemptNumber > guessNumber) {
			System.out.println("Введённое вами число больше того, что загадал компьютер");
		} else {
			System.out.println("Вы угадали и победили!");
			winnerIndex = playerIndex;
		}
		if (players[playerIndex].getAttemptCount() == maxAttemptCount && winnerIndex == -1)
			System.out.println("У игрока " + players[playerIndex].getName() + " закончились попытки.");
		return (winnerIndex != -1);
	}
}
