/*
 * University of Illinois Springfield
 * CSC 225, Module 10, Lecture 9. 10/25/23
 * Calculator (Example from lecture)
 * Goal: Develop a program that performs arithmetic operations on integers, using command line arguments 
 * Command line note: when the main method is invoked, the Java interpreter creates an array to hold the command-line arguments and pass the array reference to args
 * Notes: This program receives an expression in one string argument. The expression consists of an integer followed by an oeprator and another integer
 * Example to run program in command line: java Calculator 2+3
 * Output: 2+3=5
*/

public class BasicCalculator {
    public static void main(String[] args){ //main method parameter is a String array with array reference variable 'args'
        //Ensure user enters expression in command line when running program, otherwise notify correct usage and quit program
        if (args.length != 3){ // must be 3 separate strings, aka spaces in between items
            System.out.println("Usage: java BasicCalculator operand (space) operator (space) operand\nuse single-digit operands only.\n");
            System.exit(1);
        }

        //initialize result variable
        int result = 0;

        //using a switch expression, complete the operation with the command line arguments
        /*switch(args[1].charAt(0)){ //must include charAt(0) because if we just do args[1], it will return it as a String, not the char
            case '+' :  result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                        break;
            case '-' :  result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                        break;
            case '*' :  result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                        break;
            case 'x' :  result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                        break;
            case '/' :  result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                        break;
        }  */

        switch(args[1]){ //above works or this version works. changing from string to char as switch case.
            case "+" :  result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
                        break;
            case "-" :  result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]);
                        break;
            case "." :  result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]); // BTW, using * operator in command line argument doesn't work because * is often used as a wildcard
                        break;
            case "x" :  result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                        break;
            case "/" :  result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
                        break;
            default :   //if user doesn't enter a correct operator
                        System.out.println("Incorrect operator. Use the following: +, -, ., x, or /");
                        System.exit(1);
        }

        //display result
        System.out.println(args[0] + " " + args[1] + " " + args[2] + " = " + result);
    }
}
