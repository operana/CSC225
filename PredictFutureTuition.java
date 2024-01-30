/*
 * University of Illinois Springfield
 * CSC 225, Module 7, Case Study 3: Predicting Future Tuition (with some additions I'm personally adding to it)
 * Goal: Suppose the given starting tuition of a university is $10,000. We want to find how many years it will take to double if it increases a certain percent every year (problem gives 7%, but we can prompt user to give interest percent.)
 * The tuition for a future year is the tuition of its preceding year * 1.07
*/


import java.util.Scanner;

public class PredictFutureTuition {
    public static void main(String[] args){
        double tuition = 10000;
        final int DOUBLED_TUITION = 20000;

        Scanner input = new Scanner(System.in);
        System.out.print("What percent does the tuition increase each year (enter as an int): ");
        int percentIncrease = input.nextInt();

        int year = 0;

        while (tuition < DOUBLED_TUITION){
            tuition = tuition * 1.07;
            year++;
        }


        //the wording of my print statement is hard to understand. rework in future
        System.out.printf("The tuition, $%.2f , will double by year %d at %d percent" , tuition , year , percentIncrease);

    }
    
}
