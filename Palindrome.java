/*
 * University of Illinois Springfield
 * CSC 225, Module 7
 * Case Study 5: Checking Palindrome
 * Goal: Prompt user to enter a string, then check if it's a palindrome
 * Notes: One solution idea is to check first and last character if they're a match, then move along to second and second to last character
 * Once hit a mismatch, or hit middle character (in case of odd number strings), then stop checking along string
 * I didn't preview lecture code. The lecture does it differently, uses low and high as end positions, then does low++ and high-- each iteration of while loop. Also uses boolean variables inside a while loop then if and print statement at end if isPalindrome is true or false.
*/

import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("PALINDROME CHECKER! Enter a word: ");
        String word = input.next();

        //create length - 1 variable to easily use and to not go out of bounds
        int lengthMinusOne = word.length() - 1;

        for(int i = 0; i < word.length() / 2; i++){
            if(word.charAt(i) == word.charAt(lengthMinusOne - i)){
                continue;
            }
            else {
                System.out.println(word + " is NOT a palindrome :/");
                System.exit(1);
            }

        }

        //Print statement that the user's word is a palindrome - outside of for loop because it will never get to this statement (we used System.exit(1) in else statement) unless it is a palindrome.
        System.out.println(word + " is a palindrome!");

        //examples to visualize: mom, dad, noon, racecar

    }
}