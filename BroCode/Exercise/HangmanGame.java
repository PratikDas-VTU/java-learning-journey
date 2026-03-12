import java.util.Scanner;
import java.util.Random;

public class HangmanGame {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] words = {
                "java", "computer", "cybersecurity", "programming",
                "network", "keyboard", "algorithm"
        };

        String word = words[random.nextInt(words.length)];
        char[] guessedWord = new char[word.length()];

        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        int attempts = 6;
        boolean wordGuessed = false;

        System.out.println("===== HANGMAN GAME =====");

        while (attempts > 0 && !wordGuessed) {

            System.out.print("\nWord: ");
            for (char c : guessedWord) {
                System.out.print(c + " ");
            }

            System.out.println("\nAttempts left: " + attempts);
            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            boolean correctGuess = false;

            for (int i = 0; i < word.length(); i++) {

                if (word.charAt(i) == guess) {
                    guessedWord[i] = guess;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                attempts--;
                System.out.println("Wrong guess!");
            }

            if (word.equals(String.valueOf(guessedWord))) {
                wordGuessed = true;
            }
        }

        if (wordGuessed) {
            System.out.println("\nYou won! The word was: " + word);
        } else {
            System.out.println("\nGame Over! The word was: " + word);
        }

        scanner.close();
    }
}