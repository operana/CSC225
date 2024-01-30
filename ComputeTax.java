/*
From CSC225 - Lecture 05. Trying to write it myself before previewing in lecture

Goal: Compute tax for taxable income based on 4 different filing statuses. Prompt the user to enter the filling status and taxable income, then compute the tax

Note: for each filing status, there are six tax rates. Each rate is applied to acertain amount of taxable income. See lecture 05 for table of 2009 tax rates
 */

 import java.util.Scanner;

 public class ComputeTax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //prompt user to enter filing status & taxable income
        System.out.println("Filing Statuses:" + 
        "\n0. Single filer" +
        "\n1. Married filing jointly" +
        "\n2. Married filing separately" +
        "\n3. Head of Household");
        
        System.out.print("Enter your filing status (0, 1, 2, or 3): ");
        int status = input.nextInt();

        System.out.print("Enter your taxable income: $");
        double income = input.nextDouble();

        //initialize tax variable and amountCaps
        double tax = 0;
        int amountCap0 = 0;
        int amountCap1 = 0;
        int amountCap2 = 0;
        int amountCap3 = 0;
        int amountCap4 = 0;

        //declare marginal tax rate constants
        final double TAX_RATE0 = 0.1;
        final double TAX_RATE1 = 0.15;
        final double TAX_RATE2 = 0.25;
        final double TAX_RATE3 = 0.28;
        final double TAX_RATE4 = 0.33;
        final double TAX_RATE5 = 0.35;

        //switch case to compute tax for each filing status
        switch (status) {
            case 0: amountCap0 = 8350;
                    amountCap1 = 33950;
                    amountCap2 = 82250;
                    amountCap3 = 171550;
                    amountCap4 = 372950;

                    if (income < (amountCap0 + 1)){
                        tax = income * TAX_RATE0;
                    }
                    else if (income < (amountCap1 + 1)){
                        tax = amountCap0 * TAX_RATE0 + (income - amountCap0) * TAX_RATE1;
                    }
                    else if (income < (amountCap2 + 1)){
                        tax = amountCap0 * TAX_RATE0 +  amountCap1 * TAX_RATE1 + (income - amountCap0 - amountCap1) * TAX_RATE2;
                    }
                    else if (income < (amountCap3 + 1)){
                        tax = amountCap0 * TAX_RATE0 +  amountCap1 * TAX_RATE1 + amountCap2 * TAX_RATE2 + (income - amountCap0 - amountCap1 - amountCap2) * TAX_RATE3;
                    }
                    else if (income < (amountCap4 + 1)){
                        tax = amountCap0 * TAX_RATE0 +  amountCap1 * TAX_RATE1 + amountCap2 * TAX_RATE2 + amountCap3 * TAX_RATE3 + (income - amountCap0 - amountCap1 - amountCap2 - amountCap3) * TAX_RATE4;
                    }
                    else {
                        tax = amountCap0 * TAX_RATE0 +  amountCap1 * TAX_RATE1 + amountCap2 * TAX_RATE2 + amountCap3 * TAX_RATE3 + amountCap4 * TAX_RATE4 + (income - amountCap0 - amountCap1 - amountCap2 - amountCap3 - amountCap4) * TAX_RATE5;
                    }
                    break;

            case 1: amountCap0 = 16700;
                    amountCap1 = 67900;
                    amountCap2 = 137050;
                    amountCap3 = 208850;
                    amountCap4 = 372950;

                    if (income < (amountCap0 + 1)){
                        tax = income * TAX_RATE0;
                    }
                    else if (income < (amountCap1 + 1)){
                        tax = amountCap0 * TAX_RATE0 + (income - amountCap0) * TAX_RATE1;
                    }
                    else if (income < (amountCap2 + 1)){
                        tax = amountCap0 * TAX_RATE0 +  amountCap1 * TAX_RATE1 + (income - amountCap0 - amountCap1) * TAX_RATE2;
                    }
                    else if (income < (amountCap3 + 1)){
                        tax = amountCap0 * TAX_RATE0 +  amountCap1 * TAX_RATE1 + amountCap2 * TAX_RATE2 + (income - amountCap0 - amountCap1 - amountCap2) * TAX_RATE3;
                    }
                    else if (income < (amountCap4 + 1)){
                        tax = amountCap0 * TAX_RATE0 +  amountCap1 * TAX_RATE1 + amountCap2 * TAX_RATE2 + amountCap3 * TAX_RATE3 + (income - amountCap0 - amountCap1 - amountCap2 - amountCap3) * TAX_RATE4;
                    }
                    else {
                        tax = amountCap0 * TAX_RATE0 +  amountCap1 * TAX_RATE1 + amountCap2 * TAX_RATE2 + amountCap3 * TAX_RATE3 + amountCap4 * TAX_RATE4 + (income - amountCap0 - amountCap1 - amountCap2 - amountCap3 - amountCap4) * TAX_RATE5;
                    }
                    break;

            case 2: amountCap0 = 8350;
                    amountCap1 = 33950;
                    amountCap2 = 68525;
                    amountCap3 = 104425;
                    amountCap4 = 186475;

                    if (income < (amountCap0 + 1)){
                        tax = income * TAX_RATE0;
                    }
                    else if (income < (amountCap1 + 1)){
                        tax = amountCap0 * TAX_RATE0 + (income - amountCap0) * TAX_RATE1;                        
                    }
                    else if (income < (amountCap2 + 1)){
                        tax = amountCap0 * TAX_RATE0 +  amountCap1 * TAX_RATE1 + (income - amountCap0 - amountCap1) * TAX_RATE2;
                    }
                    else if (income < (amountCap3 + 1)){
                    tax = amountCap0 * TAX_RATE0 +  amountCap1 * TAX_RATE1 + amountCap2 * TAX_RATE2 + (income - amountCap0 - amountCap1 - amountCap2) * TAX_RATE3;                        
                    }
                    else if (income < (amountCap4 + 1)){
                        tax = amountCap0 * TAX_RATE0 +  amountCap1 * TAX_RATE1 + amountCap2 * TAX_RATE2 + amountCap3 * TAX_RATE3 + (income - amountCap0 - amountCap1 - amountCap2 - amountCap3) * TAX_RATE4;
                    }
                    else {
                        tax = amountCap0 * TAX_RATE0 +  amountCap1 * TAX_RATE1 + amountCap2 * TAX_RATE2 + amountCap3 * TAX_RATE3 + amountCap4 * TAX_RATE4 + (income - amountCap0 - amountCap1 - amountCap2 - amountCap3 - amountCap4) * TAX_RATE5;
                    }
                    break;

            case 3: amountCap0 = 11950;
                    amountCap1 = 45500;
                    amountCap2 = 117450;
                    amountCap3 = 190200;
                    amountCap4 = 372950;

                    if (income < (amountCap0 + 1)){
                        tax = income * TAX_RATE0;
                    }
                    else if (income < (amountCap1 + 1)){
                        tax = amountCap0 * TAX_RATE0 + (income - amountCap0) * TAX_RATE1;
                    }
                    else if (income < (amountCap2 + 1)){
                        tax = amountCap0 * TAX_RATE0 +  amountCap1 * TAX_RATE1 + (income - amountCap0 - amountCap1) * TAX_RATE2;
                    }
                    else if (income < (amountCap3 + 1)){
                        tax = amountCap0 * TAX_RATE0 +  amountCap1 * TAX_RATE1 + amountCap2 * TAX_RATE2 + (income - amountCap0 - amountCap1 - amountCap2) * TAX_RATE3;
                    }
                    else if (income < (amountCap4 + 1)){
                        tax = amountCap0 * TAX_RATE0 +  amountCap1 * TAX_RATE1 + amountCap2 * TAX_RATE2 + amountCap3 * TAX_RATE3 + (income - amountCap0 - amountCap1 - amountCap2 - amountCap3) * TAX_RATE4;
                    }
                    else {
                        tax = amountCap0 * TAX_RATE0 +  amountCap1 * TAX_RATE1 + amountCap2 * TAX_RATE2 + amountCap3 * TAX_RATE3 + amountCap4 * TAX_RATE4 + (income - amountCap0 - amountCap1 - amountCap2 - amountCap3 - amountCap4) * TAX_RATE5;
                    }
                    break;

        }

        //get tax amount to 2 decimal places
        tax = (int)(tax * 100) / 100.0;
        //display tax to user
        System.out.println("Based on your filing status and taxable income of $" + income + ", your tax is: $" + tax);


    }
 }
