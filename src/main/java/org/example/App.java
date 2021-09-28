package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 32 Solution
 *  Copyright 2021 Jonathan Luong
 */

import java.util.Objects;
import java.util.Scanner;
import java.util.Random;

public class App {

    static void game(int choice) {
        Scanner reader = new Scanner(System.in); // Creates reader
        Random rand = new Random(); // Create random class

        switch(choice) {
            case 1:
                int counter = 1;
                int guess = 0;
                int randomNum = (rand.nextInt(10)) + 1;

                System.out.printf("I have my number. What's your guess? ");

                    while(guess != randomNum) {
                        guess = reader.nextInt();
                        if (guess < randomNum) {
                            System.out.printf("Too low. Guess again: ");
                            counter++;
                        }
                        else if (guess > randomNum) {
                            System.out.printf("Too high. Guess again: ");
                            counter++;
                        }
                    }

                System.out.printf("You got it in %d guesses!\n", counter);
                break;


            case 2:
                counter = 1;
                guess = 0;
                randomNum = (rand.nextInt(100)) + 1;

                System.out.printf("I have my number. What's your guess? ");

                while(guess != randomNum) {
                    guess = reader.nextInt();
                    if (guess < randomNum) {
                        System.out.printf("Too low. Guess again: ");
                        counter++;
                    }
                    else if (guess > randomNum) {
                        System.out.printf("Too high. Guess again: ");
                        counter++;
                    }
                }

                System.out.printf("You got it in %d guesses!\n", counter);
                break;

            case 3:
                counter = 1;
                guess = 0;
                randomNum = (rand.nextInt(1000)) + 1;

                System.out.printf("I have my number. What's your guess? ");

                while(guess != randomNum) {
                    guess = reader.nextInt();
                    if (guess < randomNum) {
                        System.out.printf("Too low. Guess again: ");
                        counter++;
                    }
                    else if (guess > randomNum) {
                        System.out.printf("Too high. Guess again: ");
                        counter++;
                    }
                }

                System.out.printf("You got it in %d guesses!\n", counter);
                break;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in); // Creates reader
        Random rand = new Random(); // Create random class

        boolean flag = true;

        System.out.printf("Let's play Guess the Number!\n\n");

        System.out.printf("Enter the difficulty level (1, 2, or 3): ");
        String choiceS = reader.nextLine();

        char arr[] = choiceS.toCharArray(); // converts to array

        int choice = Integer.parseInt(choiceS); // converts to int

        while(flag) {
            game(choice);

            System.out.printf("\nDo you wish to play again (Y/N)? ");
            String yn = reader.nextLine();

            if (Objects.equals(yn, "Y") || Objects.equals(yn, "y")) {
                System.out.printf("Enter the difficulty level (1, 2, or 3): ");
                choiceS = reader.nextLine();
                choice = Integer.parseInt(choiceS);
            }
            else {
                System.out.printf("Thanks for Playing! ");
                flag = false;
                break;
            }

        }
    }
}