/*
 * University of Illinois Springfield
 * CSC 225, Module 10 (Lecture 9)
 * Lecture 9: Processing Arrays, trying some of the examples
 * Goal: try different ways of processing arrays from lecture 9 (not all included here, so see lecture for full review)
 * [x]next: modularization of methods
 * [x]next: switch expression to have user pick which method to execute, in do while loop to continue processing until user wants to quit.
 * [x]next: method to shift array values
 * 
 * 
*/

import java.util.Scanner;

public class ArrayTests{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        //prompt user to invoke a method
        System.out.println("Welcome! This program will perform some array tests. We will start by generating an array with a specific amount of random numbers.");
        
        //generate array of random numbers 
        int userInput = 0;
        do {
            System.out.print("Select the amount of random numbers to generate (1-15): ");
            userInput = input.nextInt();
        }
        while (userInput < 1 || userInput > 15);

        //declare and create array (not initializing)
        double[] randomNums = new double[userInput];

        //for loop to initialize array with random numbers
        for (int i = 0; i < randomNums.length ; i++){
            //randomNums[i] = 1 + Math.random() * 100; //will grant random double 1.0 and up to but not including 101.0 (1 + 100)
            //same thing below, but make it only 2 decimal places
            randomNums[i] = (int)((1 + Math.random() * 100) * 100) / 100.0;
        }

        //invoke method to print array values
        outputArrayValues(randomNums);
        
        
        int process = 0;
        //do while loop - continually have user process array until they type 0.
        do {
            //switch expression to have user pick desired array processing and output
            System.out.print("Array Processing Methods:" + 
            "\n0. QUIT" +
            "\n1. Get Max Number and Index of Max Number" +
            "\n2. Get Randomly Shuffled Array" +
            "\n3. Get Shifted Array" +
            "\nSelect method to process our array: ");
            process = input.nextInt();

            switch(process){
                case 0 :
                    System.out.println("You have successfully quit. Goodbye.");
                    System.exit(1);
                    break;
                case 1 :
                    getMaxNumberAndIndex(randomNums);
                    break;
                case 2 :
                    getRandomlyShuffledArray(randomNums);
                    break;
                case 3 :
                    getShiftedArray(randomNums);
                    break;
                default :
                    System.out.println("Invalid selection. Goodbye.");
                    System.exit(1);
            }
        } while (process != 0);



    }







    public static void outputArrayValues(double[] randomNums){
        //print header
        System.out.println("Array of Numbers");
        
        //for loop to print array values
        for (int i = 0 ; i < randomNums.length ; i++){
            //System.out.print(randomNums[i] + "  ");
            //same as above but print on new lines
            System.out.println("Index " + i + ". " + randomNums[i]);
        }
        System.out.println("================================"); //visual line break
    }


    public static void getMaxNumberAndIndex(double[] randomNums){

        //for loop to find largest element AND index of the largest element
        int indexOfMax = 0;
        double max = randomNums[0];
        for (int i = 1 ; i < randomNums.length ; i++){ //start at 1 bc we already set 0th index value to max
            if (randomNums[i] > max){
                max = randomNums[i];
                indexOfMax = i;
            }
        }
        //show results
        System.out.println("Max number is: " + max + 
        "\nIndex of max number is: " + indexOfMax);

        System.out.println("================================"); //visual line break

    }



    public static void getRandomlyShuffledArray(double[] randomNums){
        //try to randomly shuffle array
        for (int i = 0; i < randomNums.length ; i ++){
            //randomly generates an index, i.e. gets random number from 0 (omitted) up to but not including the length of array 
            int indexToSwap = (int)(Math.random() * (randomNums.length));
            //swaps whatever is at index i 
            double temp = randomNums[indexToSwap];
            randomNums[indexToSwap] = randomNums[i]; 
            randomNums[i] = temp;
        }

        outputArrayValues(randomNums);

    }


    public static void getShiftedArray(double[] randomNums){

        System.out.println("Shifting all values left by 1 index...");
        //collect value in 0th index        
        double temp = randomNums[0];
        //for loop condition only to randomNums.length-1 because if we go to < length, it would go out of bounds because loop uses [i+1]
        for (int i = 0 ; i < randomNums.length-1 ; i++){
            randomNums[i] = randomNums[i+1];
        }
        randomNums[randomNums.length-1] = temp;

        outputArrayValues(randomNums);
    }




}