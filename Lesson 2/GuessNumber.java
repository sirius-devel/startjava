import java.util.Random;
import java.util.Scanner;

public class GuessNumber {	
    private int guessNumber;
    private Scanner scan;

    public GuessNumber(int number) {
        guessNumber = number;
        scan = new Scanner(System.in);
    }

    public GuessNumber() {
        this( (new Random()).nextInt(100) + 1 );
    }

    public int getGuessNumber() {
        return guessNumber;
    }

    private boolean maintainInput(Player player) {
        System.out.print(player.getName() + ", введите загаданное число: ");
        player.setNumber(scan.nextInt());
        boolean hasWinner = false;
        if (player.getNumber() < getGuessNumber()) {
            System.out.println("Введённое вами число меньше того, что загадал компьютер");
        } else if (player.getNumber() > getGuessNumber()) {
            System.out.println("Введённое вами число больше того, что загадал компьютер");
        } else {
            System.out.println("Вы угадали и победили!");
            hasWinner = true;
        }

        while(true) {
            System.out.println(player.getName() + ", вы хотите продолжить? [да/нет]: ");
            String answer = scan.next();
            if (answer.equals("да")) {
                player.setContinueAfterRound(true);
                break;
            } else if (answer.equals("нет")) {
                player.setContinueAfterRound(false);
                break;
            } else {
                System.out.print("Ваш ответ непонятен, ответьте ещё раз. ");
            }
        }

        if (hasWinner) {
            System.out.println("Игрок " + player.getName() + " угадал число, поэтому компьютер загадывает новое число");
            this.guessNumber = (new Random()).nextInt(100) + 1;
        }
        return player.getContinueAfterRound();
    }

    private boolean playRound(Player player, boolean continueAfterRound, boolean anotherPlayerExist) {
        if (continueAfterRound) {
            continueAfterRound = maintainInput(player);
            if (continueAfterRound && anotherPlayerExist) {
                System.out.println("Хорошо, подождите своей очереди!");
            }
        }
        return continueAfterRound;
    }

    public void play(Player player1, Player player2) {
            boolean player1Continue = true;
            boolean player2Continue = true;

            while(player1Continue || player2Continue) {
                player1Continue = playRound(player1, player1Continue, player2Continue);
                player2Continue = playRound(player2, player2Continue, player1Continue);
            }
    }


}