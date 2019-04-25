
/**
 * Determines what count of the hand is
 *
 * @author Alex Tyler
 * @version 4/25/19
 */
public class CountRank
{
    // instance variables
    private int rankCount[];
    
    //constants
    public static final int HANDSIZE = 5;
    public static final int MAXRANK = 15;
    
    /**
     * Constructor for objects of class CountRank
     */
    public CountRank(Hand h) 
    {
        rankCount = new int[MAXRANK];
        
        for(int i = 0; i < HANDSIZE; i++) {
            rankCount[h.getCard(i).getRank()]++;
        }
    }

    /**
     * acesLow() method returns true if there are all cards are in order and the first is an ace
     *
     * @param  none
     * @return true/false  
     */
    public boolean acesLow()
    {
        if(rankCount[14] == 1 && rankCount[2] == 1 && rankCount[3] == 1 && rankCount[4] == 1 && rankCount[5] == 1)
                return true;
        return false;
    } 

    /**
     * fourOfAKind() method returns true if there are exactly four of any card rank in the hand
     *
     * @param  none
     * @return true/false  
     */
    public boolean fourOfAKind()
    {
        for(int i: rankCount)
        { 
            if(i == 4) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * fullHouse() method returns true if there are two of one card and three of any other card in the hand
     *
     * @param  none
     * @return true/false  
     */
    public boolean fullHouse()
    {
        for(int i: rankCount)
        { 
            for(int j: rankCount)
            { 
                if(i == 2 && j == 3) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * straight() method returns true if there are all cards are in order
     *
     * @param  none
     * @return true/false  
     */
    public boolean straight()
    {
        for(int i = 2; i < 11; i++)
        { 
            if(rankCount[i] == 1 && rankCount[i+1] == 1 && rankCount[i+2] == 1 && rankCount[i+3] == 1 && rankCount[i+4] == 1)
                return true;
        }
        return false;
    }

    /**
     * threeOfAKind() method returns true if there are exactly three of any card rank in the hand
     *
     * @param  none
     * @return true/false  
     */
    public boolean threeOfAKind()
    {
        for(int i: rankCount)
        { 
            if(i == 3)
                return true;
        }
        return false;
    }

    /**
     * twoPair() method returns true if there are two pairs of cards in the hand
     *
     * @param  none
     * @return true/false  
     */
    public boolean twoPair()
    {
        int pairs = 0;
        
        for(int i = 2; i < 15; i++)
        { 
            if(rankCount[i] == 2)
                pairs++;
        }
        if(pairs == 2)
            return true;
        return false;
    }

    /**
     * onePair() method returns true if there is one pair of cards in the hand
     *
     * @param  none
     * @return true/false  
     */
    public boolean onePair()
    {
        int pairs = 0;
        
        for(int i = 2; i < 15; i++)
            if(rankCount[i] == 2)
                    pairs++;
        if(pairs == 1)
            return true;
        return false;
    }

    /**
     * hasAce() method returns true if there is an ace in the hand
     *
     * @param  none
     * @return true/false  
     */
    public boolean hasAce()
    {
        if(rankCount[14] == 2)
            return true;
        return false;
    }
}
