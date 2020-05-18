package com.startjava.lesson_2_3.calculator;

public class Calculator {
	private int num1;
	private int num2;
	private char operation;
	private int[] nums;

	public Calculator() {
		nums = new int[2];
	}

	public int getNum(int i) {
		i = (i - 1) % nums.length;
		return nums[i];
	}

	public void setNum(int i, int num) {
		i = (i - 1) % nums.length;
		this.nums[i] = num;
	}

	public char getOperation() {
		return operation;
	}

	public boolean setOperation(String operation) {
		boolean isValid = false;
		char firstChar = operation.charAt(0);

		if (operation.length() != 1) {
			System.out.println("Вы ввели целую строку вместо символа математической операции.");
			isValid = false;
		} else if ((firstChar != '+') && (firstChar != '-') &&
			(firstChar != '*') && (firstChar != '/') &&
			(firstChar != '%')) {
			System.out.println("Введённый символ не является символом математической операции.");
			isValid = false;
		} else {
			this.operation = firstChar;
			isValid = true;
		}
		return isValid;
	}

	public float calculate() {
		float result = 0;
		switch (operation) {
			case '+':
				result = nums[0] + nums[1];
				break;
			case '-':
				result = nums[0] - nums[1];
				break;
			case '*':
				result = nums[0] * nums[1];
				break;
			case '/':
				result = (float)nums[0] / nums[1];
				break;
			case '^':
				result = 1;
				for(int i = 1; i <= nums[1]; i++) {
					result *= nums[0];
				}
			case '%':
				result = nums[0] % nums[1];
				break;
			default:
				System.out.println("Введена неподдерживаемая калькулятором операция");
		}
		return result;
	}
}
