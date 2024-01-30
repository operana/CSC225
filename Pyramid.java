/*
 * University of Illinois Springfield
 * CSC 225, Module 7
 * HW 5
 * Goal: Write a program 'Pyramid.java' that prompts the user to enter an integer from 1 to 15 and displays a pyramid, shown as follows.
*/

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args){
        //new scanner object and prompt user to enter an integer from 1-15
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the pyramid height (1-15): ");
        int height = input.nextInt();

        //Error checking - ensure user enters height from 1-15
        while(height < 1 || height > 15){
            System.out.println("Invalid height.");
            System.out.print("Enter an int from 1-15: ");
            height = input.nextInt();
        }

        //initialize variable to count number of spaces needed before the numbers in each row
        //e.g. if height is 7 rows, row 1 has 12 spaces before the number (aka 7*2-2 = 12)
        int spaceCount = height * 2 - 2;


        //all rows
        for (int row = 1 ; row <= height ; row ++){
            
            //spaces before each number
            for (int i = 0 ; i < spaceCount ; i++){
                System.out.print(" ");
            }

            //left/decreasing numbers in pyramid up to the middle number 1
            for (int x = row ; x > 0 ; x--){
                System.out.print(x + " ");
            }
            
            //right/increasing numbers in pyramid starting after middle number 1
            for (int y = 2 ; y <= row ; y++){
                System.out.print(y + " ");
            }

            //decrement number of spaces by 2 (bc if height 7, row 2 has 10 spaces before and after (aka 7*2-2-2)). so on...
            spaceCount = spaceCount - 2;
            System.out.println(); //print an empty line to go to start of next row
        }


    }
}
