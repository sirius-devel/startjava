import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	private int guessNumber;
	private Scanner scan;
	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		scan = new Scanner(System.in);
		this.player1 = player1;
		this.player2 = player2;
	}

	public int getGuessNumber() {
		return guessNumber;
	}

	public void play() {
			boolean player1Win = false;
			boolean player2Win = false;
			guessNumber = (new Random()).nextInt(100) + 1;
			System.out.println("Компьютер загадал число.");
			while(!(player1Win || player2Win)) {
				input(player1);
				player1Win = checkInput(player1);
				if (!player1Win) {
					input(player2);
					player2Win = checkInput(player2);
				}
			}
	}

	private void input(Player player) {
		System.out.print(player.getName() + ", введите загаданное число: ");
		player.setNumber(scan.nextInt());
	}

	private boolean checkInput(Player player) {
		boolean hasWinner = false;

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
}
