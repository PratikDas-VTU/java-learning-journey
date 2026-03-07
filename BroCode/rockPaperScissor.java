import java.util.*;

public class rockPaperScissor {
    public static void main(String[] args) {

        // declare variable
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String choice[] = { "rock", "paper", "scissors" };
        String playerChoice;
        String computerChoice;
        String playAgain = "yes";

        // check win conditions
        do {
            // get choice from the user
            System.out.print("Enter Your move (rock/paper/scissors):");
            playerChoice = sc.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") &&
                    !playerChoice.equals("paper") &&
                    !playerChoice.equals("scissors")) {
                System.out.println("Invalid Choice !");
                continue;
            }

            // get random choice from computer
            computerChoice = choice[random.nextInt(3)];
            System.out.println("Computer's Choice : " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a TIE");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors"))
                    || playerChoice.equals("paper") && computerChoice.equals("rock")
                    || playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You Win !");

            } else {
                System.out.println("You Lose !");
            }
            // ask to play again
            System.out.print("Wanna play again (yes/no): ");
            playAgain = sc.nextLine().toLowerCase();
        } while (playAgain.equals("yes"));

        // goodbye message
        System.out.println("Thanks for playing !!");

        sc.close();
    }
}
