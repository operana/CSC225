/*
 * University of Illinois Springfield
 * CSC 225, Module 9, Midterm Exam B 
 * Count.java
 * Professor's comments: +2 for implementing Count.java correctly without needing a 0 to terminate the list of numbers
 * Goal: 3. (35 pts) Write a program 'Count.java' that reads integers, finds the largest of them, and counts its occurrences.
 * Sample run - 
 * Enter numbers: 3 5 2 5 5 5 0
 * Output: The largest number is 5
 * Output: The occurrence count of the largest number is 4
*/

import java.util.Scanner;

public class Count {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    //initialize variables
    char maxChar = '0';
    int occurrences = 0;

    //read integers into a String
    System.out.print("Enter numbers: ");
    String numberString = input.nextLine();

    //loop through string to find maxChar value
    for (int i = 0; i < numberString.length(); i++){
        if (!Character.isDigit(numberString.charAt(i))) //error checking: if user doesn't enter a digit, do not count it, move on to next digit typed 
            continue;
        else{
            if(numberString.charAt(i) > maxChar)
                maxChar = numberString.charAt(i);
        }
    }

    //loop through again to find # of occurrences
    for(int i = 0; i < numberString.length(); i++){
        if((numberString.charAt(i)) == maxChar)
            occurrences++;
    }
    
    //display results
    System.out.println("The largest number is " + maxChar);
    System.out.println("The occurrence count of the largest number is " + occurrences);

    } 
}


