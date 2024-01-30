/*
 * University of Illinois Springfield
 * CSC 225, Module 10, Lecture 9
 * Variable Arguments Demo - slide 59 of lecture.
 * Goal: Test variable-length argument lists. Passing same-type variable number of arguments to a method. When you invoke that method, java creates the array and passes the arguments to it.
 * Notes: Code given in lecture as an example/demo. I'm copying the lecture code to try to run it on VS code to actually see output. (Lecture doesn't show output)
*/

public class VariableArgsDemo {
    public static void main(String[] args){
        printMax(34, 3, 3, 2, 56.5);
        printMax(new double[]{1, 2, 3});
    }

    //method with variable length parameter - to print max value
    public static void printMax(double... numbers){
        if (numbers.length == 0){
            System.out.println("No argument passed.");
            return;
        }

        double maxResult = numbers[0];

        for(int i = 1; i < numbers.length; i++){
            if (numbers[i] > maxResult)
                maxResult = numbers[i];
        }

        System.out.println("The max value is " + maxResult);

    }

}
