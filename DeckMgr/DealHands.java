import java.util.Scanner;
import java.util.*;
/**
 * Write a description of class Tester here.
 *
 * @author Alex Tyler
 * @version 4/11/19
 */
public class DealHands
{    
    static private ArrayList<Hand> hands;
    
    /**
     * main() method
     */
    public static void main(String[] args) 
    {
        //creating scanner object
        Scanner sc = new Scanner(System.in);
        
        Deck deck1 = new Deck();
        
        System.out.println("A brand new, fresh deck");
        deck1.printDeck();
        
        System.out.println("Shuffled");
        deck1.shuffle();
        
        deck1.printDeck();
        
        //prompting the user how many players will be playing
        System.out.println("How many players?");
        int numPlayers = sc.nextInt(); // Read user input
        
        //creating new hand array
        hands = new ArrayList<Hand>();
        
        //creating a new hand object for each player
        for (int i = 0; i < numPlayers; i++) {
            hands.add(new Hand());
        }
        
        for(int i = 0; i < 5; i++) {
            for (Hand h : hands) {
                Card c = deck1.dealCard();
                h.addCards(c);
            }
        }
        
        for (Hand h : hands) {
            h.printHand();
        }
                
        System.out.println("\nWhat remains");
        deck1.printDeck();
    }
}
