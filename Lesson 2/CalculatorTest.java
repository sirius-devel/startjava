import java.util.Scanner;

public class CalculatorTest {
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		String answer = "";

		do {
			input(calculator);
			System.out.println("Результат " + calculator.getNum1() + " " + calculator.getOperation() +
				" " + calculator.getNum2() + " = " + calculator.calculate());
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
		System.out.print("Введите первое целое число: ");
		calculator.setNum1(scan.nextInt());
		do {
			System.out.print("Введите знак операции: ");
		} while (!calculator.setOperation(scan.next()));
		System.out.print("Введите второе целое число: ");
		calculator.setNum2(scan.nextInt());
	}
}



