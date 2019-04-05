import java.util.*;
/**
 * Write a description of class Hand here.
 *
 * @author Alex Tyler
 * @version (a version number or a date)
 */
public class Hand
{
    // instance variable
    private ArrayList<Card> cards = new ArrayList<Card>();

    /**
     * Constructor for objects of class Hand
     */
    public Hand()
    {
        
    }

    /**
     * addCard Method
     *
     * @param  y  a sample parameter for a method
     * @return void
     */
    public void addCards(Card C)
    {
        cards.add(C);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printHand()
    {
       int cardCounter = 0;
      
       for (Card C: cards){ //C just stands for card to not make it confusing
           C.stringOut();
           
           if (cardCounter == 12 || cardCounter == 25 || cardCounter == 38) {
              System.out.println();
           }
           
           cardCounter++;
       }
       System.out.println();
    }
}
