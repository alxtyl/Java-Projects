/**
 * The Student class tracks the information of one student
 * 
 * @author Alex Tyler
 * @version 05/21/19
 */
public class Student
{
   //instance variables
   private String name;
   private int age;
   private double gpa; 
   
   /**
    * Constructor for an individual student
    */
   public Student(String name, int age, double gpa)
   {
       this.name = name;
       this.age = age;
       this.gpa = gpa;
   }

   /**
    * Formats and returns students information in a string
    *
    * @param void
    * @return String with the name, age, and gpa of student
    */
   public String toString()
   {
       String info = String.format("%-10s %6d %8.2f", name, age, gpa);
       return info;
   }

   /**
    * Returns student name
    *
    * @param void
    * @return name
    */
   public String getName()
   {
       return name;
   }

   /** 
    * Returns student age
    *
    * @param void
    * @return age
    */
   public int getAge()
   {
       return age;
   }

   /** 
    * Returns GPA
    *
    * @param void
    * @return GPA
    */
   public double getGPA()
   {
       return gpa;
   }   
}
