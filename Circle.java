//Nov 19, 2023
//From Lecture 11, Video 3
//Demonstrating classes and objects, with a focus on static vs instance variables/data fields and methods
//Goal: Create two circle objects and output the number of objects and each circle's area. Have a default constructure and an argument constructor
//watched video for insight, but wrote code without referencing video

public class Circle {
    double radius; //instance variable - each object will have its own

    static int numberOfObjects = 0; //static variable - shared by each object in the class (and since no visibility modifier (aka public/private), by default, will be accessible to all methods in the class)

    //getter aka accessor method
    double getArea() { //instance method (double return method) - each object will have its own
        //area of a circle is Pi*r^2
        return radius * radius * Math.PI;
    }

    Circle() { //default constructor, no arg. When new object is created, constructor will run and set radius to 1 and add 1 to number of objects.
        radius = 1.0;
        numberOfObjects++;
    }

    Circle(double newRadius){ //constructor with radius parameter. When new object is created, constructor will run and set radius to whatever argument is passed and add 1 to number of objects.
        radius = newRadius;
        numberOfObjects++;
    }
    


    /* MAIN METHOD */
    //to test Circle class and making circle objects
    public static void main(String[] args){

        //Print current number of objects before creating objects
        System.out.println("Number of objects: " + Circle.numberOfObjects); //since numberOfObjects is a static variable, we access it by using class name (as opposed to object reference variable)


        //Create first object
        System.out.println("\nCreating an object... ");
        Circle c1 = new Circle(); //no-arg, radius will be 1
        System.out.println("Number of objects: " + Circle.numberOfObjects);
        System.out.println("The area of Circle c1 is: " + c1.getArea());


        //Create second object
        System.out.println("\nCreating another object... ");
        Circle c2 = new Circle(3.8); //3.8 argument, radius will be 3.8
        System.out.println("Number of objects: " + Circle.numberOfObjects);
        System.out.println("The area of Circle c1 is: " + c2.getArea());


    }






}
