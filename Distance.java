//Write a program 'Distance.java' that prompts the user to enter 
//two points (x1, y1) and (x2, y2) and displays their distance. The 
//formula for computing the distance is 
//LaTeX: \sqrt[]{\left(x_2-x_1\right)^2+\left(y_2-y_1\right)^2} 
//Notes:  We can use Math. pow (a, 0.5) to compute LaTeX: \sqrt[]{a} .

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        //create new scanner object
        Scanner input = new Scanner(System.in);

        //prompt user to enter two points (x1, y1) and (x2, y2)
        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        //compute the distance between the two points
        double distance = Math.pow((Math.pow(x2 - x1 , 2) + Math.pow(y2 - y1 , 2)) , 0.5);

        //display the distance
        System.out.println("The distance between the two points is " + distance);
    }
}