/*
 * University of Illinois Springfield
 * CSC 225, Lecture 12/Chapter 10: Object Oriented Thinking
 * Case Study 1: Designing the Course Class
 * Course.java & TestCourseClass.java (Class abstraction & encapsulation)
 * Goal: Process course information to add/drop a student to/from a course
 * Notes: each course has a name and students enrolled
 UML diagrams given for Course. Will attempt to write program off of UML diagram rather than previewing lecture code.
*/

public class TestCourseClass {
    /*Main Method to test Course.java */
    public static void main(String[] args){
        //create two separate Course objects, pass in String courseName argument
        Course c1 = new Course("Computer Science II");
        Course c2 = new Course("Discrete Mathematics I");

        //Try to add students to the class
        c1.addStudent("Leah Marie");
        c1.addStudent("Winston Ope");
        c1.addStudent("Dakota Ope");

        c2.addStudent("Leah Marie");
        c2.addStudent("Lay Alena");

        //Display number of students in Course 1
        System.out.println("Number of Students in Course 1, " + c1.getCourseName() + ": " + c1.getNumberOfStudents());
        //Create array of the students
        String[] students1 = c1.getStudents();
        //Print out all the students in Course 1 (loop through array)
        for(int i = 0; i < c1.getNumberOfStudents(); i++){
            System.out.print(students1[i] + ", ");
        }


        //Display number of students in Course 2
        System.out.println("\nNumber of Students in Course 2, " + c2.getCourseName() + ": " + c2.getNumberOfStudents());
        //Create array of the students
        String[] students2 = c2.getStudents();
        //Print out all the students in Course 2 (loop through array)
        for(int i = 0; i < c2.getNumberOfStudents(); i++){
            System.out.print(students2[i] + ", ");
        }


    }
}
