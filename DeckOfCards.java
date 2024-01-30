/*
 * University of Illinois Springfield
 * CSC 225, Module 10, Lecture 9
 * Case Study 2: Deck of Cards
 * Goal: Write a program that picks four cards randomly ("off the top) from deck of 52 cards after the deck is randomly shuffled. All the cards can be represented using an array named deck, filled with initial values of 0 to 51.
 * Notes: 
 * Card number (aka rank) is determined by cardNumber % 13, where 0 is ace, 1 is 1 ... 11 is jack, 12 is queen, 13 is king
 * Card suit is determined by cardNumber / 13 (remember, will truncate because we're working with ints), where index 0 is Spades, 1st index is Hearts, 2nd index is Diamonds, and 3rd index is Clubs - cards 0-12 are spades, 13-25 are hearts, 26-38 are diamonds, 39-51 are clubs
 * trying before previewing 
*/

public class DeckOfCards {
    public static void main(String[] args){
        //declare and create arrays: to hold deck of 52 cards, ranks, & of suits
        int[] deck = new int[52];
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"}; //index 0-12, total length is 13
        String[] suits = {"Spades" , "Hearts" , "Diamonds" , "Clubs"}; //index 0-3

        //initialize values in deck from 0-51
        for(int cardNumber = 0; cardNumber < deck.length ; cardNumber++){
            deck[cardNumber] = cardNumber;
        }

        //randomly shuffle array of cards
        for (int index = 0; index < deck.length ; index++){
            int newIndex = (int)(Math.random() * 52); //will grant random number from 0 and up to but not including 52. convert to int
            int temp = deck[index];
            deck[index] = deck[newIndex];
            deck[newIndex] = temp;
        }

        //display first 4 cards
        for (int i = 0 ; i < 4; i++){
            String rank = ranks[deck[i] % 13];
            String suit = suits[deck[i] / 13];
            System.out.println("Card " + deck[i] + " is " + rank + " of " + suit);

            
            /* Within this for loop, the above is code from lecture case study. This is my code before previewing (it works). :
            int rankIndex = deck[i] % 13;
            int suitIndex = deck[i] / 13;
            System.out.println("Card " + (i+1) + " is " + ranks[rankIndex] + " of " + suits[suitIndex]); */
        }



    }
    
}
