
/**
 * Card Class is used for creating different types and returning their names
 *
 * @author Alex Tyler
 * @version 4/11/2019
 */
public class Card
{
    // instance variables
    private final int rank;
    private final int suit;

    /**
     * Constructor for objects of class Card
     */
    public Card(int incRank, int incSuit)
    {
        // initialise instance variables
        rank = incRank;
        suit = incSuit;
        
        if (rank < 2 || rank > 14) {
            System.out.println("Error, rank number is not valid");
        }
        
        if (suit < 0 || suit > 3){
            System.out.println("Error, suit number is not valid");
        }
    }

    /**
     * Getter method for card rank
     *
     * @param cardRank  takes in the needed card that needs to be returned
     * @return    returns card rank
     */
    public int printCardRank(int cardRank)
    {
        return rank;
    }

    /**
     * Getter method for card suit
     *
     * @param cardSuit  takes in the needed card that needs to be returned
     * @return    returns card suit
     */
    public int printCardSuit(int cardSuit)
    {
        return suit;
    }

    public String toString() {
        String out = ""; 

    // put the rank into out
    // always in 2 places, for nice formatting     

    // now add single, special char for suit
    if (suit == CLUBS)
        out += '\u2663';    // Unicode char for club
    else if (suit == DIAMONDS)
        out += '\u2662';    // diamond
    else if (suit == HEARTS)
        out += '\u2661';    // heart
    else if (suit == SPADES)
        out += '\u2660';    // spade
        }
}
