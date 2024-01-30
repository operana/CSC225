/*
 * University of Illinois CSC 225
 * Module 6 Assignment - HW 04
 * 1. (10 pts) Write a program 'Phone.java' that prompts a user to enter a lowercase or uppercase letter 
 * and display its corresponding number. For a nonletter input, display invalid input. 
 * Use the international standard letter / number mapping found (google it if necessary)
*/


import java.util.Scanner;

public class Phone{
    public static void main(String[] args){
        //create scanner object
        //prompt user to enter a letter. Store it in 'ch' and change to one case for consistency sake.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter one letter: ");
        String s = input.nextLine();
        char ch = Character.toLowerCase(s.charAt(0));

        //Check for input errors
        //We switched ch to lowercase. a-z in decimal is 97-122. If ch is not in those bounds, then it is not a letter.
        if (s.length() != 1){
            System.out.println("Invalid Input. Enter 1 letter.");
            System.exit(1);
        }
        if (ch < 97 || ch > 122){
            System.out.println(ch + " is invalid input. Enter 1 letter.");
            System.exit(1);
        }

        //display corresponding number using international standard letter/number mapping
        //refer to ascii table for decimal codes for letters.
        if (ch < 100)
            System.out.println("The corresponding number is 2.");
        else if(ch < 103)
            System.out.println("The corresponding number is 3.");
        else if(ch < 106)
            System.out.println("The corresponding number is 4.");
        else if(ch < 109)
            System.out.println("The corresponding number is 5.");
        else if(ch < 112)
            System.out.println("The corresponding number is 6.");
        else if(ch < 116)
            System.out.println("The corresponding number is 7.");
        else if(ch < 119)
            System.out.println("The corresponding number is 8.");
        else
            System.out.println("The corresponding number is 9.");

    }
}