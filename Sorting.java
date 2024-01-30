/*
 * University of Illinois Springfield
 * CSC 225, Module 10
 * HW 07: Sorting.java
 * Goal: 2. (10 pts) Write a program 'Sorting' that prompts a user to enter a list and displays whether the list is sorted or not.
 * Sample Run 1 -
 * Enter list: 10 1 5 16 61 9 11 1
 * Output: The list is not sorted
  * Sample Run 2 -
 * Enter list: 1 1 3 4 4 5 7 9 11 21
 * Output: The list is already sorted
*/

import java.util.Scanner;

public class Sorting {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter integers: ");
        String numList = input.nextLine() + " "; //add a space to the end to work with for loop

        //count spaces, which will indicate how many numbers user typed. this value will be array size
        int spaceCount = 0;
        for(int i = 0; i < numList.length(); i++){
            if(numList.charAt(i) == ' ')
                spaceCount++;
        }

        //declare and create array the size the spacecount
        int[] numbers = new int[spaceCount];

        //initialize variables to hold Strings or ints
        String tempString = "";
        int num = 0;
        int arrayIndex = 0;
        //loop through the numList to convert to int and save into array
        for(int i = 0; i < numList.length(); i++){
            if(Character.isDigit(numList.charAt(i))){ //if character at index i is a digit 
                tempString += numList.charAt(i); //concatenate/add the (string) digit to the temp string
            }
            else if(numList.charAt(i) == ' '){ //reaching a space indicates we hit the end of a number
                num = Integer.parseInt(tempString); //convert String into int
                numbers[arrayIndex] = num; //save the int into the array
                tempString = ""; //reset tempString
                arrayIndex++; //count up to next index value in array
            }
            else
                continue; //ignore any non-numerical input
        }

        //check whether array is sorted and print result
        for(int i = 0; i < numbers.length-1; i++){ //use numbres.length-1 since we use [i+1] index in if statement
            if(numbers[i] <= numbers[i+1])
                continue;
            else
                System.out.println("This list is not sorted");
                System.exit(1);
        }
        //the below line of code won't execute unless array is sorted because of System.exit statement above
        System.out.println("This list is already sorted");

    }
}
