/*
 * University of Illinois Springfield
 * CSC 225, Module 8
 * HW 06 Password
 * Goal: Write a method that checks whether a string is a valid password. Suppose the password rules are as follows (must have at least 8 characters, must contain only letters and digits, must contain at least two digits). Write a program that prompts the user to enter a password and displays Valid Password if the rules are followed, or Invalid Password otherwise.
*/

import java.util.Scanner;

public class Password {
    //Main Method
    public static void main(String[] args){
        //Prompt the user to enter a password
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = input.nextLine();

        //Display valid password if rules are followed or invalid password otherwise
        if (isValidPassword(password))
            System.out.println(password + " is a Valid Password.");
        else
            System.out.println(password + " is an Invalid Password.");

    }

    //Method to check password validity
    public static boolean isValidPassword(String password){
        //initialize variables
        boolean isValidLength = false;
        boolean isOnlyLettersAndDigits = false;
        boolean hasAtLeast2Digits = false;
        int countDigits = 0, correctCharCount = 0;
        
        //check whether string is valid password by following 3 criteria
        //1. password must have at least 8 characters
        isValidLength = password.length() >= 8;            
        
        //2. password must contain only letters and digits
        //loop through each digit and tally if character is correctly a letter or digit
        for (int i = 0 ; i < password.length() ; i++){
            if (password.charAt(i) >= 'A' && password.charAt(i) <= 'Z' ||
                password.charAt(i) >= 'a' && password.charAt(i) <= 'z' ||
                password.charAt(i) >= '0' && password.charAt(i) <= '9') {
                
                correctCharCount++;
            }
        }
        if(correctCharCount == password.length()) //if each char is correct, it will equal the String length
            isOnlyLettersAndDigits = true;

        //3. password must contain at least two digits
        //loop through characters and tally number of digits
        for (int j = 0 ; j < password.length() ; j++){
            if (password.charAt(j) >= '0' && password.charAt(j) <= '9'){
                countDigits++;
            }

            if(countDigits >= 2)
                hasAtLeast2Digits = true;
        }

        //check if all 3 criteria pass
        if (isValidLength && isOnlyLettersAndDigits && hasAtLeast2Digits)
            return true;
        else
            return false;

    }


}
