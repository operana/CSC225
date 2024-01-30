
/*
 * University of Illinois Springfield
 * CSC 225, Module 12/Lecture 11/Chapter 9: Objects and Classes
 * HW-08 #2
 * 2. (10 pts) Write a program 'Location' that prompts the user to enter a two-dimensional array and displays the location  of the largest element in the array by the following instructions:
 * (A) Design a class named Location for locating a maximal value and its location in a two-dimensional array:
 * It contains public data field maxValue storing the maximal value as a double type;
 * It contains public data fields row and column storing the indices in a two-dimensional array as int types
 * (B) Write a method named locateLargest for returning the location of the largest element in a two-dimensional array. Note that the return value is an instance of Location.
 * public static Location locateLargest (double [ ][ ]  a)
 *
 *
 * Sample Run:
 * Enter the number of rows and columns in the array: 3 4 (enter)
 * Enter the array:
 * 23.5 35 2 10 (enter)
 * 4.5 3 45 3.5 (enter)
 * 35 44 5.5 9.6 (enter)
 * The location of the largest element is 45 at (1, 2)
*/

import java.util.Scanner;

public class Location{

    public double maxValue; //max value in array
    public int row; //row index of 2D array
    public int column; //column index of 2D array

    //Location constructor
    public Location(double maxValue, int row, int column){
        //initialize object/instance with argument values
        this.maxValue = maxValue;
        this.row = row;
        this.column = column; 
    }

    //A method named locateLargest for returning the location of the largest element in a two-dimensional array.
    public static Location locateLargest(double[][] a){
        //initialize largest value to 0th (first) item in array and indices maxRow and maxCol to 0
        double largest = a[0][0];
        int maxRow = 0;
        int maxCol = 0;

        //loop through array to find largest item
        for (int row = 0; row < a.length; row++){
            for(int col = 0; col < a[row].length; col++){
                if(a[row][col] > largest){
                    largest = a[row][col];
                    maxRow = row;
                    maxCol = col;
                }
            }
        }
        //the return value is an instance of Location (must create new Location object, use keyword new).
        return new Location(largest, maxRow, maxCol);

    }



    /* Main Method */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); //new scanner object

        //Prompt user to enter 2D array
        System.out.print("Enter the number of rows and columns (separated with a space): ");
        int rowCount = input.nextInt();
        int columnCount = input.nextInt();

        //Create 2D array with specified row and column count
        double[][] arr = new double[rowCount][columnCount];

        System.out.println("Enter the array:");

        //Initialize array with user input, use for loop
        for (int row = 0; row < arr.length; row++){
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = input.nextDouble();
            }
        }


        //Invoke locateLargest method, which returns instance of Location class, so save into an object
        Location locate = locateLargest(arr);
        //Display the location of the largest element in the array 
        System.out.println("The location of the largest element " + locate.maxValue + " is at (" + locate.row + ", " + locate.column + ")");

    }


}