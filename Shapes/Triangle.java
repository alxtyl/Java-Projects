
/**
 * Write a description of class Triangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Triangle extends Shape
{
    // instance variables
    private double side1, side2, side3;
    

    /**
     * Constructor for objects of class Triangle
     */
    public Triangle(double side, double side, double side)
    {
        // initialise instance variables
        super(side1);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double trianglePerimeter()
    {
        return side1 + side2 + side3;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double area()
    {
        return (side2 / 2.0) * side1;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String toString(String name)
    {
        return name;
    }
}
