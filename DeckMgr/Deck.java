import java.util.*;
/**
 * Generates new cards, shuffles and prints out the deck
 *
 * @author Alex Tyler
 * @version 4/11/19
 */
public class Deck
{
    // instance variable
    private ArrayList<Card> cards = new ArrayList<Card>();
    
    //constants
    public static final int MINSUIT = 2;
    public static final int MAXSUIT = 15;
    public static final int MINRANK = 0;
    public static final int MAXRANK = 4;
    
    /**
     * Constructor for objects of class Deck
     */
    public Deck()
    {
       for (int i = MINSUIT; i < MAXSUIT; i++) {
           for (int j = MINRANK; j < MAXRANK; j++) {
               cards.add(new Card(i, j));
           }
       }
    }

    /**
     * Shuffles the deck into a random order using random ints
     *
     * @param  N.A.
     * @return  void
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
     * Prints out the deck
     *
     * @param  N.A.
     * @return    void
     */
    public void printDeck()
    {
       int cardCounter = 0;
      
       for (Card C: cards){ //C just stands for card to not make it confusing
           C.stringOut();
           
           //breaks the deck every 13 lines for readability
           if (cardCounter == 12 || cardCounter == 25 || cardCounter == 38) {
              System.out.println();
           }
           
           cardCounter++;
       }
       System.out.println();
    }
    
    /**
     * Deals a card and removes it from the array after
     *
     * @param  N.A.
     * @return      Card object
     */
    public Card dealCard()
    {
       Card topCard = cards.get(0);
       cards.remove(0);
       
       if(cards == null){ //making sure the deck can't deal any cards when it's empty
           System.out.println("deck is empty");
           System.exit(1);
       }
       
       return topCard;
    }
}

