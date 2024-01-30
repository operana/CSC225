/*
 CSC 225 - UIS - Lecture 05
 Develop a program that prompts the user to enter a year (as an integer), checks if it is a leap year, and displays it to the user
 Leap year criteria: a year is a leap year if it is divisible by 4 but not by 100, or if it is divisible by 400
*/

import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args){
        //create new scanner input object & prompt user to enter a year
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        //create boolean expression to check if the user's year is a leap year
        boolean isLeapYear = (year%4 == 0 && year%100 != 0) || year%400 == 0;

        //display to user
        if (isLeapYear){
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is NOT a leap year.");
        }


    }
}