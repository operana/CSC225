import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        //obtain two numbers, use System.currentTimeMillis and manipulate the numbers a little for some variation
        int number1 = (int) (System.currentTimeMillis() % 10);
        int number2 = (int) (System.currentTimeMillis() / 10 % 10);

        //create new scanner object and prompt user for the answer to the sum of the two numbers
        Scanner input = new Scanner(System.in);
        System.out.print(number1 + " + " + number2 + " = ");
        int answer = (int) (input.nextInt());

        //display whether their answer is true or false
        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));
        System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));


    }
}