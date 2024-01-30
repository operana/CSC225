/*
 * University of Illinois Springfield
 * CSC 225, Module 8
 * HW 06 Display Sorted Numbers
 * Goal: Write a method with the following header to display three numbers in increasing order. Write a test program that prompts the user to enter three numbers and invokes the method to display them in increasing order.
 * public static void displaySortedNumbers(double num1, double num2, double num3)
*/

import java.util.Scanner;

public class SortNumbers{
    public static void main(String[] args){
        //prompt the user to enter 3 numbers
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double num1 = input.nextDouble();
        System.out.print("Enter number 2: ");
        double num2 = input.nextDouble();
        System.out.print("Enter number 3: ");
        double num3 = input.nextDouble();
        
        //invoke displaySortedNumbers method (void method invoked as statement) to display the numbers in increasing order
        displaySortedNumbers(num1, num2, num3);
        
    }


    //Method to display numbers in increasing order, 3 doubles as parameters
    public static void displaySortedNumbers(double num1 , double num2 , double num3){
        //initialize variables
        double least, mid, greatest;

        //create path from smallest to largest number
        if(num1 <= num2 && num1 <= num3){ //num1 smallest
            least = num1;

            if(num2 < num3){
                mid = num2;
                greatest = num3;
            }
            else {//if num2 is equal to num3, order of the two doesn't matter
                mid = num3;
                greatest = num2;
            }
        }

        else if(num2 <= num1 && num2 <= num3){ //num2 smallest
            least = num2;

            if(num1 < num3){
                mid = num1;
                greatest = num3;
            }
            else {//if num2 is equal to num3, order of the two doesn't matter
                mid = num3;
                greatest = num1;
            }
        }
        
        else { //num3 smallest
            least = num3;

            if(num2 < num1){
                mid = num2;
                greatest = num1;
            }
            else {//if num1 is equal to num3, order of the two doesn't matter
                mid = num1;
                greatest = num2;
            }

        }

        System.out.println(least + ", " + mid + ", " + greatest);

    }

}