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
       PrintWriter printWriter = new PrintWriter(new File("output.txt")); //creates PrintWriter to output.txt file
       Students students = new Students(); //creates students       

       students.readFile(); //creates students from data file
       students.printData(printWriter); //displays all student data
       students.printHigh(printWriter); //displays student with the highest GPA
       students.printAvgGpa(printWriter); //displays average the GPA
       students.averageStats(printWriter); //displays the students above the average GPA 
       
       students.youngestBelowAvg(printWriter); //displays youngest student with GPA below average

       printWriter.close(); //closes file 
    }
}
