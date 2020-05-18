package com.startjava.lesson_2_3.game;

import java.util.Random;
import java.lang.Math;

public class Player {
	private int number;
	private String name;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if (number > 0 && number <= 100) {
			this.number = number;
		} else {
			int rnd = Math.abs(number) % 100;
			this.number = rnd == 0 ? 1 : rnd;
			System.out.println("В игре используются числа из диапазона (0;100], поэтому мы исправили ваш ввод на " + this.number);
		}
	}
}