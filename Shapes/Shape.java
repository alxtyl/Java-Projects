
/**
 * Implements the shape super class
 *
 * @author Alex Tyler
 * @version 05/09/19
 */
public abstract class Shape
{
    //instance variables
    private String color;
    private Boolean filled;

    /**
     * Constructor for objects of class Shape
     */
    public Shape(String c, Boolean f)
    {
        //initialise instance variables
        this.color = c;
        this.filled = f;
    }
    
    /**
     * Declaring the area method for use by the sub-classes
     *
     * @param  none
     * @return    return area of shape
     */
    public abstract double area();

    /**
     * Declaring the perimeter method for use by the sub-classes
     *
     * @param  none
     * @return    return perimeter of shape
     */
    public abstract double perimeter();

    /**
     * Declaring the getSides method for use by the sub-classes
     *
     * @param  none
     * @return    formated string
     */
    public abstract String getSides();

    /**
     * toString() returns the color of the shape
     *
     * @param  none
     * @return    return color of shape
     */
    public String toString()
    {
        return color;
    }

    /**
     * toBoolean() returns the color of the shape
     *
     * @param  none
     * @return    true/false
     */
    public Boolean toBoolean() 
    {
        return filled;
    }
}
