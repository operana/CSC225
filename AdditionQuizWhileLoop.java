/*
 * University of Illinois CSC 225
 * Code from Module 7, Chapter 5: Loops
 * Trying to write the code myself before previewing the given lecture code. Had to preview the code to see while loop condition + how much of the logic to embed within the while loop versus out of the while loop.
 * Give the user an addition expression to solve using random numbers 0-9, keep prompting them to answer until they get it right
*/

import java.util.Scanner;

public class AdditionQuizWhileLoop{
    public static void main(String[] args){
        //create new scanner object
        Scanner input = new Scanner(System.in);

        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);
        System.out.print(num1 + " + " + num2 + " = ");
        int answer = input.nextInt();

        while(num1 + num2 != answer){
            System.out.print("That is incorrect. Try again: " + num1 + " + " + num2 + " = " );
            answer = input.nextInt();
        }

        System.out.println("Correct! Nice job.");

    }
}