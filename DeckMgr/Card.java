
/**
 * Card Class is used for creating different types and returning their names
 *
 * @author Alex Tyler
 * @version 4/11/19
 */
public class Card
{
    // constants
    private final int rank;
    private final int suit;

    /**
     * Constructor for objects of class Card
     */
    public Card(int r, int s) //r stands rank, s stands for suit
    {
        if (r < 1 || 15 < r) {
            System.out.println("Invalid Rank\n");
            System.exit(1);
        }

        if (s < 0 || 3 < r) {
            System.out.println("Invalid Suit\n");
            System.exit(2);
        }
        
        //setting up instance variables
        rank = r;
        suit = s;
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

        if (suit == 0) {
         out += '\u2663';
        }
        else if (suit == 1) {
         out += '\u2662';    
        }
        
        else if (suit == 2) {
         out += '\u2661'; 
        }
           // heart
        else if (suit == 3){
         out += '\u2660';    
        }

        return out;
    
    }
}
