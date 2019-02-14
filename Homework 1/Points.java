import java.awt.Point;
/**
 * Write a description of class Points here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Points
{
    public static void main(String[] args)
    {
        Point pointA = new Point(0,10);
        Point pointB = new Point(20,30);

        System.out.println("pointA is: " + pointA.toString());
        System.out.println("pointB is: " + pointB.toString());
 
        pointA.setLocation(20,30);
        
        System.out.println("The new location of pointA is: " + pointA.toString());
        
        pointA.translate(70,50);
       
        System.out.println("The new location of pointA after translation is: " + pointA.toString());
    }
}
