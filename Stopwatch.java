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

public class Stopwatch{
    private long startTime;
    private long endTime;

    //A no-arg constructor that initializes startTime with the current time
    //use System.currentTimeMillis() (returns a long) to obtain the total milliseconds since Midnight, Jan 1, 1970 in GMT (all programming languages typically use this date, the unix epoch)
    public Stopwatch(){
        startTime = System.currentTimeMillis();
    }

    //A method named start() that resets the startTime to the current time. void because it doesn't return anything.
    void start(){
        startTime = System.currentTimeMillis();
    }

    //A method named stop() that sets the endTime to the current time. void because it doesn't return anything.
    void end(){
        endTime = System.currentTimeMillis();
    }

    //getter method for private data field startTime
    long getStartTime(){
        return startTime;
    }

    //getter method for private data field endTime
    long getEndTime(){
        return endTime;
    }

    //A method named getElapsedTime() that returns the elapsedTime for the stopwatch in milliseconds.
    long getElapsedTime(){
        return endTime - startTime;
    }
}