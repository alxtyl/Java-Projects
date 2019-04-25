import java.util.*;
/**
 * This class is used for adding cards and displaying the hands
 *
 * @author Alex Tyler
 * @version 4/11/19
 */
public class Hand
{
    // instance variable
    private ArrayList<Card> cards = new ArrayList<Card>();

    // constants for rank and suit
    public static final int J = 11;
    public static final int Q = 12;
    public static final int K = 13;
    public static final int A = 14;

    //max handsize constant
    public static final int HANDSIZE = 5;
    
    //constants for different hand sets
    public static final int NO_PAIR = 0;
    public static final int ROYAL_FLUSH = 1;
    public static final int STRAIGHT_FLUSH = 2;    
    public static final int FOUR_OF_A_KIND = 3;    
    public static final int FULL_HOUSE = 4;
    public static final int FLUSH = 5;
    public static final int STRAIGHT = 6;
    public static final int THREE_OF_A_KIND = 7;
    public static final int TWO_PAIR = 8;
    public static final int ONE_PAIR = 9;
    public static final int ACES_LOW = 10;
    
    /**
     * Constructor for objects of class Hand
     */
    public Hand(Card first, Card second, Card third, Card fourth, Card fifth)
    {   
       cards.add(first);
       cards.add(second);
       cards.add(third);
       cards.add(fourth);
       cards.add(fifth);
    }

    /**
     * stringOut() method - outputs the values of the Card objects in the cards[] ArrayList
     *
     * @param  none
     * @return string
     */
    public String stringOut()
    {
        String out = "["; // initialize an empty string
        
        for(int i = 0; i < HANDSIZE; i++) { //for every Card in ArrayList cards 
            out += cards.get(i).stringOut(); //outputs string representation of card
        }
        
        System.out.println(); //spacing
        
        return (out += "]");
    }

    /**
     * Returns the specific card
     *
     * @param card num to be returned
     * @return returns specified card object
     */
    public Card getCard(int i)
    {
        return cards.get(i);
    }
  
    /**
     * Returns the category of a hand.
     *
     * @param void
     * @return the int value of the type of hand
     */
    public int category()
    {
        if(royalFlush()) {
            return ROYAL_FLUSH;
        }
        else if(acesLow()) {
            return ACES_LOW;
        }
        else if(straightFlush()) {
            return STRAIGHT_FLUSH;
        }
        else if(fourOfAKind()) {
            return FOUR_OF_A_KIND;
        }
        else if(fullHouse()) {
            return FULL_HOUSE;
        }
        else if(flush()) {
            return FLUSH;
        }
        else if(straight()) {
            return STRAIGHT;    
        }   
        else if(threeOfAKind()) {
            return THREE_OF_A_KIND;
        }
        else if(twoPair()) {
            return TWO_PAIR;
        }
        else if(onePair()) {
            return ONE_PAIR;
        }
        return NO_PAIR;
    }
    
    /**
     * royalFlush() method returns true if the hand is a royal flush.
     *
     * @param void
     * @return true/false
     */
    public boolean royalFlush()
    {
        int suit = cards.get(0).getSuit(); 
            for(Card c: this.cards) {
                if(!(new CountRank(this).straight()) || c.getRank() < 10 || c.getSuit() != suit) {
                    return false;
                }
            }  
        return true;
    }

    /**
     * straightFlush() method returns true if the hand is a straight flush.
     *
     * @param void
     * @return true/false
     */
    public boolean straightFlush()
    {
        int suit = cards.get(0).getSuit();
        
        if(new CountRank(this).straight())
        {
            for(int i = 1; i < HANDSIZE; i++) {
                if(cards.get(i).getSuit() != suit) {
                    return false;
                }
            }
            return true; 
        }
        return false;
    }

    /**
     * acesLow() returns true if the hand has a low ace.
     *
     * @param void
     * @return true/false
     */
    public boolean acesLow()
    {
        if(new CountRank(this).acesLow()) {
            return true;
        }
        return false; 
    }

    /**
     * fourOfAKind() returns true if the hand is has four of a kind.
     *
     * @param void
     * @return true/false
     */
    public boolean fourOfAKind()
    {
        if(new CountRank(this).fourOfAKind()) {
            return true;
        }
        return false;
    }
    
    /**
     * fullHouse() returns true if the hand is a full house.
     *
     * @param void
     * @return true/false
     */
    public boolean fullHouse()
    {
        if(new CountRank(this).fullHouse()) {
            return true;
        }
        return false;
    }
    
    /**
     * flush() returns true if the hand is a flush.
     *
     * @param void
     * @return true/false
     */
    public boolean flush()
    {
        int suit = cards.get(0).getSuit();
        
        for(int i = 1; i < HANDSIZE; i++) {
            if(cards.get(i).getSuit() != suit) {
                return false;
            }
        }   
        return true;
    }
    
    /**
     * straight() returns true if the hand is a straight.
     *
     * @param void
     * @return true/false
     */
    public boolean straight()
    {
        if(new CountRank(this).straight()) {
            return true;
        }
        return false;        
    }

    /**
     * threeOfAKind() returns true if the hand is a three of a kind.
     *
     * @param void
     * @return true/false
     */
    public boolean threeOfAKind()
    {
        if(new CountRank(this).threeOfAKind()) {
            return true;
        }
        return false;        
    }

    /**
     * twoPair() returns true if the hand has two pair.
     *
     * @param void
     * @return true/false
     */
    public boolean twoPair()
    {
        if(new CountRank(this).twoPair()) {
            return true;
        }
        return false;        
    }

    /**
     * onePair() returns true if the hand has one pair.
     *
     * @param void
     * @return true/false
     */
    public boolean onePair()
    {
        if(new CountRank(this).onePair()) {
            return true;
        }
        return false;        
    }

    /**
     * hasAce() returns true if the hand has one ace.
     *
     * @param void
     * @return true/false
     */
    public boolean hasAce()
    {
        if(new CountRank(this).hasAce()) {
            return true;
        }
        return false;        
    }
}
