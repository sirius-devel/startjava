import java.util.Scanner;

public class CalculatorTest {

	private static Scanner getScanner() {
        Scanner scan = new Scanner(System.in);
        return scan;
    }

	private static void input(Calculator calculator) {
        System.out.print("Введите первое целое число: ");
        calculator.setNum1(getScanner().nextInt());
        boolean isOperationEnter = false;
        while(!isOperationEnter) {
            System.out.print("Введите знак операции: ");
            String operationString = getScanner().next();
            if (operationString.length() != 1) {
                System.out.println("Вы ввели целую строку вместо символа математической операции.");
            } else if ((operationString.charAt(0) != '+') && (operationString.charAt(0) != '-') &&
                (operationString.charAt(0) != '*') && (operationString.charAt(0) != '/') &&
                (operationString.charAt(0) != '%')) {
                System.out.println("Введённый символ не является символом математической операции.");
            } else {
                calculator.setOperation(operationString.charAt(0));
                isOperationEnter = true;
            }
        }
        System.out.print("Введите второе целое число: ");
        calculator.setNum2(getScanner().nextInt());
    }

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		input(calculator);
        calculator.calculate();
        boolean stillContinue = true;
        while(stillContinue) {
            while(true) {
                System.out.println("Хотите продолжить? [да/нет]: ");
                String answer = getScanner().next();
                if (answer.equals("да")) {
                	input(calculator);
                    calculator.calculate();
                    stillContinue = true;
                    break;
                } else if (answer.equals("нет")) {
                    stillContinue = false;
                    break;
                } else {
                    System.out.print("Ваш ответ непонятен, ответьте ещё раз. ");
                }
            }
        }
	}
}



