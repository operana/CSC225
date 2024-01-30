import java.util.Scanner;

public class ComputeLoan {
    public static void main(String[] args) {
        //create scanner object
        Scanner input = new Scanner(System.in);

        //obtain user imput: yearly interest rate,
        System.out.print("Enter yearly interest rate, e.g. 8.25: ");
        double yearlyInterestRate = input.nextDouble();
        //convert to monthly interest rate, convert to decimal format
        double monthlyInterestRate = yearlyInterestRate / 12 / 100;
        
        //obtain user imput: duration of loan/number of years
        System.out.print("Enter number of years as an integer, e.g. 5: ");
        int numberOfYears = input.nextInt();

        //obtain user input: loan amount
        System.out.print("Enter loan amount, e.g. 120000.95: $");
        double loanAmount = input.nextDouble();

        //calculate repayments & manipulate to only 2 decimal places
        double monthlyPayment = loanAmount * numberOfYears / (1 - 1 / Math.pow(1 + monthlyInterestRate , numberOfYears * 12));
        monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
        double totalPaymemt = monthlyPayment * numberOfYears * 12;
        totalPaymemt = (int)(totalPaymemt * 100) / 100.0;

        System.out.println("Monthly paymemt: $" + monthlyPayment);
        System.out.println("Total payment: $" + totalPaymemt);
    }
}