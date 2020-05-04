import java.util.Scanner;

public class CalculatorTest {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		String answer = "";

		do {
			input(calculator);
			System.out.println("Результат " + calculator.getNum(1) + " " + calculator.getOperation() +
				" " + calculator.getNum(2) + " = " + calculator.calculate());
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

	private static void input(Calculator calculator) {
		inputNumber(1, calculator);
		inputOperation(calculator);
		inputNumber(2, calculator);
	}

	private static void inputNumber(int i, Calculator calculator) {
		System.out.print("Введите целое число " + i + ": ");
		calculator.setNum(i, scan.nextInt());
	}

	private static void inputOperation(Calculator calculator) {
		do {
			System.out.print("Введите знак операции: ");
		} while (!calculator.setOperation(scan.next()));
	}
}



