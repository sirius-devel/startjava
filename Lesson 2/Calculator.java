public class Calculator {
    private int num1;
    private int num2;
    private char operation;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public char getOperation() {
        return operation;
    }

    public boolean setOperation(String operationString) {
        boolean result = false;

        if (operationString.length() != 1) {
            System.out.println("Вы ввели целую строку вместо символа математической операции.");
            result = false;
        } else if ((operationString.charAt(0) != '+') && (operationString.charAt(0) != '-') &&
            (operationString.charAt(0) != '*') && (operationString.charAt(0) != '/') &&
            (operationString.charAt(0) != '%')) {
            System.out.println("Введённый символ не является символом математической операции.");
            result = false;
        } else {
            this.operation = operationString.charAt(0);
            result = true;
        }
        return result;
    }

    public float calculate() {
        float result = 0;
        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = (float)num1 / num2;
                break;
            case '^':
                result = 1;
                for(int i = 1; i <= num2; i++) {
                    result *= num1;
                }
            case '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Введена неподдерживаемая калькулятором операция");
        }
        return result;
    }
}
