/**
 * This class is used for perfoming travel calcualtions with the tester class
 *
 * @Alex Tyler
 * @02/28/2019
 */
public class TravelWallet
{
    // instance variables - replace the example below with your own
    private double dollars;
    private double localCurr; //curr means currency
    private double exchangeRate;
    
    /**
     * Constructor for objects of class TravelWallet
     */
    public TravelWallet(double dollarToForeign)
    {
        // initialise instance variables
        exchangeRate = dollarToForeign;
        dollars = 100.0;
        localCurr = 10000.0;
    }

    /**
     * This method is for calculating the money left in local currency after the user
     * spends money in the local currency
     *
     * @moneySpent taking in money being spent
     * @return     new local currency value in the wallet
     */
    public double spendLocal(double moneySpent)
    {
        localCurr -= moneySpent;
        return localCurr;
    }
    
    /**
     * This method is for calculating amount of money that needs to exchanged from dollars to the local
     * currency
     *
     * @moneySpent taking in money being spent
     * @return     new local currency value in the wallet
     */
    public double exchangeDollarsToLocal(double moneyBeingExchanged)
    {
        dollars -= moneyBeingExchanged;
        moneyBeingExchanged *= exchangeRate;
        localCurr += moneyBeingExchanged;
        return moneyBeingExchanged;
    }
    
    /**
     * This method is for calculating the total amount of money left in the wallet in dollars
     *
     * 
     * @return     final amount of dollars in the wallet
     */
    public double totalAmountInDollars()
    {
        double localCurrInDollars = 0.0;
        double dollarsFinal = 0.0;
        
        localCurrInDollars = localCurr / exchangeRate;
        dollarsFinal = localCurrInDollars + dollars;
        
        return dollarsFinal;
    }
}

