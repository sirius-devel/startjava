package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите имя первого игрока: ");
		Player player1 = new Player(scan.nextLine());
		System.out.println("Введите имя второго игрока: ");
		Player player2 = new Player(scan.nextLine());
		GuessNumber guessNumber = new GuessNumber(player1, player2);
		//играем пока играет хотя бы один игрок не победил
		String answer = "";

		do {
			guessNumber.play();
			do {
				System.out.println("Хотите продолжить игру? [да/нет]: ");
				answer = scan.next();
				if (!(answer.equals("да") || answer.equals("нет"))) {
					System.out.print("Ваш ответ непонятен, ответьте ещё раз. ");
				}
			} while(!(answer.equals("да") || answer.equals("нет")));
		} while(!answer.equals("нет"));
	}
}


