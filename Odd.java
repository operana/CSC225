/*
 * University of Illinois Springfield
 * CSC 225, Module 7
 * Chapter 5 HW: Odd.java
 * Goal: write a program that prompts the user to enter a string and displays the characters at odd positions
*/

import java.util.Scanner;

public class Odd{
    public static void main(String[] args){
        //create scanner object and prompt user to enter a string
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = input.nextLine();
        String oddCharacters = "";

        //display characters at odd positions (1st character is 1st position aka odd, not 0th position)
        for(int i = 0 ; i < text.length() ; i = i+2){
            oddCharacters += text.charAt(i);
        }

        System.out.println(oddCharacters);

    }
}