import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean playAgain = true;
        int totalScore = 0;

        System.out.println("                 _______________             ");
        System.out.println("");
        System.out.println("____________         Welcome        ____________");
        System.out.println();
        System.out.println("||||||||||||  NUMBER GUESSING GAME  ||||||||||||");
        System.out.println("________________________________________________");
        System.out.println();

        while (playAgain) {
            Random random = new Random();
            int rightGuess = random.nextInt(100);
            int turns = 0;
            int roundScore = 0;

            System.out.println("        Guess a number between 1 to 100 ??       ");
            System.out.println();
            System.out.println("                  Only 10 turns                 ");
            System.out.println("________________________________________________");
            System.out.println();
            System.out.println("____________      Best of luck!     ____________");
            System.out.println();

            int guess;
            int i = 0;
            boolean win = false;
            while (win == false) {
                guess = scan.nextInt();
                turns++;

                if (guess == rightGuess) {
                    win = true;
                } else if (i > 8) {
                    System.out.println("____________   SORRY YOU LOSE!    ____________");
                    System.out.println();
                    System.out.println("             Right answer was: " + rightGuess);
                    System.out.println();
                    System.out.println("               Play again? (y/n)");

                    String playAgainChoice = scan.next().toLowerCase();
                    if (playAgainChoice.equals("n")) {
                        playAgain = false;
                    }
                    break;
                } else if (guess < rightGuess) {
                    i++;
                    System.out.println();
                    System.out.println("    Your Guess is Lower than the Right Guess!  ");
                    System.out.println();
                    System.out.println("                  Turns left: " + (10 - i));

                } else if (guess > rightGuess) {
                    i++;
                    System.out.println();
                    System.out.println("    Your Guess is Higher than the Right Guess!  ");
                    System.out.println();
                    System.out.println("                  Turns left: " + (10 - i));
                }
            }

            if (win) {
                int score = (11 - turns) * 10;
                roundScore = score;
                totalScore += score;
                System.out.println("_____________     CONGRATULATION   _____________");
                System.out.println();
                System.out.println("_____________        You Win!      _____________");
                System.out.println();
                System.out.println("                Then number was " + rightGuess);
                System.out.println();
                System.out.println("                  Turns used : " + turns);
                System.out.println();
                System.out.println("           Round score : " + score + " out of 100");
                System.out.println();
                System.out.println("               Play again? (y/n)");

                String playAgainChoice = scan.next().toLowerCase();
                if (playAgainChoice.equals("n")) {
                    playAgain = false;
                }
            }
        }

        System.out.println("_______________    GAME OVER    ________________");
        System.out.println("                 ______________                 ");
        System.out.println("");
    }
}
