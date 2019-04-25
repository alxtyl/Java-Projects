 /**
 * Card Class is used for creating different types and returning their names
 *
 * @author Alex Tyler
 * @version 4/25/19
 */
public class Card
{
    //instance variables
    private int rank;
    private int suit;
    
    //constants
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;
    public static final int ACE = 14;
    public static final int CLUBS = 0;
    public static final int DIAMOND = 1;
    public static final int HEART = 2;
    public static final int SPADE = 3;

    /**
     * Constructor for objects of class Card
     */
    public Card(int r, int s) //r stands rank, s stands for suit
    {
        //making sure the card rank is valid
        if (r < 2 || ACE < r) {
            System.out.println("Invalid Rank: " + r);
            //System.exit(1); commented out for error testing
        }
        
        //making sure the card rank is valid
        if (s < CLUBS || SPADE < s) {
            System.out.println("Invalid Suit: " + s);
            //System.exit(2); commented out for error testing
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
    public int getRank()
    {
        return rank;
    }

    /**
     * Getter method for card suit
     *
     * @param cardSuit  takes in the needed card that needs to be returned
     * @return    returns card suit
     */
    public int getSuit()
    {
        return suit;
    }
    
    /**
     * Sends the card rank and suit out to the screen
     *
     * @param N.A.
     * @return    void
     */
    public String stringOut() {
        String out = "";
        
        if (rank <= 10){
            out = " " + Integer.toString(rank);
        }
        
        else if (rank == 10){
            out = Integer.toString(rank);
        }
        else if (rank == JACK) {
            out += " J";
        }
        else if (rank == QUEEN) {
            out += " Q";
        }
        else if (rank == KING) {
            out += " K";
        }
        else if (rank == ACE) {
            out += " A";
        }
        
        if (suit == CLUBS) {
          out += '\u2663'; // Unicode char for club
        }
        
        else if (suit == DIAMOND) {
          out += '\u2662';  // diamond 
        }
        
        else if (suit == HEART) {
         out += '\u2661'; // heart
        }
        
        else if (suit == SPADE){
         out += '\u2660'; // spade
        }
        
        return out;
    }
}
