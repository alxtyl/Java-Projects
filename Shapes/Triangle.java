
/**
 * Represents a triangle
 *
 * @author Alex Tyler
 * @version 05/09/19
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
     * perimeter() returns the perimeter of the triangle
     *
     * @param  none
     * @return    the perimeter of the triangle
     */
    public double perimeter()
    {
        return side1 + side2 + side3;
    }
    
    /**
     * area() returns the area of the triangle
     *
     * @param none
     * @return    the area of the triangle
     */
    public double area()
    {
        return (side2 / 2.0) * side1;
    }
    
}
