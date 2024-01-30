import java.util.Scanner;

public class Cost{
    public static void main(String[] args){
        //prompt the user to enter the weight and price of rice packages
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight and price for package 1 (separate values with a space): ");
        double weight1 = input.nextDouble();
        double price1 = input.nextDouble();
        System.out.print("Enter weight and price for package 2 (separate values with a space): ");
        double weight2 = input.nextDouble();
        double price2 = input.nextDouble();

        //calculate unit price per weight to determine which package has better value
        //whichever value is lower is the better value, effectively searching for the lower cost per pound
        double unitPrice1 = price1 / weight1;
        double unitPrice2 = price2 / weight2;

        //compare unit prices and display the one with the better value
        if (unitPrice1 > unitPrice2)
            System.out.println("Package 2 has a better price.");
        else if (unitPrice1 < unitPrice2)
            System.out.println("Package 1 has a better price.");
        else
            System.out.println("The two packages have the same value.");




    }
}