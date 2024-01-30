/*
 * University of Illinois Springfield
 * CSC 225, Lecture 12/Chapter 10: Object Oriented Thinking
 * Loan.java & TestLoanClass.java
 * Goal: Write two programs, Loan and TestLoanClass to exhibit and understand class abstraction and encapsulation (separate class implementation from the use of the class, the user of the class does not need to know how the class is implemented, so we can hide/encapsulate the details of the class implementation from the user) 
 * Only viewing the given UML Class Diagram for Loan and trying to write program from that (rather than viewing given code in the lecture)

 * Notes: 
 * A specific loan can be viewed as an object of a Loan class
 * Interest rate, loan amount, and loan period are its data fields, and computing the monthly payment and total payment are its methods
 * When we buy a car, a loan object is created by instantiating the class with your loan interest rate, laon amojunt, and loan period. We can then use the methods to find the monthly payment and total payment of your loan
*/

import java.util.Scanner;

public class TestLoanClass {

    /*MAIN METHOD to test the Loan.java program (Loan Class) */

    public static void main(String[] args){
        //Prompt user to enter data fields
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the annual interest rate, for example, 8.25: ");
        double interestRate = input.nextDouble();

        System.out.print("Enter the number of years of the loan period as an integer: ");
        int numberOfYears = input.nextInt();

        System.out.print("Enter the loan amount: $");
        double loanAmount = input.nextDouble();


        //Now that we have the user-input values, create a loan object
        Loan carLoan = new Loan(interestRate, numberOfYears, loanAmount);


        //display the data fields and monthly and total payment
        System.out.println("Based on loan amount, $" + carLoan.getLoanAmount() + ", with a loan period of " + carLoan.getNumberOfYears() + " years and annual interest rate of " + carLoan.getAnnualInterestRate() + "%:");
        System.out.println("The monthly payment is $" + carLoan.getMonthlyPayment() + "\nThe total payment is $" + carLoan.getTotalPayment());


    }
    


}
