//Goal: change a given amount of money into smaller monetary units. The program will report maximum number of dollars, then maximum number of quarters, and so on for dimes, nickels, and pennies.
//User inputs amouont in decimal representing dollars and cents
//Output is a report listing the monetary equivalent in dollars, quarters, dimes, nickels, and pennies

import java.util.Scanner;

public class ComputeChange {
    public static void main(String[] args) {
        //create new scanner input object
        Scanner input = new Scanner(System.in);
        
        //prompt user for total amount
        System.out.print("Enter monetary amount: $");
        double amount = input.nextDouble();

        //compute change to report max number of dollars, then quarters, then dimes, then nickels, then pennies
        //Obtain max dollars. Multiply double amount by 100 (e.g. 15.00 -> 1500), typecast as int to truncate the decimals in the next step in case user typed more than 2 decimal places, then divide by 100, which chops off the last 2 decimal places. 
        int maxDollars = (int)(amount * 100) / 100;
        //obtain remaining cents after max dollars have been calculated. Multiply by 100 to get whole number integer, not decimals. typecast to int.
        int totalCents = (int)((amount - maxDollars) * 100);

        //obtain max quarters. divide totalCents by 25 to see how many quarters fit in. using int to truncate any decimals.
        int maxQuarters = (totalCents / 25);
       //obtain remaining cents after max quarters have been calculated. to do so, multipy quarter value (aka 25) by the amount of quarters. subtract totalCents - quarters.
        totalCents = totalCents % 25;

        //do the same for dimes and nickels
        int maxDimes = totalCents / 10;
        totalCents = totalCents % 10;
        
        int maxNickels = totalCents / 5;
        totalCents = totalCents % 5;

        //max pennies is whatever is remaining in total cents
        int maxPennies = totalCents;


        System.out.println("Your amount $" + amount + " consists of " + maxDollars + " dollar(s), " + maxQuarters + " quarter(s), " + maxDimes + " dime(s), " + maxNickels + " nickel(s), and " + maxPennies + " pennies.");
        
    }
}