package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
	private char operation;
	private int[] nums;
	private int position;

	public Calculator() {
		nums = new int[2];
		position = 0;
	}

	public boolean setExpression(String[] s) {
		return setNum(s[0]) && setOperation(s[1]) && setNum(s[2]);
	}

	public int getNum(int pos) {
		pos = pos % nums.length;
		return nums[pos];
	}

	public boolean setNum(String num) {
		boolean isValid = false;
		position = position % nums.length;
		try {
			this.nums[position] = Integer.parseInt(num);
			isValid = true;
		} catch (NumberFormatException e) {
			System.out.print("К сожалению, " + num + " не является целым числом.");
			isValid = false;
		}
		position++;
		return isValid;
	}

	public char getOperation() {
		return operation;
	}

	public boolean setOperation(String operation) {
		boolean isValid = false;
		char sign = operation.charAt(0);

		if (operation.length() != 1) {
			System.out.println("Вы ввели целую строку вместо символа математической операции.");
			isValid = false;
		} else if ((sign != '+') && (sign != '-') &&
			(sign != '*') && (sign != '/') && (sign != '^') &&
			(sign != '%')) {
			System.out.println("Введённый символ не является символом математической операции.");
			isValid = false;
		} else {
			this.operation = sign;
			isValid = true;
		}
		return isValid;
	}

	public double calculate() {
		double result = 0;
		switch (operation) {
			case '+':
				result = Math.addExact(nums[0], nums[1]);
				break;
			case '-':
				result = Math.subtractExact(nums[0], nums[1]);
				break;
			case '*':
				result = Math.multiplyExact(nums[0], nums[1]);
				break;
			case '/':
				result = (double)nums[0] / nums[1];
				break;
			case '^':
				result = Math.pow(nums[0], nums[1]);
				break;
			case '%':
				result = nums[0] % nums[1];
				break;
			default:
				System.out.println("Введена неподдерживаемая калькулятором операция");
		}
		return result;
	}
}
