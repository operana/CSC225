/*
 * [] PROGRAM BROKEN. AS IS, OUTPUT IS ' at MyStack.toString(StackExercise.java:93) '     need to fix
 * University of Illinois Springfield
 * CSC 225, Lecture 13
 * MyStack.java / Case Study 1
 * Goal: Create a custom stack class to exemplify a last in, first out process of a call stack. Only can add and remove from the top of the stack. Extending from Arraylist class
 * Notes: attempt writing/implementing myself rather than copying lecture code
*/

import java.util.ArrayList;

public class StackExercise { 
    /*Main Method */
    public static void main(String[] args){
        //initialized ArrayList (different from arrays, which are fixed in size upon creation, but Arraylist objects are mutable in size)
        MyStack callStack = new MyStack();

        //push some items to the call stack
        callStack.push("Leah");
        callStack.push("Piano");
        callStack.push("Photography");
        callStack.push("Crochet");
        callStack.push("Exploring");
        callStack.push("Golf");

        //peek at call stack
        System.out.println("Top object is " + callStack.peek());
        
        //get size of call stack
        System.out.println("The size of the call stack is " + callStack.getSize());

        //pop from call stack
        System.out.println("We just popped " + callStack.pop() + "from the stack");

        //peek from call stack again
        System.out.println("Now, the top object is " + callStack.peek());

        //get size of call stack
        System.out.println("Now, the size of the call stack is " + callStack.getSize());

        //toString to print call stack contents
        System.out.println(callStack.toString());

        //search for an item in call stack
        System.out.print("T/F - Is Leah in the list? :: " + callStack.search("Leah"));

        //check if call stack is empty
        System.out.println("T/F - Is the callstack empty? :: " + callStack.isEmpty());

        //for loop to print call stack contents in reverse order
        for (int i = callStack.getSize() - 1; i >= 0; i--){
            System.out.print(callStack.get(i) + " | ");
        }

    }

}

/*MyStack methods
* Recall an Arraylist can hold objects, so make sure our return methods return Objects
* Clarify when to or when not to use super keyword
*/
class MyStack extends java.util.ArrayList{

    //do we create here?
    ArrayList<String> cityList = new ArrayList<>();

    //Push method - add new element to the top of the stack. return the Object we added
    public Object push(Object obj){
        add(obj);
        return obj;
    }

    //Pop method - remove element from the top of the stack and return the removed element
    public Object pop(){
        Object topObj = new Object(); //create new Object ref var to hold the top object from the stack
        remove(getSize() - 1);
        return topObj;
    }
    
    //Peek method - return element at the top of the stack
    public Object peek(){
        return get(getSize() - 1);
    }

    //isEmpty method - boolean return method to tell us if the list is empty
    public boolean isEmpty(){
        return super.isEmpty();
    }

    //getSize method - int return method to tell us the size of the Arraylist
    public int getSize(){
        return super.size();
    }

    //toString method - string return method to print the contents of the Arraylist in a String
    @Override
    public String toString(){
        return "stack: " + toString();
    }

    //search method to return the index of the object we're searching for
    public int search(Object obj){
        return indexOf(obj);
    }



}