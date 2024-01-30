/*
 * University of Illinois Springfield
 * CSC 225, Module 8
 * Program example in lecture 8, defining a method, pass by values,
 * Goal: Show how you can create a method and use pass by values, but the pass by values are altered and NOT the actual variable values
*/

import java.util.Scanner;

public class SwapTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input.nextInt();
        
        System.out.println("==========RESULTS==========");
        System.out.println("Before swap test method, num1: " + num1 + " & num2: " + num2); //anticipating it doesn't work
        //invoke method 1 (void method, doesn't return a value, needs to be invoked as a statement)
        swapTest(num1, num2);
        System.out.println("After swap test method, num1: " + num1 + " and num2: " + num2); //anticipating it doesn't work
        System.out.println("Note: see how it only changes the pass by values within the method. The actual variable values are not affected.");
    }

    public static void swapTest(int num1 , int num2){
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.printf("Within the swap test method, num1: %d and num2: %d\n" , num1 , num2);
    }

}

    