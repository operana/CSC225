import java.util.Scanner;

public class SentinelControlLoop{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int userInput = -1;

        while(userInput != 0){
            System.out.print("Enter a number to add to the total sum.\n0 will end the loop: ");
            userInput = input.nextInt();
            sum = sum + userInput;
            System.out.println("sum is " + sum + "\n");
        }

    }
}