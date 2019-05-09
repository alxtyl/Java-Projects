import java.util.*;
/**
 * Tests the shape classes
 *
 * @author Alex Tyler
 * @version 05/09/19
 */
public class Tester
{
    /**
     * main() method
     */
    public static void main(String[] args) 
    {
        //creating a new array list
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        //creating a new triangle object and adding it to the array list
        Triangle tri = new Triangle(3.0, 2.5, 2.0, "white", true); //side1 = 3, side2 = 2.5, side3 = 2, the color is white and the shape is filled
        shapes.add(tri);

        //creating a new rectangle object and adding it to the array list
        Rectangle rect = new Rectangle(2.0, 4.0, "red", true); //side1 = 2, side2 = 4, the color is red and the shape is filled
        shapes.add(rect);
        
        //creating a new circle object and adding it to the array list
        Circle circ = new Circle(1.0, "yellow", false); //radius = 1, the color is yellow and the shape is not filled
        shapes.add(circ);

        System.out.println("Starting shapes");

        //traversing through the array list and printing info
        for (Shape arrayShape : shapes) {
            System.out.println(arrayShape.getClass().getName() + "[color=" + arrayShape.toString() + ", filled=" + arrayShape.toBoolean() + "]");
            
            //printing out perimeter and area of the shapes
            System.out.printf("Perimeter is: %.2f\n", arrayShape.perimeter());
            System.out.printf("Area is: %.2f\n\n", arrayShape.area());
        }

        //changing the shapes around
        shapes.set(0, new Triangle(3.0, 2.5, 2.0,"white", false));
        shapes.set(1, new Rectangle(2.0, 4.0, "blue", true));
        shapes.set(2, new Circle(1.0, "black", true));

        System.out.println("Changed shapes");
        
        //traversing through the array list and printing updated info
        for (Shape arrayShape : shapes) {
            System.out.println(arrayShape.getClass().getName() + "[color=" + arrayShape.toString() + ", filled=" + arrayShape.toBoolean() + "]");
        }
    }
}
