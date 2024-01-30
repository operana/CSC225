import java.util.Scanner;

public class UserControlLoop{
    public static void main(String[] args){
        //create scanner object
        Scanner input = new Scanner(System.in);

        char continueLoop = 'Y';

        while(continueLoop == 'Y'){
            System.out.println("Hello!");
            System.out.print("Would you like to continue loop (Enter 'Y' or 'N'): ");
            continueLoop = input.nextLine().charAt(0);
            continueLoop = Character.toUpperCase(continueLoop);
            
        }

    }
}