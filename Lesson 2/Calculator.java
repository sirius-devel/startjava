import java.util.Scanner;

public class Calculator {
    private int arg1;
    private int arg2;
    private char operation;

    private static Scanner getScanner() {
        Scanner scan = new Scanner(System.in);
        return scan;
    }

    public int getArg1() {
        return arg1;
    }

    public int getArg2() {
        return arg2;
    }

    public char getOperation() {
        return operation;
    }

    public void setArg1(int arg1) {
        this.arg1 = arg1;
    }

    public void setArg2(int arg2) {
        this.arg2 = arg2;
    }

    public void setOperation(char operation) {
        this.operation = operation;
    }

    private void input() {
        System.out.print("Введите первое целое число: ");
        setArg1( getScanner().nextInt() );
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
                setOperation(operationString.charAt(0));
                isOperationEnter = true;
            }
        }
        System.out.print("Введите второе целое число: ");
        setArg2( getScanner().nextInt() );
    }


    public float doOperation() {
        float result = -1;
        input();
        switch (operation) {
            case '+':
                result = getArg1() + getArg2();
                break;
            case '-':
                result = getArg1() - getArg2();
                break;
            case '*':
                result = getArg1() * getArg2();
                break;
            case '/':
                result = (float)getArg1() / getArg2();
                break;
            case '^':
                result = 1;
                for(int i = 1; i <= getArg2(); i++) {
                    result *= getArg1();
                }
            case '%':
                result = getArg1() % getArg2();
                break;
            default:
                break;
        }
        System.out.println("Результат = " + result);
        return result;
    }

    public void calculate() {
        doOperation();
        boolean stillContinue = true;
        while(stillContinue) {
            while(true) {
                System.out.println("Хотите продолжить? [да/нет]: ");
                String answer = getScanner().next();
                if (answer.equals("да")) {
                    doOperation();
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