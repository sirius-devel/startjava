package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		String answer = "";

		do {
			input(calculator);
			System.out.println("Результат " + calculator.getNum(0) + " " + calculator.getOperation() +
				" " + calculator.getNum(1) + " = " + calculator.calculate());
			do {
				System.out.println("Хотите продолжить? [да/нет]: ");
				answer = scan.next();
				scan.nextLine();
				if (!(answer.equals("да") || answer.equals("нет"))) {
					System.out.print("Ваш ответ непонятен, ответьте ещё раз. ");
				}
			} while(!(answer.equals("да") || answer.equals("нет")));
		} while(!answer.equals("нет"));
	}

	private static void input(Calculator calculator) {
		do {
			System.out.println("Введите через пробелы математическое выражение: ");
		} while(!calculator.setExpression(scan.nextLine().split(" ")));
	}

}



