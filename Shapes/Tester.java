import java.util.*;
/**
 * Write a description of class Tester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Tester
{
    /**
     * main() method
     */
    public static void main(String[] args) 
    {
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        Triangle tri = new Triangle(3.0, 2.5, 2.0,"White", true);
        shapes.add(tri);

        Rectangle rect = new Rectangle(2.0, 4.0, "Red", true);
        shapes.add(rect);
        
        Circle circ = new Circle(1.0, "Yellow", false);
        shapes.add(circ);

        System.out.println("Starting shapes\n");

        for (Shape arrayShape: shapes) {
            System.out.println("For " + arrayShape.getClass().getName() + ":");
            System.out.println("The color of the shape is: " + arrayShape.toString());
            
            if (arrayShape.toBoolean() == true){
                System.out.println("The shape is filled");
            }
            else {
                System.out.println("The shape is empty");
            }
            
            System.out.printf("The perimeter is: %.2f\n", arrayShape.perimeter());
            System.out.printf("The area is: %.2f\n\n", arrayShape.area());
        }

        shapes.set(0, new Triangle(3.0, 2.5, 2.0,"White", false));
        shapes.set(1, new Rectangle(2.0, 4.0, "Blue", true));
        shapes.set(2, new Circle(1.0, "Black", true));

        System.out.println("Changed shapes\n");
        
        for (Shape arrayShape: shapes) {
            System.out.println("For " + arrayShape.getClass().getName() + ":");
            System.out.println("The color of the shape is now: " + arrayShape.toString());
            
            if (arrayShape.toBoolean() == true){
                System.out.println("The shape is now filled\n");
            }
            else {
                System.out.println("The shape is now empty\n");
            }
            
        }


    }
}
