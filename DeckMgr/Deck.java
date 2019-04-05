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
    public void shuffle()
    {
        Random rng = new Random();
        
        for (int i = 0; i < cards.size(); i++) {
            int random = rng.nextInt(cards.size());
            Card temp = cards.get(i);
            cards.set(i, cards.get(random));
            cards.set(random, temp);
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void stringOutShuffle()
    {
       int cardCounter = 0;
      
       for (Card C: cards){ //C just stands for card to not make it confusing
           C.stringOut();
           if (C == cards.get(12) || C == cards.get(25) || C == cards.get(38)) {
              System.out.println();
           }
           
           cardCounter++;
       }
       System.out.println();
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Card dealCard()
    {
       if(cards == null){
           System.out.println("Error, deck is empty");
           System.exit(1);
       }
       
       Card topCard = cards.get(0);
       cards.remove(0);
       return topCard;
    }
}

