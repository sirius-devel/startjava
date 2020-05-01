    import java.util.Scanner;

    public class GuessNumberTest {
        private static Scanner getScanner() {
            Scanner scan = new Scanner(System.in);
            return scan;
        }

        public static void main(String[] args) {
            GuessNumber guessNumber = new GuessNumber();
            System.out.println("Введите имя первого игрока: ");
            Player player1 = new Player();
            player1.setName(getScanner().nextLine());
            System.out.println("Введите имя второго игрока: ");
            Player player2 = new Player();
            player2.setName(getScanner().nextLine());
            //играем пока играет хотя бы один игрок
            guessNumber.play(player1, player2);
        }
}        