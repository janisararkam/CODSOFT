import java.util.*;

public class GradingSystem 
{
    public static void main(String[] args) 
    {

        System.out.println(" Marks calculation of the science students");
       Scanner scanner = new Scanner(System.in);

       

        System.out.println("Enter the marks of physics,chemistry,biology (out of 100):");
        System.out.print("physics: ");
        int physics = scanner.nextInt();
        System.out.print("chemistry: ");
        int chemistry = scanner.nextInt();
        System.out.print("biology: ");
        int biology = scanner.nextInt();

       
        int totalMarks = physics + chemistry + biology;

        double averagePercentage = (double) totalMarks / 3;

       
        char grade;
        if (averagePercentage >= 90) 
        {
            grade = 'A';
        } else if (averagePercentage >= 80)
         {
            grade = 'B';
        } else if (averagePercentage >= 70) 
        {
            grade = 'C';
        } else if (averagePercentage >= 60)
         {
            grade = 'D';
        } else
         {
            grade = 'F';
        }

        System.out.println("\nResults:");
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}