
/**
 * Write a description of class Stock here.
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
      double temp = stockPrice;
      byPercent *= .01;
      temp *= byPercent;
      stockPrice += temp;
    }
}
