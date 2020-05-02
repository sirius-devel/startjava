    import java.util.Scanner;

    public class GuessNumberTest {
        private static Scanner getScanner() {
            Scanner scan = new Scanner(System.in);
            return scan;
        }

        public static void main(String[] args) {
            GuessNumber guessNumber = new GuessNumber();
            System.out.println("Введите имя первого игрока: ");
            Player player1 = new Player(getScanner().nextLine());
            System.out.println("Введите имя второго игрока: ");
            Player player2 = new Player(getScanner().nextLine());
            //играем пока играет хотя бы один игрок не победил
            guessNumber.play(player1, player2);
            while(true) {
                System.out.println("Хотите продолжить игру? [да/нет]: ");
                String answer = getScanner().next();
                if (answer.equals("да")) {
                    guessNumber.play(player1, player2);
                } else if (answer.equals("нет")) {
                    break;
                } else {
                    System.out.print("Ваш ответ непонятен, ответьте ещё раз. ");
                }
            }
        }
}        


