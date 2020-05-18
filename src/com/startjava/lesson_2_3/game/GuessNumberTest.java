package com.startjava.lesson_2_3.game;

import java.util.Scanner;

public class GuessNumberTest {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Введите имя первого игрока: ");
		Player player1 = new Player(scan.nextLine());
		System.out.println("Введите имя второго игрока: ");
		Player player2 = new Player(scan.nextLine());
		GuessNumber guessNumber = new GuessNumber(player1, player2);
		//играем пока играет хотя бы один игрок не победил
		String answer = "";

		do {
			guessNumber.play();
			answer = "";
			while(!(answer.equals("да") || answer.equals("нет"))) {
				System.out.println("Хотите продолжить игру? [да/нет]: ");
				answer = scan.next();
				if (!(answer.equals("да") || answer.equals("нет"))) {
					System.out.print("Ваш ответ непонятен, ответьте ещё раз. ");
				}
			}
		} while(!answer.equals("нет"));
	}
}


