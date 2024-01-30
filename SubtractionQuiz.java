import java.util.Scanner;

//goal: program for a young student to practice subtraction
public class SubtractionQuiz {
    public static void main(String[] args) {
        //1. randomly generate two single digit integers, with number 1 >= number 2
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        //1a.if number1 < number2, swap number 1 and 2
        if (number1 < number2) {
            int tempNumber = number1;
            number1 = number2;
            number2 = tempNumber;
        }

        //2. display the expression to the user, prompting them to answer
        Scanner input = new Scanner(System.in);
        System.out.print(number1 + " - " + number2 + " = ");
        int answer = input.nextInt();

        //3. display a message indicating whether their answer is correct or incorrect
        boolean correctTest = number1 - number2 == answer;

        if (correctTest) {
            System.out.println(number1 + " - " + number2 + " = " + answer + " is " + correctTest);
        }
        else {
            System.out.println(number1 + " - " + number2 + " = " + answer + " is " + correctTest);
        }
    }
}