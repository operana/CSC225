/*
 * University of Illinois Springfield
 * CSC 225, Module 10, Lecture 9
 * Case Study 3: Count Letters in Array, mostly referring to code in lecture because it's a lot and uses methods/classes
 * Goal: Randomly generate 100 lowercase letters and assign to an array of characters. Count the occurrence of each letter in the array
 * Notes: Need two arrays: one of the letters, one of the counts
*/

import java.util.Random;

public class CountLettersInArray{
    //Main Method
    public static void main(String[] args){
        //declare and create array of random characters using Method A
        char[] randomChars = createCharArray();

        //display the array using Method B
        System.out.println("The lowercase letters are:");
        displayCharArray(randomChars);

        //count the occurrences of each letter using Method C
        int[] counts = countOccurrences(randomChars);

        //display the counts of each char using Method D
        System.out.println("The counts of each character are:");
        displayCharCounts(counts);

    }

    //Method A) char array return method: creates an array of random lowercase characters and assigns them to an array, no parameters
    public static char[] createCharArray(){
        //declare and create array
        char[] randomChars = new char[100];
        //randomly assign lowercase chars to array
        for (int i = 0; i < randomChars.length ; i++){
            //case study in lecture code uses the line below, but I do not have that class, maybe it's a separate class the programmer has in their folder
            //randomChars[i] = RandomCharacter.getRandomLowerCaseLetter(); //see Random Character class for insight into its getRandomLowerCaseLetter method
            //instead this will generate random character from 'a' - 'z' -- source: https://programming.guide/java/generate-random-character.html
            Random rnd = new Random();
            char c = (char) ('a' + rnd.nextInt(26));
            randomChars[i] = c;
        }

        //return char array
        return randomChars;
    }

    //[Method B) void method: displays the array of characters
    public static void displayCharArray(char[] randomChars){
        //display all characters in the array, formatted to 20 on each line
        //loop through entire array that we're passing in as reference value
        for (int i = 0; i < randomChars.length ; i++){
            if ((i+1) % 20 == 0) //if we've hit 10 chars printed, print with a new line
                System.out.println(randomChars[i]);
            else //otherwise, just print the char and a space after
                System.out.print(randomChars[i] + " ");
            
        }
    }

    //[Method C) int array return method: counts the occurrences of each letter, pass in array reference value of the char array
    public static int[] countOccurrences(char[] randomChars){
        //create array of size 26, which is mapped to letters a-z
        int[] counts = new int[26];
        //loop through our random character array randomChars and for each lowercase letter that comes up, count up at the corresponding index of the counts array
        for(int i = 0 ; i < randomChars.length; i++){
            int countsIndex = randomChars[i] - 'a';
            counts[countsIndex]++;
            /*
             * EXPLANATION
             * lecture combines the above 2 lines into one line:
             * counts[randomChars[i] - 'a']++;
             * What's happening here: from the char at index in in the randomChars array, subtract the value of lowercase char 'a' to give us the correct counts index. And add 1 (in this iteration) the the value at that index of the counts array.
             * Example if randomChars array starts as: ['l' , 'a' , 'y' ....so on] and we are at beginning of array, aka i = 0 :
             * randomChars[i aka 0] is l. l in decimal is 108, a is 97. when we subtract char 'l' - char 'a', we get 11 (108-97=11).
             * 'l' - 'a' = 11, which is corresponding decimal int value for counts index. How? l is the 12th letter of the alphabet. When we index at 0, counts[11] would represent letter l
             * Finally, counts[11]++ is adding 1 to our count array at index position 11, which again is representative of letter l
             */
        }
        //return counts array
        return counts;
    }

    //[Method D) displays the counts of each character letter, int array reference value passed in as parameter
    public static void displayCharCounts(int[] counts){
        //loop through counts array to display counts of each character, with 10 per line
        for (int i = 0; i < counts.length; i++){
            //display 10 per line. if we're at 10, print count with a new line
            if((i+1) % 10 == 0)
                System.out.println(counts[i] + " " + (char)(i + 'a')); //i + 'a' is our ascii conversion from whatever iteration we are on + char 'a' or int decimal value of 97. then char typecasting so we are printing char representation, not int decimal value
            else //if not at 10, just print it out with a space after
                System.out.print(counts[i] + " " + (char)(i + 'a') + " ");
        }
    }






}