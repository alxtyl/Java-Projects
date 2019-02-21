
/**
 * Changes prices of stocks based info that is feed through constructor
 *
 * @Alex Tyler (your name)
 * @2/21/19
 */
public class Stock
{
    // instance variables - replace the example below with your own
    private double stockPrice; 
    private String stockSymb;
    
    /**
     * Constructor for objects of class Stock
     */
    public Stock(String symb, double currentPrice)
    {
        // initialise instance variables
        stockPrice = currentPrice;
        stockSymb = symb;
    }

    public String getSymbol()
    {
       return stockSymb; 
    }
    
    public double getPrice()
    {
        return stockPrice;
    }
    
    public void changePrice(double byPercent)
    {
      //creating a new var to keep track of the stock percent increase/decrease
      double stockPercent = stockPrice;
      
      //performing calculations
      byPercent *= .01; 
      stockPercent *= byPercent;
      stockPrice += stockPercent;
    }
}
