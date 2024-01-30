/*
 * University of Illinois CSC 225
 * Module 6 Assignment - HW 04
 * 2. (10 pts) Write a program 'SSN.java' that prompts the user to enter a Social Security number 
 * in the format DDD-DD-DDDD, where D is a digit. Your program should check whether the input is valid.
*/


import java.util.Scanner;

public class SSN {
    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Social Security number in the format 'DDD-DD-DDDD' where D is a digit: ");
        String ssn = input.nextLine();

        //Check whether input is valid (i.e. formatting)
        //check 1: ssn should be 11 characters including dashes
        if(ssn.length() != 11) {
            System.out.println(ssn + " is an invalid social security number.");
            System.exit(1);
        }

        //check 2: dashes in correct places (dash character ascii value is 45)
        if (ssn.charAt(3) != 45 || ssn.charAt(6) != 45) {
            System.out.println(ssn + " is an invalid social security number.");
            System.exit(1);
        }

        //check 3: numbers in correct place 
        //store each digit in a variable then check each is a numeric character (number characters ascii value is 48-57)
        char num0 = ssn.charAt(0);
        char num1 = ssn.charAt(1);
        char num2 = ssn.charAt(2);
        char num4 = ssn.charAt(4);
        char num5 = ssn.charAt(5);
        char num7 = ssn.charAt(7);
        char num8 = ssn.charAt(8);
        char num9 = ssn.charAt(9);
        char num10 = ssn.charAt(10);

        if(num0 > 47 && num0 < 58 && num1 > 47 && num1 < 58 && num2 > 47 && num2 < 58){
            if(num4 > 47 && num4 < 58 && num5 > 47 && num5 < 58){
                if(num7 > 47 && num7 < 58 && num8 > 47 && num8 < 58 && num9 > 47 && num9 < 58 && num10 > 47 && num10 < 58){
                    System.out.println(ssn + " is a valid social security number.");
                }
            }
        }
        else
            System.out.println(ssn + " is an invalid social security number.");


    }
}