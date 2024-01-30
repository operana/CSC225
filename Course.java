/*
 * University of Illinois Springfield
 * CSC 225, Lecture 12/Chapter 10: Object Oriented Thinking
 * Case Study 1: Designing the Course Class
 * Course.java & TestCourseClass.java (Class abstraction & encapsulation)
 * Goal: Process course information to add/drop a student to/from a course
 * Notes: each course has a name and students enrolled
 UML diagrams given for Course. Will attempt to write program off of UML diagram rather than previewing lecture code.
 Leaving in-line comments to match the UML diagram
*/

public class Course {
    private String courseName; //name of the course
    private String[] students = new String[4]; //an array to store the students for the course
    private int numberOfStudents; //the number of students (default: 0)

    //Constructor - creates a course with the specified name
    public Course(String courseName){
        this.courseName = courseName;
    }

    //returns the course name
    public String getCourseName(){
        return courseName;
    }

    //adds a new student to the course
    public void addStudent(String student){
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    //drops a student from the course
    public void dropStudent(String student){
        for(int i = 0; i < students.length; i++){
            if(students[i] == student){
                students[i] = ""; //is there a better way to do this?
            }
        }
        numberOfStudents--;
    }

    //returns the students for the course
    public String[] getStudents(){
        return students;
    }

    //returns the number of students for the course
    public int getNumberOfStudents(){
        return numberOfStudents;
    }


}
