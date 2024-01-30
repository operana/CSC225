/*
 CSC 225 - UIS - Lecture 05
 Develop a program to play lottery.
 Requirements Specification
 1) The program randomly generates a lottery of a two-digit number. 
 2) prompts the user to enter a two digit number. 
 3) determines whether the user wins and displays winning/losing status to user

 Rules to deterimine if user wins:
 -If the user input matches the lottery number in the exact order, the award is $10,000.
 -If all digits in the user input match all digits in the lottery number, the award is $3,000.
 -If one digit in the user input matches a digit in the lottery number, the award is $1,000.
*/

import java.util.Scanner;

public class Lottery{
    public static void main(String[] args){
        //randomly generate winning lottery number (two digit)
        int lotteryNumber = (int)(Math.random() * 100);

        //prompt the user to guess the lottery number
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your guess of the winning lottery number (two digits): ");
        int guess = input.nextInt();

        //obtain individual digits of lottery number and user's guess
        int lotteryDigit1 = lotteryNumber / 10;
        int lotteryDigit2 = lotteryNumber % 10;
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        //create boolean expressions to determine whether the user won
        //can just put these within if statements as well
        boolean topWin = guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2;
        boolean midWin = guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1;
        boolean lowWin = guessDigit1 == lotteryDigit1 
        || guessDigit1 == lotteryDigit2 
        || guessDigit2 == lotteryDigit1 
        || guessDigit2 == lotteryDigit2;

        //display result and how much user won
        System.out.println("The winning lottery number is " + lotteryNumber + "\nYou guessed: " + guess);
        if (topWin){
            System.out.println("Congrats! Exact Match: You won $10,000!");
        }
        else if (midWin){
            System.out.println("Congrats! Matched all digits: You won $3,000!");
        }
        else if(lowWin){
            System.out.println("Congrats! One of the digits matched: You won $1,000!");
        }
        else {
            System.out.println("Not a winner this time. Thanks for playing.");
        }


    }
}