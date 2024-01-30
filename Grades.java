/*
 * University of Illinois Springfield
 * CSC 225, Module 10
 * HW 07: Grades.java
 * Goal: 1. (10 pts) Write a program 'Grades' that prompts a user to enter the total number of students and all scores, then displays the grades.
 * The grades are assigned based on the following scheme:
  (1)  Grade is A if score is >= best - 10;     (2)  Grade is B if score >= best - 20;  

  (3)  Grade is C if score is >= best - 30;     (4)  Grade is D if score is >= best - 40; 

  (5)  Grade is F if otherwise
 * Sample Run - 
 * Enter the number of students: 4
 * Enter 4 scores: 40 55 70 58
 * Output -
 * Student 0 score is 40 and grade is C
 * Student 1 score is 55 and grade is B
 * Student 2 score is 70 and grade is A
 * Student 3 score is 58 and grade is B
*/

import java.util.Scanner;

public class Grades {
    public static void main(String[] args){
        //new scanner object
        Scanner input = new Scanner(System.in);
        
        //Prompt user to enter total number of students
        System.out.print("Enter the number of students: ");
        int students = input.nextInt();

        //declare and create array of student scores: students as index & their corresponding scores as values. array size is number of students
        int[] studentScores = new int[students];

        //Prompt user to enter all scores
        System.out.print("Enter " + students + " scores (with spaces in between): ");

        //Initialize studentScores array with the score values from the user
        //keep track of best score (max score)
        int bestScore = 0;
        for(int i = 0; i < studentScores.length; i++){
            studentScores[i] = input.nextInt();
            
            if (studentScores[i] > bestScore)
                bestScore = studentScores[i];
        }

        //for loop to display the grade of each student
        for(int i = 0; i < studentScores.length; i++){
            System.out.print("Student " + i + " score is " + studentScores[i] + " and grade is ");

            int scoreDiff = bestScore - studentScores[i];
            if (scoreDiff <= 10)
                System.out.println("A");
            else if (scoreDiff <= 20)
                System.out.println("B");
            else if (scoreDiff <= 30)
                System.out.println("C");
            else if (scoreDiff <= 40)
                System.out.println("D");
            else
                System.out.println("F");
        }    
    }


}
