import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
/**
 * Tests student and students classes
 * 
 * @author Alex Tyler
 * @version 05/21/19
 */
public class Tester
{
    /**
     * main() method
     */
    public static void main(String [] args) throws IOException
    {
       PrintWriter printWriter = new PrintWriter(new File("output.txt")); // Creates PrintWriter to output.txt file
       Students students = new Students(); // Creates students                           
       students.readFile(); // Creates students from data file
       students.printData(printWriter); // Displays all student data
       students.printHigh(printWriter); // Displays student with the highest GPA
       students.printAvgGpa(printWriter); // Displays average GPA
       students.youngestBelowAvg(printWriter); // Displays youngest student with GPA below avg
       printWriter.close(); // Closes file 
    }
}
