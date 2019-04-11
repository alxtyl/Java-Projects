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

    /**
     * Constructor for objects of class Hand
     */
    public Hand()
    {    
    }

    /**
     * addCard adds card when called
     *
     * @param Take in object Card
     * @return void
     */
    public void addCards(Card C)
    {
        cards.add(C);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  N.A.
     * @return   void
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
