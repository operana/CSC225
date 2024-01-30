import java.util.Scanner; //imports Scanner from the java.util package

public class ComputeAreaWithConsoleInput {
    public static void main(String[] args)
    {
        //create scanner object
        Scanner input = new Scanner(System.in);

        //prompt user to enter radius
        System.out.print("Enter a number for radius: ");

        //store user's input for radius into our float/real number/double radius variable
        double radius = input.nextDouble();

        //calculate area
        double area = radius * radius * 3.14159;

        //display result in console
        System.out.println("The area of a circle with radius " 
        + radius + " is " + area);
    }
}
