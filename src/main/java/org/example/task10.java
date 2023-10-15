package org.example;

import java.util.Random;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Random random = new Random();
        int secretNumber = random.nextInt(101);
        int numberOfGuesses = 0;
        boolean guessedCorrectly = false;

        Scanner scanner = new Scanner(System.in);

        while (!guessedCorrectly) {
            System.out.print("Guess a number: ");
            int userGuess = scanner.nextInt();
            numberOfGuesses++;

            if (userGuess < secretNumber) {
                System.out.println("The number is greater.");
            } else if (userGuess > secretNumber) {
                System.out.println("The number is lesser.");
            } else {
                System.out.println("Congratulations, your guess is correct!");
                guessedCorrectly = true;
            }
        }

        System.out.println("It took you " + numberOfGuesses + " guesses to find the correct number.");
    }
}
