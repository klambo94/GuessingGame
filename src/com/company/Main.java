package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in); //create a scanner for user input
        boolean playAgain = true;

        while (playAgain) {

            int randNum = (int) (Math.random() * 100); //the random number to check against
            int userGuess = -1; //user input
            int numTimesGuessed = 0;

            System.out.println(randNum); // print out the random number to test
            System.out.println("Guess a random number between 0-100");
            try {
                userGuess = Integer.parseInt(scanner.nextLine());
                numTimesGuessed++;
            } catch (NumberFormatException e) {
                System.out.println("I'm sorry that is a not a number. Please try again with a number between 0-100.");
            }

            while (userGuess != randNum) {
                try {
                    System.out.println("Please guess again.");
                    userGuess = Integer.parseInt(scanner.nextLine());
                    if (userGuess < 0 || userGuess > 100) {
                        System.out.println("That number is not a part of the range. Try again with a number between 0-100.");
                    } else if (userGuess < randNum) {
                        System.out.println("That number is too low");
                        numTimesGuessed++;
                    } else if (userGuess > randNum) {
                        System.out.println("That number is too high");
                        numTimesGuessed++;
                    }

                } catch (NumberFormatException e) {
                    System.out.println("I'm sorry that is a not a number. Please try again with a number between 0-100");
                }
            }
            System.out.println("Congrats! It took you " + numTimesGuessed + " times to guess correctly!");
            System.out.println("Do you want to play again? (y/n)");
            playAgain = scanner.nextLine().equalsIgnoreCase("y");

        }
        System.out.println("That was fun! Hope to see you soon!");
        scanner.close(); //close scanners
        System.out.close(); //close system
    }
}





