import java.util.*;

public class numberGuessing {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(1, 101); // 1 to 100
        int guess;
        int attempts = 0;

        System.out.println("!! Welcome to Number Guessing Game !!");
        System.out.println("Guess a number between 1 - 100");

        do {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess < number) {
                System.out.println("Guess a HIGHER number!");
            } 
            else if (guess > number) {
                System.out.println("Guess a LOWER number!");
            } 
            else {
                System.out.println("🎉 Correct! You guessed it!");
            }

        } while (guess != number);

        System.out.println("You won the game in " + attempts + " attempts.");
        sc.close();
    }
}