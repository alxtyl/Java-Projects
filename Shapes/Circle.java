
/**
 * Write a description of class Circle here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        super(circleColor, circleFilled);
        
        this.radius = r;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param    a sample parameter for a method
     * @return    the sum of x and y
     */
    public double area()
    {
        return Math.PI * Math.pow(radius, 2.0);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param    a sample parameter for a method
     * @return    the sum of x and y
     */
    public double perimeter()
    {
        return (2.0) * Math.PI * (radius);
    }
}
