/*
 * University of Illinois CSC 225
 * Code from Module 7, Chapter 5: Loops
 * Trying to write the code myself before previewing the given lecture code. 
 * Goal: prompt user to answer 5 new subtraction expressions (generate random numbers) with a while loop. Tell them if they were right/wrong each time
 * At end, give count how many questions they got right & time it took for them to complete test.
*/

import java.util.Scanner;

public class SubtractionQuizWhileLoop{
    public static void main(String[] args){
        //create new scanner object
        Scanner input = new Scanner(System.in);

        //initialize variables
        final int TOTAL_QUESTIONS = 5; //user will answer a constant number questions. 
        int questionCount = 0; //counter variable for while loop iterations
        int correctCount = 0; //count how many questions user gets correct
        long startTime = System.currentTimeMillis(); //obtain current time

        //while loop to prompt user to answer a constant (5) amount of subtraction questions
        while(questionCount < TOTAL_QUESTIONS){
            //generate two random numbers
            int num1 = (int)(Math.random() * 10);
            int num2 = (int)(Math.random() * 10);

            //for subtraction purposes, check if num1 > num2, if not, swap them
            if(num1 < num2){
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            //prompt user to answer subtraction expression
            System.out.print("\n" + num1 + " - " + num2 + " = ");
            int answer = input.nextInt();

            //display whether they are correct (if so, tally up with correctCount variable) or incorrect.
            if(num1 - num2 == answer){
                System.out.println("CORRECT! " + num1 + " - " + num2 + " = " + answer);
                correctCount++;
            }
            else
                System.out.println("Sorry, that is incorrect.\n" + num1 + " - " + num2 + " should be " + (num1 - num2));

            questionCount++; //iteration counter
        }

        long endTime = System.currentTimeMillis(); //obtain end time
        //calculate total elapsed time & convert to seconds (1000 ms in 1 s)
        long elapsedSeconds = (endTime - startTime) / 1000;

        System.out.println("\nCongrats on completing the Subtraction Quiz!" +
        "\nYou correctly answered " + correctCount + "/" + TOTAL_QUESTIONS + " questions." +
        "\nYou took " + elapsedSeconds + " seconds to complete the Subtraction Quiz.");

    }
}