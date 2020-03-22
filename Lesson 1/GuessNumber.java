public class GuessNumber {	
    public static void main(String[] args) {
        long my_assumption = 45;
        long computerNumber;
        while (true) {
            computerNumber = 1 + System.currentTimeMillis() % 100;
            if (my_assumption == computerNumber) {
                System.out.println("Вы угадали!");
                break;
            }
            else if (my_assumption < computerNumber) {
                System.out.println("Введённое вами число меньше того, что загадал компьютер");
            }
            else System.out.println("Введённое вами число больше того, что загадал компьютер");
        }
    }
}