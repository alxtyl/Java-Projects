import java.util.*;
/**
 * Write a description of class Deck here.
 *
 * @author Alex Tyler
 * @version 4/11/19
 */
public class Deck
{
    // instance variables - replace the example below with your own
    private ArrayList<Card> cards = new ArrayList<Card>();

    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
       for (int i = 2; i < 15; i++) {
           for (int j = 0; j < 4; j++) {
               cards.add(new Card(i, j));
            }
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int shuffle()
    {
        // put your code here
        return 0;
    }
}
