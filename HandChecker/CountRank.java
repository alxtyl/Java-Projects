
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
    public static final int MAXHANDSIZE = 5;
    public static final int MAXRANK = 15;
    
    /**
     * Constructor for objects of class CountRank
     */
    public CountRank(Hand h) 
    {
        rankCount = new int[MAXRANK];
        
        for(int i = 0; i < MAXHANDSIZE; i++) {
            rankCount[h.getCard(i).getCardRank()]++;
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean fourOfAKind()
    {
        
        for (int i: rankCount) {
            if (i == 4) {
                return true;
            }
        }
        
        return false;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean straight(int min, int max)
    {
        // put your code here
        
        return true;
    }
}
