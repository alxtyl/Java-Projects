
/**
 * Write a description of class Balloon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Balloon
{
    // instance variables - replace the example below with your own
    private String color;
    private double size;
    public static final double PI = 3.1415926;

    /**
     * Constructor for objects of class Balloon
     */
    public Balloon(String userBalloonC, double userBalloonS)
    {
        // initialise instance variables
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
        // put your code here
        size += inflateBalloon;
        
        return size;
    }
    
    /**
     * getter method for the color of the ballon
     *
     * @return  returns the color of the ballon
     */
    public String displayBalloonColor()
    {
        return color;
    }
    
    /**
     * calculates the volume of the ballon
     *
     * @return  returns the volume of the ballon
     */
    public double balloonVolume()
    {
        double volume = 0;
        
        volume = (4.0/3.0) * PI * (size * size * size);
        
        return volume;
    }
}
