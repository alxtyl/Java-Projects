import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
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
       Students students = new Students(); //creates students
       PrintWriter printWriter = new PrintWriter(new File("output.txt")); //creates PrintWriter to output.txt file
              
       students.readFile(); //reads in students' info from data file
       students.printData(printWriter); //displays all student data
       students.printHigh(printWriter); //displays student with the highest GPA
       students.printAverageGPA(printWriter); //displays average the GPA
       students.averageStats(printWriter); //displays the students above/below the average GPA 
       students.studentAboveAverageInfo(printWriter); //displays the students with above average GPA
       students.youngestBelowAverage(printWriter); //displays youngest student with GPA below average
       students.averageAgeBelow(printWriter); //displays the average age of the students with a below average GPA       

       printWriter.close(); //closes file 
    }
}
