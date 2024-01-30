/*
 * University of Illinois Springfield
 * CSC 225, Module 9, Midterm Exam B
 * Sum.java
 * Goal: 1. (30 pts) Write a program 'Sum.java' that reads an integer between 100 and 1000 and adds all the digits in the  integer. For example, if an integer is 528, the sum of all its digits is 15.
 * Sample run - 
 * Enter a number between 100 and 1000: 999
 * Output: The sum of the digits is 27
*/

import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int userNum = 0; //initialize outside of loop because need variable scope to extend throughout main method
        String stringNum = "";

        do{
            //Prompt user to type integer between 100-1000, save input into string for error checking
            System.out.print("Enter a number between 100 and 1000: ");
            stringNum = input.nextLine();
            
            //Error Checking: ensure user only entered digits, count up all the digits in the user input string
            int digitCount = 0;
            for (int i = 0 ; i < stringNum.length() ; i++){
                if(Character.isDigit(stringNum.charAt(i)))
                    digitCount++;
            }

            //if user entered only digits, convert input String into int
            if (digitCount == stringNum.length()){ 
                userNum = Integer.parseInt(stringNum);
            }
            else //else, if user's input is not solely numerical digits, need to start back at top of loop
                continue; 
        } while (userNum < 100 || userNum > 1000); //continue prompting user to enter number if not between 100 to 1000

        //invoke sumDigits method
        System.out.println("The sum of the digits is " + sumDigits(stringNum, userNum));

    }


    //int return method: sum all digits from the user's input number
    public static int sumDigits(String s, int n){
        int total = 0; //total to count all digits
        int value = 0; 
        for (int i = 0 ; i < s.length() ; i++){
            value = s.charAt(i) - '0'; //convert the current character to the correct int decimal value by subtracting char '0' (48 in decimal)
            total = total + value;
        }

        return total;
    }

}
