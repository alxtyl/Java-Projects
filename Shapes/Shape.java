
/**
 * Implements a shape super class
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shape
{
    private double s;
  
    /**
     * Constructor for objects of class Shape
     */
    public Shape(double side)
    {
        s = side;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean shapeFilled(boolean filled)
    {
        if (filled == true) {
            return true;
        }
        
        else {
            return false;
        }
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double area()
    {
        
        return 0.0;
    }
}
