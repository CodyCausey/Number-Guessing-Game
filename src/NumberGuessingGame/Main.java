package NumberGuessingGame;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to this number guessing game.");

        Random rand = new Random();
        int numberToGuess = rand.nextInt(100) + 1;

        int attempts = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Guess a number between 1 and 100: ");

            int guess = scanner.nextInt();

            attempts++;

            if (guess == numberToGuess) {
                System.out.println("Congrats! " + numberToGuess + " was the number, You guessed correctly!");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("To low, guess again");
            } else System.out.println("To high, guess again");
        }
        System.out.println("It took you " + attempts + " attempts to guess the number.");
    }
}
