
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
    public Triangle(double s1, double s2, double s3, String triColor, boolean triFilled)
    {
        // initialise instance variables
        super(triColor, triFilled);


        this.side1 = s1;
        this.side2 = s2;
        this.side3 = s3;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double perimeter()
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
    
}
