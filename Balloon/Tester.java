import java.util.Scanner;
/**
 * This class asks the user about the ballon they would like to create and then
 * inflates it by 5.0 units, then outputs the color and volume.
 *
 * @Alex Tyler
 * @3/17/19
 */
public class Tester
{
    /**
     * main() method
     */
    public static void main(String[] args)
    {
        //creating scanner object
        Scanner sc = new Scanner(System.in);
        
        //prompting the user for the color of the ballon
        System.out.println("Please enter the color of the ballon:");
        String userBalloonC = sc.nextLine(); //C stands for color
        
        //prompting the user for the size of the ballon
        System.out.println("Please enter the size of the ballon:");
        double userBalloonS = sc.nextDouble(); //S stands for Size
        
        //creating new ballon object based on user response
        Balloon userBalloon = new Balloon(userBalloonC, userBalloonS);
        
        //inflating the ballon by 5.0
        userBalloon.inflate(5.0); 
        
        //displaying ballon info
        System.out.println("For the " + userBalloon.displayBalloonColor() + " ballon");
        System.out.printf("Volume is now: %.2f%n", userBalloon.balloonVolume());
    }
}
