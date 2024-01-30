/*
 * University of Illinois Springfield, CSC 225, Module 7
 * Case Study 1: Guessing Numbers
 * Goal: Develop a program guessing what number a computer has in mind 
 * Requirements Specifications:
 * 1. Program randomly generates an integer between 0 and 100, inclusive
 * 2. Prompt user to enter a number continuously until the number matches the randomly generated number (my idea: or until user wants to quit)
 * 3. For each user input, the program tells the user whether the input is too low or too high, so the user can make the next guess intelligently
*/

import java.util.Scanner;

public class GuessNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        //1. Randomly generate an int between 0 and 100, inclusive
        //a + Math.random() * b = returns a random integer between a and a+b, excluding a+b
        int magicNumber = (int)(0 + Math.random() * 101);

        //2. Prompt user to enter a number continuously until the number matches the randomly generated number (my idea: or until user wants to quit)
        int userGuess = -1; //initialize userGuess to negative value
        while (userGuess != magicNumber){
            System.out.print("Guess the magic number: ");
            userGuess = input.nextInt();

            //3. For each user input, the program tells the user whether the input is too low or too high, so the user can make the next guess intelligently
            if (userGuess < magicNumber)
                System.out.println("Too low\n");
            else if (userGuess > magicNumber)
                System.out.println("Too high\n");
        }

        //Put congratulatory statement out of loop because they will only exit the loop once they guessed the magic number correctly
        System.out.println("Congrats! You guessed the magic number " + magicNumber + "!\n");

        //System.out.println(magicNumber);
    }
}