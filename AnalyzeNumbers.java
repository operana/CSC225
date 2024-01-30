/*
 * University of Illinois Springfield
 * CSC 225, Module 10, Lecgture 9
 * Case Study 1: Analyze Numbers
 * Goal: Let the user enter the number of input, get average of these numbers, find the number of items greater than the average
 * Notes: Use an array to write program. I tried this on my own before previewing lecture case study. My code successfully works; however, after reviewing lecture case study, this can be condensed to just 2 for loops because the user inputting values & getting the sum could've be done altogether with the first loop
*/

import java.util.Scanner;

public class AnalyzeNumbers {
    public static void main(String[] args){
        //new scanner object
        Scanner input = new Scanner(System.in);
        
        //prompt user to enter number of input
        System.out.print("Enter the number of items: ");
        int itemCount = input.nextInt();

        //declare and create array. not yet initializing array, user will add values in upcoming for loop
        double[] numSet = new double[itemCount]; //creates new array of doubles, of size itemCount (int user entered)

        //prompt user to add values to array
        for(int i = 0; i < numSet.length ; i++){
            System.out.print("Enter number " + (i+1) + ": ");
            numSet[i] = input.nextDouble();
        }

        //Find average of the numbers: loop through array and add values to a total amount, then divide by total num count ((((from lecture case study example, this step could've be done altogether with the first loop))))
        double total = 0;
        double average = 0;
        for (int i = 0; i < numSet.length ; i++){
            total = total + numSet[i];
        }
        average = total / itemCount; //same as total / numSet.length
        System.out.printf("The total amount is %4.2f. The average of these values is %4.2f\n" , total , average); //Optional: print total and average values for user.
        //format specifier information: %f is format specifier for floats and doubles, while %d is for ints. 4 is the field width. 2 is the precision amount (to 2 decimal places in this case)
        

        //Main Goal: Find the number of items greater than the average: loop through array and count these values
        int greaterItems = 0;
        for(int i = 0; i < numSet.length; i++){
            if (numSet[i] > average)
                greaterItems++;
        }
        System.out.printf("The number of items greater than the average is %d\n" , greaterItems);
        







    }
}
