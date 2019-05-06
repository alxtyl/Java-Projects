
/**
 * Represents a circle
 *
 * @author Alex Tyler
 * @version 05/09/19
 */
public class Circle extends Shape
{
    // instance variable
    private double radius;

    /**
     * Constructor for objects of class Circle
     */
    public Circle(double r, String circleColor, boolean circleFilled)
    {
        //initialise instance variables
        super(circleColor, circleFilled);
        
        this.radius = r;
    }

    /**
     * area() returns the area of the circle
     *
     * @param  none
     * @return    the area of the circle based on its radius
     */
    public double area()
    {
        return Math.PI * Math.pow(radius, 2.0);
    }

    /**
     * perimeter() returns the perimeter of the circle
     *
     * @param  none
     * @return    the perimeter of the cirle
     */
    public double perimeter()
    {
        return (2.0) * (Math.PI) * (radius);
    }
}
