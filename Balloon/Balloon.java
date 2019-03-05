
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
    public final double PI = 3.1415926;

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
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double inflate(double inflateBalloon)
    {
        // put your code here
        size += inflateBalloon;
        
        return size;
    }
    
    public String displayBalloonColor()
    {
        return color;
    }
    
    public double balloonVolume()
    {
        double volume;
        
        volume = (4.0/3.0) * PI * (size * size * size);
        
        return volume;
    }
}
