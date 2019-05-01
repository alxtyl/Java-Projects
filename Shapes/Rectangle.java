
/**
 * Used for building the rectangle class
 *
 * @Alex Tyler
 * @5/9/19
 */
public class Rectangle extends Shape
{
    // instance variables
    private double lenght;
    private double width;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(double l, double w, String rectColor, Boolean rectFilled)
    {
        super(rectColor, rectFilled);
 
        lenght = l;
        width = w;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double area()
    {
        return lenght * width;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double perimeter()
    {
        return 2 * (lenght + width);
    }

    
}
