
/**
 * Represents a rectangle
 *
 * @author Alex Tyler
 * @version 05/09/19
 */
public class Rectangle extends Shape
{
    //instance variables
    private double lenght, width;

    /**
     * Constructor for objects of class Rectangle
     */
    public Rectangle(double l, double w, String rectColor, Boolean rectFilled)
    {
        //initialise instance variables
        super(rectColor, rectFilled);
 
        this.lenght = l;
        this.width = w;
    }

    /**
     * area() returns the area of the rectangle
     *
     * @param  none
     * @return    the area of the rectangle
     */
    public double area()
    {
        return lenght * width;
    }

    /**
     * perimeter() returns the perimeter of the rectangle
     *
     * @param  none
     * @return    the perimeter of the rectangle
     */
    public double perimeter()
    {
        return 2 * (lenght + width);
    }

    /**
     * getSides() returns the length and width of the rectangle
     *
     * @param  none
     * @return    formated string
     */
    public String getSides()
    {
        String out = "";

        out = String.format("[length= %.1f, width = %.1f]", lenght, width);

        return out;
    }
}
