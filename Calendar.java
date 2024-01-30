/*
 * University of Illinois Springfield
 * CSC 225, Module 8, Video 4 - Walkthrough
 * Print Calendar
 * Goal: Prompt user for a month and year and output a formatted calendar 
 * Notes: Use lots of different methods to modularize code. Very large problem, break it down step by step. Be careful with formatting. Will try some on my own and refer to video as needed.
 * Some methods are format focused,and other methods are to get key values
*/


import java.util.Scanner;

public class Calendar{
    public static void main(String[] args){
        //prompt user for month and year
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter a year (YYYY): ");
        int year = input.nextInt();

        //invoke method (void method invoked as statement)
        printCalendar(month, year);
    }


    //[x]Void method to print full calendar
    public static void printCalendar(int month, int year){
        printMonthHeader(month, year);
        printMonthBody(month, year);
    }

    //[x]Void method to print month header
    public static void printMonthHeader(int month, int year){
        System.out.printf("%15s%7d\n" , convertedMonth(month) , year);
        System.out.println("---------------------------------");
        System.out.printf("%-5s%-5s%-5s%-5s%-5s%-5s%-5s\n" , "Sun","Mon","Tue","Wed","Thu","Fri","Sat");
    }

    //[x]Void method to print dates/month body
    public static void printMonthBody(int month, int year){
        //to print month body, we need the start day and total # of days in month
        int startDay = getStartDay(month, year);
        int totalDaysInMonth = getTotalDaysInMonth(month, year);

        //depending on start day, need to do some padding to align it to the correct day of the week
        int i = 0;
        for (i = 0; i < startDay ; i++){
            System.out.print("     "); //5 space padding to align with days of the week in month header. 
        }
    
        //depending on days in month, need to print out each numeric date that we go up to.
        for (i = 1 ; i <= totalDaysInMonth ; i++){
            System.out.printf("%-5d" , i); //print f to format padding nicely. %d because working with decimal (d) int
            //check when we need to jump to new line if we are at end of week
            if((i + startDay) % 7 == 0){
                System.out.println();
            }
        }
        System.out.println();

    }

    //[x]Return method to convert user int month input to String month text
    public static String convertedMonth(int month){
        String monthTitle;
        switch (month){
        case 1: monthTitle = "January"; break;
        case 2: monthTitle = "February"; break;
        case 3: monthTitle = "March"; break;
        case 4: monthTitle = "April"; break;
        case 5: monthTitle = "May"; break;
        case 6: monthTitle = "June"; break;
        case 7: monthTitle = "July"; break;
        case 8: monthTitle = "August"; break;
        case 9: monthTitle = "September"; break;
        case 10: monthTitle = "October"; break;
        case 11: monthTitle = "November"; break;
        case 12: monthTitle = "December"; break;
        default: monthTitle = "Invalid Input"; break;
        }
        return monthTitle;
    }

    //[x]Return method to know start day
    public static int getStartDay(int month, int year){ //parameters: given the month and year, what is the starting day?
        //using given algorithm to compute start day, works on getting any day of the week from the given date
        final int START_DAY_FOR_JAN_1_1800 = 3;
        //get total number of days from 1/1/1800 to month/1/year (elapsed days)
        int startDay = (getTotalElapsedDays(month, year) + START_DAY_FOR_JAN_1_1800) % 7;
        return startDay;

    }

    //[-method complete but i'm confused by logic]Return method to get total days elapsed from starting standard date 1/1/1800 until provided date
    public static int getTotalElapsedDays(int month, int year){
        //get total number of days that have passed since jan 1, 1800
        int total = 0;
        for (int i = 1800 ; i < year ; i++){
            if(isLeapYear(i))
                total += 366;
            else
                total += 365;
        }

        //get total elapsed months
        for (int i = 1 ; i < month ; i++){
            total += getTotalDaysInMonth(i , year); // trying to find month, so parameters will be i & this year
        }
        return total;

    }

    //[x]Return method to know total days in month (30 vs 31, or feb has 28 or 29 if leap year, separate leap year method)
    public static int getTotalDaysInMonth(int month, int year){
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month ==  10 || month == 12)
            return 31;
        else if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        else if (month == 2){
            if (isLeapYear(year))
                return 29;
            else
                return 28;
        }
        else //to catch any errors
            return 0;
    }

    //[x]Return method to confirm whether or not it is a leap year
    public static boolean isLeapYear(int year){
        //Leap year criteria: a year is a leap year if it is divisible by 4 but not by 100, or if it is divisible by 400
        boolean isLeapYear = (year%4 == 0 && year%100 != 0) || year%400 == 0;
        return isLeapYear;
    }
}