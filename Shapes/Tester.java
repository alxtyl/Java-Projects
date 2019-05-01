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
            System.out.printf("[color=" + arrayShape.toString() + ",");
            
            if (arrayShape.toBoolean() == true) {
                System.out.printf("filled=" + arrayShape.toBoolean() + "]");
            }

            else {
                System.out.printf("Filled=" + arrayShape.toBoolean());
            }

            System.out.printf("[length=" + arrayShape.perimeter() + ",");
            System.out.printf("width=" + arrayShape.area());
            System.out.println("]\n");
        }

        

        System.out.print("Changed shapes");


    }
}
