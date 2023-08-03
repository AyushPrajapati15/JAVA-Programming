//Word guessing game
import java.util.Scanner;

public class WordGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String Word = "programming";
        StringBuilder guessedWord = new StringBuilder(Word.length());

        for (int i = 0; i < Word.length(); i++) {
            guessedWord.append("_");
        }

        int attempts = 15;

        System.out.println("Welcome to the Word Guessing Game!");
        System.out.println("Try to guess the secret word by " +
                "entering one letter at a time.");
        System.out.println("You have " + attempts + " attempts.");

        while (attempts > 0) {
            System.out.println("Current word: " + guessedWord);
            System.out.print("Enter a letter: ");

            try {
                char guess = scanner.nextLine().charAt(0);

                boolean correctGuess = false;
                for (int i = 0; i < Word.length(); i++) {
                    if (Word.charAt(i) == guess) {
                        guessedWord.setCharAt(i, guess);
                        correctGuess = true;
                    }
                }

                if (correctGuess) {
                    System.out.println("Good guess!");
                } else {
                    System.out.println("Oops! That letter is not in " +
                            "the word.");
                    attempts--;
                }

                if (guessedWord.toString().equals(Word)) {
                    System.out.println("Congratulations! You guessed" +
                            " the word: " + Word);
                    break;
                }

                System.out.println("Attempts left: " + attempts);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Please enter a single letter.");
            }
        }

        if (attempts == 0) {
            System.out.println("Sorry, you've run out of attempts." +
                    " The secret word was: " + Word);
        }
    }
}
