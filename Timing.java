/*
 * University of Illinois Springfield
 * CSC 225, Module 12/Lecture 11/Chapter 9: Objects and Classes
 * HW-08 #1 (Timing.java & Stopwatch.java) 11/20/23
 * 1. (10 pts) Write a program 'Timing' that measures the execution time of selection sorting 100, 000 numbers using a class named StopWatch that contains the following:
 * Private data fields startTime and endTime with getter methods.
 * A no-arg constructor that initializes startTime with the current time.
 * A method named start ( ) that resets the startTime to the current time.
 * A method named stop ( ) that sets the endTime to the current time.
 * A method named getElapsedTime ( ) that returns the elapsedTime for the stopwatch in milliseconds.                   
*/


import java.util.Random; //see Random class from lecture 11

public class Timing {
    /* MAIN METHOD */
    public static void main(String[] args){               
        //Generate array of 100,000 random numbers using java.util.Random class
        int[] numbers = new int[100000]; //create array of size 100,000
        Random rand = new Random(); //construct new random object to use methods from Random class
        for (int i = 0; i < numbers.length; i++){ //for loop and Random class to initialize array with random digits
            numbers[i] = rand.nextInt(100000); //will grant random ints 0 - 100,000 exclusive
        }


        //Measure the execution time of selection sorting 100,000 numbers using a class named StopWatch
        //initialize Stopwatch object
        Stopwatch sw = new Stopwatch(); //constructing the object also initializes the start time of the selection sort, current time in milliseconds
        //selection sort the array with for loop
        for (int i = 0; i < numbers.length-1; i++){ 
            int min = numbers[i];
            int minIndex = i;

            for (int j = i + 1; j < numbers.length; j++){
                //loop through remainder of array & if any value is smaller than the current min value, save that value and that index 
                if(numbers[j] < min){
                    min = numbers[j];
                    minIndex = j;
                }
            }

            //after looping through and saving new min value and minIndex. if the min doesn't equal i (which means a new minimum was identified), swap the values
            if(min != i){
                numbers[minIndex] = numbers[i];
                numbers[i] = min;
            }
        }
        sw.end(); //mark the end time of the selection sort, current time in milliseconds
        
        //Display the timing of the selection sort
        System.out.println("Execution time for selection sort of 100,000 numbers: " + sw.getElapsedTime() + " milliseconds");




    }

}
