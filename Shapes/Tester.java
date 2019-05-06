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
        //setting up new array list
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        //creating a new triangle object and adding it to the array list
        Triangle tri = new Triangle(3.0, 2.5, 2.0,"White", true); //side1 = 3, side2 = 2.5, side3 = 2, the color is white and the shape is filled
        shapes.add(tri);

        //creating a new rectangle object and adding it to the array list
        Rectangle rect = new Rectangle(2.0, 4.0, "Red", true); //side1 = 2, side2 = 4, the color is red and the shape is filled
        shapes.add(rect);
        
        //creating a new circle object and adding it to the array list
        Circle circ = new Circle(1.0, "Yellow", false); //radius = 1, the colour is yellow and the shape is not filled
        shapes.add(circ);

        System.out.println("Starting shapes\n");

        //traversing through the array list and printing info
        for (Shape arrayShape: shapes) {
            System.out.println("For " + arrayShape.getClass().getName() + ":");
            System.out.println("The color of the shape is " + arrayShape.toString());
            
            //checking to see if the shape is filled or not
            if (arrayShape.toBoolean() == true){
                System.out.println("The shape is filled");
            }
            else {
                System.out.println("The shape is empty");
            }
            
            //printing out perimeter and area of the shapes
            System.out.printf("The perimeter is %.2f\n", arrayShape.perimeter());
            System.out.printf("The area is %.2f\n\n", arrayShape.area());
        }

        //changing the shapes around
        shapes.set(0, new Triangle(3.0, 2.5, 2.0,"White", false));
        shapes.set(1, new Rectangle(2.0, 4.0, "Blue", true));
        shapes.set(2, new Circle(1.0, "Black", true));

        System.out.println("Changed shapes\n");
        
        //traversing through the array list and printing updated info
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
