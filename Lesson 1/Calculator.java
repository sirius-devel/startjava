public class Calculator {	
    public static void main(String[] args) {
        int arg1 = 3, arg2 = 4;
        float result = 0.0f;
        char operation = '/';

        if (operation == '+') {
            result = arg1 + arg2;
        } else if (operation == '-') {
            result = arg1 - arg2;
        } else if (operation == '*') {
            result = arg1 * arg2;
        } else if (operation == '/') {
            result = (float)arg1 / arg2;
        } else if (operation == '^') {
            result = 1;
            for(int i = 1; i <= arg2; i++) {
                result *= arg1;
            }
        } else if (operation == '%') {
            result = arg1 % arg2;
        }
        System.out.println("" + arg1 + " " + operation + " " + arg2 + " = " + result);
    }
}