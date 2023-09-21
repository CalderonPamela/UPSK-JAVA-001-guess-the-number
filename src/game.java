import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String play =  "yes";

        while(play.equals("yes")) {
            Random rand = new Random();
            int targetNumber = rand.nextInt(100);
            int guess = -1;
            int tries = 0;

            while (guess != targetNumber) {

                System.out.println("Guess a number between 1 - 100: ");
                System.out.println("--- Round: Player 1 --- \nPlayer 1 enter your guess: " );
                guess = scanner.nextInt();
                tries++;


                if (guess == targetNumber) {

                    System.out.println("Congratulations!! You guess the number.");

                    System.out.println("Total Attempts : " + tries);
                    System.out.println("Would you like play again? Yes or No: ");
                    play = scanner.next().toLowerCase();

                } else if (guess > targetNumber) {
                    System.out.println("Too high!");
                    String computerPlayer = scanner.nextLine();
                    int computerMove = rand.nextInt(100);
                    System.out.println( computerPlayer + "--- Round: Computer Player 1 --- \nComputer Player, enter your guess: " + computerMove);
                    System.out.println(" ");

                } else {
                    System.out.println("Too low!");
                    String computerPlayer = scanner.nextLine();
                    int computerMove = rand.nextInt(100);
                    System.out.println(computerPlayer + "--- Round: Computer Player 1 --- \nComputer Player, enter your guess: " + computerMove );
                    System.out.println(" ");

                }

            }

        }
        scanner.close();
    }
}
