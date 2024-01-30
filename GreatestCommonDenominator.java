/*
 * University of Illinois Springfield
 * CSC 225, Module 7, Case Study 2: Greatest Common Denominator
 * Goal: Write a program that prompts the user to enter two positive integers and finds and outputs their greatest common denominator
*/

import java.util.Scanner;

public class GreatestCommonDenominator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //prompt user to enter two positive integers
        System.out.print("Enter two positive integers separated by a space: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        //initialize gcd and counter variable
        int gcd = 1; //start at 1 bc all numbers divisible by 1
        int count = 2; //start at 2 bc 1 is already default gcd. need greater than that to see if there is a greater gcd, so start at the next integer up

        //while loop to find gcd
        //gcd must be less than or equal to number
        //to be gcd, must be completely divisible, with no remainder (aka remainder 0)
        while(count <= num1 && count <= num2){
            if (num1 % count == 0 && num2 % count == 0){
                gcd = count;
            }
            count++;
        }


        System.out.println("The Greatest Common Denominator is " + gcd);


    }
}
