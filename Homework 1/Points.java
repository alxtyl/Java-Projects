import java.awt.Point;
/**
 * CSCI 114 Homework 1
 *
 * @Alex Tyler
 * @2/14/19
 */
public class Points
{
    public static void main(String[] args)
    {
        //initializing points
        Point pointA = new Point(0,10);
        Point pointB = new Point(20,30);

        //printing out points init vaules
        System.out.println("pointA is: " + pointA.toString());
        System.out.println("pointB is: " + pointB.toString());
 
        //moving pointA location
        pointA.setLocation(20,30);
        
        //printing out new point locations
        System.out.println("The new location of pointA is: " + pointA.toString());
        
        //tranlating pointA by 70,50
        pointA.translate(70,50);
       
        //printing out new location of pointA
        System.out.println("The new location of pointA after translation is: " + pointA.toString());
    }
}
