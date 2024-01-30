//From CSC225 - Lecture 05. Trying to write it myself before previewing in lecture
//Read me: Body Mass Index (BMI) is a measure of health based on height and weight. It can be calculated by taking your weight in kilograms and dividing it by the square of your height in meters. 
//Goal: write a program that prompts the user to enter a weight in pounds and height in inches and displays the BMI
//conversion: 1 pound is 0.45359237 kilograms
//conversion: 1 inch is 0.0254 meters

import java.util.Scanner;

public class ComputeAndInterpretBMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Prompt user to enter weight in pounds and height in inches
        System.out.println("\nLet's calculate your Body Mass Index (BMI)!");
        System.out.print("Enter your weight in pounds: ");
        double weightInPounds = input.nextDouble();
        System.out.print("Enter your height in inches: ");
        double heightInInches = input.nextDouble();

        //declare constants for the conversion values
        final double KILOGRAMS_PER_POUND = 0.45359237;
        final double METERS_PER_INCH = 0.0254;
        
        //convert weight to kilograms and height to meters
        double weightInKilograms = weightInPounds * KILOGRAMS_PER_POUND;
        double heightInMeters = heightInInches * METERS_PER_INCH;

        //compute BMI: take weight in kilograms and dividing it by the square of your height in meters
        double bmi = weightInKilograms / (Math.pow(heightInMeters , 2));
        //formatting bmi to two decimal places
        //bmi = (int)(bmi * 100) / 100.0;
        //can also format with printf statement. 
        /*
        printf rules
        %.#f , variable
        % = start with percent to begin formatting syntax 
        .2 = decimal & digit: show how many digits you want in the decimal
        f = because it is a floating point value
        \n = doesn't insert new line, so add manually
        , variable = comma + whichever variable value we are displaying in that format
        */
        System.out.printf("Your BMI is %.2f.\n" , bmi);

        //Display BMI for user & use if statements to display user's BMI range
        if (bmi < 18.5){
            System.out.println("Your BMI is underweight.");
        }
        else if (bmi < 25.0){
            System.out.println("Your BMI is normal.");
        }
        else if (bmi < 30.0){
            System.out.println("Your BMI is overweight.");
        }
        else {
            System.out.println("Your BMI is obese.");
        } 
        
        
    }
}