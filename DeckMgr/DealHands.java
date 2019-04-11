import java.util.Scanner;
import java.util.*;
/**
 * Dealhands runs all of the other classes and sets up the game for the player(s)
 *
 * @author Alex Tyler
 * @version 4/11/19
 */
public class DealHands
{    
    static private ArrayList<Hand> hands;
    public static final int HANDSIZE = 5;
    public static final int LARGENUM = 1000;
    
    /**
     * main() method
     */
    public static void main(String[] args) 
    {
        //creating scanner object
        Scanner sc = new Scanner(System.in);
        
        //creating new deck object
        Deck deck1 = new Deck();
        
        System.out.println("A brand new, fresh deck");
        deck1.printDeck(); //displaying deck
        
        System.out.println("Shuffled");
        deck1.shuffle(); //shuffling the deck
        
        deck1.printDeck(); //displaying deck after it's been shuffled
        
        //prompting the user how many players will be playing
        System.out.println("How many players?");
        int numPlayers = sc.nextInt(); // Read user input
        
        //printing out a blank line for formatting
        System.out.println();
        
        //creating new hand array
        hands = new ArrayList<Hand>();
        
        //creating a new hand object for each player
        for (int i = 0; i < numPlayers; i++) {
            hands.add(new Hand());
        }
        
        //add cards to based on the numbers of cards in a hand for each player
        for(int i = 0; i < HANDSIZE; i++) {
            for (Hand h : hands) {
                Card c = deck1.dealCard();
                h.addCards(c);
            }
        }
        
        //for each hands in the hand object, use the printHand method
        for (Hand h : hands) {
            h.printHand();
        }
                
        System.out.println("\nWhat remains");
        deck1.printDeck(); //showing the deck after dealing
        
        System.out.println("\nTest error handling:");
        
        Card ErrorCard = new Card(-20,5); //-20 and 5 are both out of range for suit and rank
        
        //using try and catch to test drawing to many cards out of the deck
        try {
           for(int i = 0; i < LARGENUM; i++) {
             deck1.dealCard();
        }
        } catch(Exception err) {
            System.out.println("deck is empty");
        }
    }
}