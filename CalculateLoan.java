import java.util.Scanner;

public class CalculateLoan {
    public static void main(String[] args) {
        //create new scanner object
        Scanner input = new Scanner(System.in);

        //obtain user input of interest rate, loan amount, and number of years for which payment will be made
        System.out.print("Enter annual (yearly) interest rate, e.g. 7.25: ");
        double annualInterestRate = input.nextDouble();

        //Compute monthly interest rate. Divide by 12 for 12 months in a year. Divide by 100 to obtain user's percentage input in decimal format
        double monthlyInterestRate = annualInterestRate / 12 / 100;

        System.out.print("Enter loan amount, e.g. $120000.95: $");
        double loanAmount = input.nextDouble();

        System.out.print("Enter number of years as an integer, e.g. 5: ");
        int numberOfYears = input.nextInt();

        //compute monthly and total payment amounts
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
        double totalPayment = monthlyPayment * numberOfYears * 12;

        //manipulate monthlly and total payment to get only 2 decimal places (for cents)
        monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
        totalPayment = (int) (totalPayment * 100)/ 100.0;

        //display monthly and total payment amounts
        System.out.println("The monthly payment is: $" + monthlyPayment);
        System.out.println("The total payment is: $" + totalPayment);
    }
}