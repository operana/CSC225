/*
 * University of Illinois Springfield
 * CSC 225, Module 11/Lecture 10
 * Grading a Multiple-Choice Test
 * Goal: grade the test and display the result.
 * Notes: For this program, there are 5 students (lecture has 8, but i'll go up to 5), 10 questions, students' answers are stored in a 2D array. The program compares each student's answe4rs to the key (1D array), counts the # of correct, and outputs # of correct answers 
 * I wrote the code myself rather than referring to lecture sample code. Same/correct output.
 * Other case studies in this lecture are 2. Finding the closest pair, 3. Checking Sudoku Solution, 4. 
*/

public class GradeExam {
    public static void main(String[] args){
        //hard code students' answers to the questions in 2D array
        char[][] answers = {
            {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
            {'C', 'A', 'D', 'E', 'E', 'B', 'A', 'C', 'B', 'E'},
            {'B', 'A', 'D', 'E', 'E', 'A', 'C', 'C', 'E', 'B'},
            {'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B', 'B'},
            {'A', 'D', 'E', 'C', 'B', 'B', 'C', 'D', 'E', 'A'}
        };

        //hard code answer key in 1D array
        int[] key = {'B', 'D', 'E', 'C', 'A', 'A', 'B', 'E', 'D', 'B'};


        /* Grade the test */
        //loop through 2D array, check if each student's answer (individual row) matches the key, if so, add to a counter variable, and print out result
        for (int row = 0; row < answers.length; row++){
            int correctAnswers = 0;
            for (int column = 0; column < answers[row].length; column++){
                if (answers[row][column] == key[column])
                    correctAnswers++;
            }
            System.out.println("Student " + row + "'s correct answer count is " + correctAnswers);
        }


    }
}
