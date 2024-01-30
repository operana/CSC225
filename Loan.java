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


public class Loan{
    //4 private data fields
    private double annualInterestRate; //default 2.5
    private int numberOfYears; //default 1
    private double loanAmount; //default 1000
    private java.util.Date loanDate; //the date this loan was created

    //2 Constructors (default no-arg constructor invokes other constructor with this keyword)
    Loan(){ //construct a default loan object
        this(2.5, 1, 1000);
    }

    Loan(double annualInterestRate, int numberOfYears, double loanAmount){ //constructs a loan object with specified interest rate, years, and loan amount
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        loanDate = new java.util.Date(); //need to create a new date object when constructing loan (don't need this line of code in above constructor because the above construct invokes THIS constructor, so this line is executed)
    }

    //Getter/Accessor methods (for private data fields)
    public double getAnnualInterestRate(){ //returns the annual interest rate of this loan
        return annualInterestRate; 
    }

    public int getNumberOfYears(){ //returns the number of years of this loan
        return numberOfYears;
    }

    public double getLoanAmount(){ //returns the amount of this loan
        return loanAmount;
    }

    public java.util.Date getLoanDate(){ //returning an object from the Date class
        return loanDate; //returns the date of the creation of this loan
    }

    //Setter/Mutator methods
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate; //sets a new annual interest rate for this loan
    }

    public void setNumberOfYears(int numberOfYears){
        this.numberOfYears = numberOfYears; //sets a new number of years for this loan
    }

    public void setLoanAmount(double loanAmount){
        this.loanAmount = loanAmount; //sets a new amount for this loan
    }

    //methods to compute and get monthly payment and total payment
    public double getMonthlyPayment(){
        //computations
        double monthlyInterestRate = annualInterestRate / 1200; //divided by 1200 because it is a percent
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));

        return (int)(monthlyPayment * 100) / 100.0; //get it to 2 decimal places
    }

    public double getTotalPayment(){
        double totalPayment = getMonthlyPayment() * numberOfYears * 12;
        return (int)(totalPayment * 100) / 100.0; //get it to 2 decimal places
    }


    //Write a program TestLoanClass.java with a main method that tests the Loan Class (for class abstraction and encapsulation)


}