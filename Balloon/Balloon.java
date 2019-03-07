
/**
 * Takes info from the tester class and performs calculations
 *
 * @Alex Tyler
 * @3/7/2019
 */
public class Balloon
{
    //initializing instance variables & constant
    private String color;
    private double size;
    public static final double PI = 3.1415926;

    /**
     * Constructor for objects of class Balloon
     */
    public Balloon(String userBalloonC, double userBalloonS)
    {
        color = userBalloonC;
        size = userBalloonS;
    }

    /**
     * takes in a size that a ballon will be inflated by and then returns the new size of the ballon
     *
     * @param   takes in the amount that the ballon is being infalted by
     * @return  returns the new size of the ballon
     */
    public double inflate(double inflateBalloon)
    {
        size += inflateBalloon;
        
        return size;
    }
    
    /**
     * getter method for the color of the ballon
     *
     * @return color of the ballon
     */
    public String displayBalloonColor()
    {
        return color;
    }
    
    /**
     * calculates the volume of the ballon
     *
     * @return volume of the ballon
     */
    public double balloonVolume()
    {
        double volume = 0.0;
        
        volume = (4.0/3.0) * PI * (size * size * size);
        
        return volume;
    }
}
