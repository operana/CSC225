//1. (10 pts) Write a program 'Conversion.java' that converts 
//pounds into kilograms. The program prompts the user to enter 
//a number in pounds, converts it to kilograms, and displays 
//the result. One pound is 0.454 kilogram.

import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        //create new scanner object
        Scanner input = new Scanner(System.in);

        //prompt user to enter a number im pounds and store in variable
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        //convert pounds to kilograms. one pound is 0.454 kilogram
        double kilograms = pounds * 0.454;

        //display conversion
        System.out.println(pounds + " pounds is " + kilograms + " kilograms.");

    }
}