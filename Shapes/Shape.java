
/**
 * Implements a shape super class
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Shape
{
    private String color;
    protected Boolean filled;

    /**
     * Constructor for objects of class Shape
     */
    public Shape(String c, Boolean f)
    {
        color = c;
        filled = f;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public abstract double area();

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  a sample parameter for a method
     * @return    the sum of x and y
     */
    public abstract double perimeter();

    public String toString()
    {
        return color;
    }

    public Boolean toBoolean() 
    {
        return filled;
    }
}
