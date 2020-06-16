package com.startjava.lesson_2_3_4.game;

import java.lang.Math;
import java.util.Arrays;

public class Player {
	private String name;
	private int[] attempts;
	private int position;

	public Player(String name) {
		this.name = name;
		attempts = new int[10];
		position = -1;
	}

	public String getName() {
		return name;
	}

	public int[] getAttempts() { return attempts; }

	public int getAttemptCount() { return position + 1; }

	public void setName(String name) {
		this.name = name;
	}

	public int getAttempt(int pos) {
		pos = Math.abs(pos) % attempts.length;
		return attempts[pos];
	}

	public void setAttempt(int number) {
		position++;
		if (number > 0 && number <= 100) {
			attempts[position] = number;
		} else {
			int rnd = Math.abs(number) % 100;
			attempts[position] = rnd == 0 ? 1 : rnd;
			System.out.println("В игре используются числа из диапазона (0;100], поэтому мы исправили ваш ввод на " + attempts[position]);
		}
	}

	public void clear() {
		Arrays.fill(attempts, 0, position+1, 0);
		position = -1;
	}
}
