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
        
        for(int i = 0; i < HANDSIZE; i++) //for every Card in ArrayList cards
        {
        out += cards.get(i).stringOut(); //outputs string representation of card
        }
        
        System.out.println(); //spacing
        
        return (out += "]");
    }

    /**
     * Returns the specific card
     *
     * @param take in card num to be returned
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
        if(royalFlush())
            return ROYAL_FLUSH;
        else if(acesLow())
            return ACES_LOW;
        else if(straightFlush())
            return STRAIGHT_FLUSH;
        else if(fourOfAKind())
            return FOUR_OF_A_KIND;
        else if(fullHouse())
            return FULL_HOUSE;
        else if(flush())
            return FLUSH;
        else if(straight())
            return STRAIGHT;       
        else if(threeOfAKind())
            return THREE_OF_A_KIND;
        else if(twoPair())
            return TWO_PAIR;
        else if(onePair())
            return ONE_PAIR;
        return NO_PAIR;
    }
    
    /**
     * Returns true if this hand is a royal flush.
     *
     * @param void
     * @return true or false based on result of the hannd
     */
    public boolean royalFlush()
    {
        int suit = 0;

        suit = cards.get(0).getSuit();

        for(int i = 1; i < HANDSIZE; i++) {
            if(cards.get(i).getSuit() != suit) {
                return false;
            }
        }

        if(cards.get(0).getRank() == 10 && cards.get(1).getRank() == J && cards.get(2).getRank() == Q && cards.get(3).getRank() == K && cards.get(4).getRank() == A) {
            return true;    
        }            
        return false;
    }

    public boolean straightFlush()
    {
        int suit = cards.get(0).getSuit();
        
        if(new CountRank(this).straight())
        {
            for(int i = 1; i < HANDSIZE; i++)
                if(cards.get(i).getSuit() != suit)
                    return false;
            return true; 
        }
        return false;
    }

    public boolean acesLow()
    {
        if(new CountRank(this).acesLow())
            return true;
        return false; 
    }

    public boolean fourOfAKind()
    {
        if(new CountRank(this).fourOfAKind())
            return true;
        return false;
    }
    
    public boolean fullHouse()
    {
        if(new CountRank(this).fullHouse())
            return true;
        return false;
    }
    
    public boolean flush()
    {
        int suit = cards.get(0).getSuit();
        
        for(int i = 1; i < HANDSIZE; i++)
            if(cards.get(i).getSuit() != suit)
                return false;
        return true;
    }
    
    public boolean straight()
    {
        if(new CountRank(this).straight())
            return true;
        return false;        
    }

    public boolean threeOfAKind()
    {
        if(new CountRank(this).threeOfAKind())
            return true;
        return false;        
    }

    public boolean twoPair()
    {
        if(new CountRank(this).twoPair())
            return true;
        return false;        
    }

    public boolean onePair()
    {
        if(new CountRank(this).onePair())
            return true;
        return false;        
    }

    public boolean hasAce()
    {
        if(new CountRank(this).hasAce())
            return true;
        return false;        
    }
}
