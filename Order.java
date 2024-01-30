/*
 * University of Illinois Springfield
 * CSC 225, Module 9, Midterm Exam B
 * Order.java
 * Goal: 2. (35 pts) Write a program 'Order.java' that prompts the user to enter three cities and display them in descending order.
 * Sample run - 
 * Enter the first city: Chicago
 * Enter the second city: Los Angeles
 * Enter the third city: Atlanta
 * Output: The three cities in order are Los Angeles Chicago Atlanta
*/

import java.util.Scanner;

public class Order {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Prompt user to enter three cities 
        System.out.print("Enter the first city: ");
        String city1 = input.nextLine();
        System.out.print("Enter the second city: ");
        String city2 = input.nextLine();
        System.out.print("Enter the third city: ");
        String city3 = input.nextLine();

        //Use compareToIgnoreCase to get lexicographical comparison values
        //if positive (aka > 0), then first city is alphabetically later than city passed as argument
        //if negative (aka < 0), then first city is alphabetically earlier than city passed as argument
        //if equals 0, strings are equal
        int city1to2Value = city1.compareToIgnoreCase(city2);
        int city1to3Value = city1.compareToIgnoreCase(city3);
        int city2to3value = city2.compareToIgnoreCase(city3);

        //invoke rankCities method (void method, invoke as statement)
        rankCities(city1, city2, city3, city1to2Value, city1to3Value, city2to3value);

    }


    //void method to lexicographically rank the cities and output in descending order
    public static void rankCities(String city1, String city2, String city3, int city1to2Value, int city1to3Value, int city2to3value){
        //initialize lexicographical position variables
        String lexLast = "";
        String lexMid = "";
        String lexFirst = "";
        
        //possibility 1: first compare city1 against city2 & city3. if both positive values, lexicographically last
        if (city1to2Value >= 0 && city1to3Value >= 0) { 
            lexLast = city1;
            //nested if to compare city2 to 3. if positive, city2 is lexicographically later than city3
            if(city2to3value >= 0){
                lexMid = city2;
                lexFirst = city3;
            }
            else{
                lexMid = city3;
                lexFirst = city2;
            }
        }
        //possibility 2: compare city1 against city2 & city3. if both negative values, lexicographically first
        else if(city1to2Value <= 0 && city1to3Value <= 0){ 
            lexFirst = city1;
            //nested if to compare city2 to 3. if positive, city2 is lexicographically later than city3
            if(city2to3value >= 0){
                lexMid = city3;
                lexLast = city2;
            }
            else{
                lexMid = city2;
                lexLast = city3;
            }
        }
        //possibility 3: city1 is not first nor last, is middle
        else{
            lexMid = city1;
            //nested if to compare city2 to 3. if positive, city2 is lexicographically later than city3
            if(city2to3value >= 0){
                lexFirst = city3;
                lexLast = city2;
            }
            else{
                lexFirst = city2;
                lexLast = city3;
            }
        }

        //display the three cities in descending-alphabetical order
        System.out.println("The three cities in descending order are " + lexLast + ", " + lexMid + ", " + lexFirst);
    }
}
