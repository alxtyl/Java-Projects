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
    private ArrayList<Card> Hand;

    /**
     * Constructor for objects of class Hand
     */
    public Hand(Card first, Card second, Card third, Card fourth, Card fifth)
    {   
        
       Hand.add(first);
       Hand.add(second);
       Hand.add(third);
       Hand.add(fourth);
       Hand.add(fifth);
    }

    /**
     * addCard adds card when called
     *
     * @param Take in object Card
     * @return void
     */
    public Card getCard(int i)
    {
        return Hand.get(i);
    }
    
    /**
     * addCard adds card when called
     *
     * @param Take in object Card
     * @return void
     */
    public int category()
    {
        int categoryNum = 0;

        return categoryNum;
    }

    /**
     * addCard adds card when called
     *
     * @param Take in object Card
     * @return void
     */
    private boolean hasAce()
    {
       
        return true;
    }
}
