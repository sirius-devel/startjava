package com.startjava.lesson_2_3_4.game;

import java.lang.Math;
import java.util.Arrays;

public class Player {
	private String name;
	private int[] attempts;
	private int attemptCount;

	public Player(String name) {
		this.name = name;
		attempts = new int[10];
		attemptCount = 0;
	}

	public String getName() {
		return name;
	}

	public int[] getAttempts() {
		return attempts;
	}

	public int getAttemptCount() {
		return attemptCount;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLastAttempt() {
		return attempts[attemptCount - 1];
	}

	public void setAttempt(int number) {
		attemptCount++;
		if (number > 0 && number <= 100) {
			attempts[attemptCount - 1] = number;
		} else {
			int rnd = Math.abs(number) % 100;
			attempts[attemptCount - 1] = rnd == 0 ? 1 : rnd;
			System.out.println("В игре используются числа из диапазона (0;100], поэтому мы исправили ваш ввод на " + attempts[attemptCount - 1]);
		}
	}

	public void clear() {
		Arrays.fill(attempts, 0, attemptCount, 0);
		attemptCount = 0;
	}
}
