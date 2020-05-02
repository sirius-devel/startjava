import java.util.Random;
import java.util.Scanner;

public class GuessNumber {	
    private int guessNumber;
    private Scanner scan;

    public GuessNumber() {
        scan = new Scanner(System.in);
    }

    public int getGuessNumber() {
        return guessNumber;
    }

    private boolean maintainInput(Player player) {
        boolean hasWinner = false;

        System.out.print(player.getName() + ", введите загаданное число: ");
        player.setNumber(scan.nextInt());
        if (player.getNumber() < getGuessNumber()) {
            System.out.println("Введённое вами число меньше того, что загадал компьютер");
        } else if (player.getNumber() > getGuessNumber()) {
            System.out.println("Введённое вами число больше того, что загадал компьютер");
        } else {
            System.out.println("Вы угадали и победили!");
            hasWinner = true;
        }
        return hasWinner;
    }

    public void play(Player player1, Player player2) {
            boolean player1Win = false;
            boolean player2Win = false;
            guessNumber = (new Random()).nextInt(100) + 1;
            System.out.println("Компьютер загадал число.");
            while(!(player1Win || player2Win)) {
                player1Win = maintainInput(player1);
                if (!player1Win) {
                    player2Win = maintainInput(player2);
                }
            }
    }
}