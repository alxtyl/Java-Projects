import java.io.IOException;
import java.util.*;
import java.io.*;
/**
 * The Students class is used to store and process many Student objects.
 * 
 * @author Alex Tyler 
 * @version 05/21/19
 */
public class Students
{
   //instance variable for the array of students
   private ArrayList<Student> students;
   
   /**
    * Constructor for an array of students
    */
   public Students()
   {
       students = new ArrayList<>();
   }

   /**
    * Reads in student information from a file and creates a student object to be added to the array
    * of students
    *
    * @param void
    * @return void
    */
   public void readFile() throws IOException
   {    
       String fileName = "Students.txt";               
       File file = new File(fileName);
       Scanner fileScanner = new Scanner(file); //reads from a file of student data
      
       while(fileScanner.hasNextLine()) {
           String name = fileScanner.nextLine();         
           int age = Integer.parseInt(fileScanner.nextLine().trim());
           double GPA = Double.parseDouble(fileScanner.nextLine().trim());
    
           students.add(new Student(name, age, GPA)); //gets student information and creates a new student object
       }
       
       fileScanner.close(); //closing the file
   }

   /**
    * Uses a stringbuilder to return a string of student information
    * 
    * @param void
    * @return String of student data separated by newline characters
    */
   public String toString()
   {    
       StringBuilder sb = new StringBuilder();

       for (Student s:students) {
           sb.append(s);
           sb.append("\n");
       }
       
       return sb.toString();
   }

   /**
    * Prints data of all students to file and to display window
    *
    * @param PrintWriter to write to file
    * @return void
    */
   public void printData(PrintWriter pw)
   {
       //writes to file
       pw.println("2. All students in the database");
       pw.println("--------------------------");
       pw.println(toString());
       
       //writes to display
       System.out.println("2. All students in the database");
       System.out.println("--------------------------");
       System.out.println(toString());
   }

   /**
    * Looks through the student array for the student with the highest GPA, saves the location, and writes information
    * to display and to file
    * 
    * @param PrintWriter to write to file
    * @return void
    */
   public void printHigh(PrintWriter pw) 
   {
       double GPA = 0.0;
       int index = 0;
       
       for (int i = 0; i < students.size(); ++i) {
           if (students.get(i).getGPA() > GPA) {
               GPA = students.get(i).getGPA();
               index = i; //saves index of student with best GPA  
           }
       }
       
       System.out.println("3. The student with the best GPA is:\n" + students.get(index));
       pw.println("3. The student with the best GPA is:\n" + students.get(index));
       System.out.println();
       pw.println();
    }

   /**
    * Finds the average GPA of all the students
    * 
    * @param void
    * @return average GPA
    */
   public double calcAverageGPA() 
   {
       double totalGPA = 0.0;

       for (Student s:students) {
            totalGPA += s.getGPA();
       }

       return totalGPA / students.size(); //returns the average GPA
   }

   /**
    * Writes average GPA to display and file
    * 
    * @param PrintWriter to write to file
    * @return void
    */
   public void printAverageGPA(PrintWriter pw)
    {
       double average = calcAverageGPA();

       System.out.printf("4. Average GPA: %.2f\n", average); //writes average GPA to display and file
       pw.printf("4. Average GPA: %.2f\n", average);
       System.out.println();
       pw.println();
    }

   /**
    * Creates an arraylist of below average students
    * 
    * @param void
    * @return array list of below average students 
    */
    public ArrayList<Student> belowAverage() 
    {
       ArrayList<Student> belowAverage = new ArrayList<Student>(); 
       double average = calcAverageGPA(); 

       for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).getGPA() < average) {
                belowAverage.add(this.students.get(i)); //checks if GPA is below aveage and adds to array
            }
       }
        
       return belowAverage;
    }
 
   /**
    * Creates an arraylist of above average students
    * 
    * @param void
    * @return array list of above average students
    */
    public ArrayList<Student> aboveAverage() 
    {
       ArrayList<Student> aboveAverage = new ArrayList<Student>(); 
       double average = calcAverageGPA();

       for (int i = 0; i < this.students.size(); i++) {
            if (this.students.get(i).getGPA() > average) {
                aboveAverage.add(this.students.get(i)); //checks if GPA is above average and adds to array
            }
       }
        
       return aboveAverage;
    }

   /**
    * Writes the number of above / below average students to display and file
    * 
    * @param PrintWriter to write to file
    * @return void
    */
   public void averageStats(PrintWriter pw)
   {
      int numAboveAverage, numBelowAverage = 0;
      
      numAboveAverage = aboveAverage().size();
      numBelowAverage = belowAverage().size();

      System.out.println("5. Above / below average GPA: " + numAboveAverage + " , " + numBelowAverage);
      pw.println("5. Above / below average GPA: " + numAboveAverage + " , " + numBelowAverage);

      System.out.println();
      pw.println();
   }

   /**
     * Writes the above average students to display and file
     * 
     * @param PrintWriter to write to file
     * @return void
     */
   public void studentAboveAverageInfo(PrintWriter pw)
   {
      ArrayList<Student> aboveAverage = new ArrayList<Student>(); 
      double average = calcAverageGPA();

      System.out.println("6. The students above average: ");
      pw.println("6. The students above average: ");

      for (int i = 0; i < this.students.size(); i++) {
          if (this.students.get(i).getGPA() > average) {
              aboveAverage.add(this.students.get(i)); //the method above could have been used, but the spacing was not as nices
              System.out.println(this.students.get(i));
              pw.println(this.students.get(i));
          }
      }

      System.out.println();
      pw.println();
   }
  
   /**
    * Searches the arraylist of below average students and displays the youngest
    * 
    * @param PrintWriter to write to file
    * @return void
    */
   public void youngestBelowAverage(PrintWriter pw)
   {
      ArrayList<Student> belowAverageStudents = belowAverage(); 

      Student temp = belowAverageStudents.get(0);
      for (int i = 1; i < belowAverageStudents.size(); ++i) {
           if (belowAverageStudents.get(i).getAge() < temp.getAge()) { //searches below average array for youngest
               temp = belowAverageStudents.get(i);
           }
      }
      
      System.out.println("7. The youngest student with below average GPA is:\n" + temp.toString());
      pw.println("7. The youngest student below avarage GPA is:\n" + temp.toString());
      System.out.println();
      pw.println(); 
   }

   /**
    * Searches the array of below average students and displays the youngest
    * 
    * @param PrintWriter to write to file
    * @return void
    */
   public void averageAgeBelow(PrintWriter pw)
   {
      double totalAge = 0.0;
      double averageAge = 0.0;
      double numBelowAverage = 0.0;
      double average = calcAverageGPA();
      
      //finding the total age of the students
      for (int i = 0; i < this.students.size(); i++) {
           if (this.students.get(i).getGPA() < average) {
              totalAge += this.students.get(i).getAge();
           }
      }

      numBelowAverage = belowAverage().size();   
      averageAge = totalAge / numBelowAverage; //finding the average by div the comb age of the students with the number of below average students

      System.out.printf("8. The average age of the students with below average GPA is: %.2f", averageAge);
      pw.printf("8. The average age of the students with below average GPA is: %.2f", averageAge);
   }
}
