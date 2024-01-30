/*
 * CSC 225 at University of Springfield
 * Week 6/Module 6 - Case Study 1: Computing Angles of A Triangle
 * Write a program that prompts the user to enter the x- and y-coordinates of 3 corner points of a triangle. Then display the triangle's angles.
 * Tip: see lecture slides of Module 6, page 84 for shortcut for formula to compute triangle sides AND acos trigonomentric formula to calculate angles
 */


import java.util.Scanner;

public class ComputeAngles{
    public static void main(String[] args){
        //create scanner object to prompt user for x-and-y-coordinates of 3 corner points of triangle
        Scanner input = new Scanner(System.in);
        System.out.print("Corner 1 - Enter x & y coordinates (separated by space): ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Corner 2 - Enter x & y coordinates (separated by space): ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        System.out.print("Corner 3 - Enter x & y coordinates (separated by space): ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();

        //calculate sides
        double sideA = Math.sqrt((x2 - x3) * (x2 - x3) + (y2 - y3) * (y2-y3));
        double sideB = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1-y3));
        double sideC = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        //compute angles
        double angleA = Math.acos((sideA * sideA - sideB * sideB - sideC * sideC) / ((-2) * sideB * sideC));
        double angleB = Math.acos((sideB * sideB - sideC * sideC - sideA * sideA) / ((-2) * sideA * sideC));
        double angleC = Math.acos((sideC * sideC - sideB * sideB - sideA * sideA) / ((-2) * sideA * sideB));

        //trigonomentric functions return radians. convert angles from radians to degrees.
        //obtain to two decimal points
        angleA = (int) (Math.toDegrees(angleA) * 100) / 100.0;
        angleB = (int) (Math.toDegrees(angleB) * 100) / 100.0;
        angleC = (int) (Math.toDegrees(angleC) * 100) / 100.0;

        //display results
        System.out.println("For the following 3 coordinates:\n" +
        "(" + x1 + " , " + y1 + ")\n" +
        "(" + x2 + " , " + y2 + ")\n" +
        "(" + x3 + " , " + y3 + ")");

        System.out.println("The 3 angles are " + angleA + ", " + angleB + ", and " + angleC + " ");

    }
}