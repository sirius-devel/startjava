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

    public void setOperation(char operation) {
        this.operation = operation;
    }

    public float calculate() {
        float result = -1;
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
        System.out.println("Результат " + num1 + " " + operation + " " + num2 + " = " + result);
        return result;
    }
}
