//CSC 225 - Module 5 - Chapter 3 Assignment, Part 1

/*
 Game.java plays the popular rock-paper-scissors game. 
 Rules: scissor beats paper, rock beats scissor, paper beats rock
 Program Requirements Specification
 1) randomly generates a number 0, 1, 2 representing scissors, rock, paper, respectively
 2) prompts user to enter a number 0, 1, 2
 3) displays a message indicating whether the user or computer wins, loses, or draws
*/


import java.util.Scanner;

public class Game{
    public static void main(String[] args){
        //randomly generate number 0, 1, 2 to represent computer's pick for scissor, rock, or paper, respectively.
        //use upper and lower bounds and range to only yield 0, 1, or 2
        int upperBound = 2;
        int lowerBound = 0;
        int range = (upperBound - lowerBound) + 1;
        int computerPick = (int) (Math.random() * range) + lowerBound;

        //create scanner object and prompt user to enter a number for their pick
        Scanner input = new Scanner(System.in);
        System.out.print("Select scissors (0), rock (1), or paper (2): ");
        int userPick = input.nextInt();


        //switch case of computer's picks to display winner
        //do not need curly braces with if statements if only one line of code
        switch(computerPick){
            case 0: if (userPick == 0)
                        System.out.println("The computer is scissors. You are scissors. It is a draw.");
                    else if (userPick == 1)
                        System.out.println("The computer is scissors. You are rock. You win.");
                    else if (userPick == 2)
                        System.out.println("The computer is scissors. You are paper. You lose.");
                    else
                        System.out.println("Error. You made an invalid choice.");
                    break;

            case 1: if (userPick == 0)
                        System.out.println("The computer is rock. You are scissors. You lose.");
                    else if (userPick == 1)
                        System.out.println("The computer is rock. You are rock. It is a draw.");
                    else if (userPick == 2)
                        System.out.println("The computer is rock. You are paper. You win.");
                    else
                        System.out.println("Error. You made an invalid choice.");
                    break;

            case 2: if (userPick == 0)
                        System.out.println("The computer is paper. You are scissors. You win.");
                    else if (userPick == 1)
                        System.out.println("The computer is paper. You are rock. You lose.");
                    else if (userPick == 2)
                        System.out.println("The computer is paper. You are paper. It is a draw.");
                    else
                        System.out.println("Error. You made an invalid choice.");
                    break;

        }
    }
}
