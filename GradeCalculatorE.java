import java.util.Scanner;

public class GradeCalculatorE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize variables
        int totalGrades = 0;
        int gradeCount = 0;
        int highestGrade = Integer.MIN_VALUE;
        int passingThreshold = 50;  // Assuming passing grade is 50
        int passedCount = 0;

        // Prompt the teacher for grades until -1 is entered
        while (true) {
            System.out.print("Enter grade (or -1 to stop): ");
            int grade = scanner.nextInt();

            // Check for the termination condition (-1)
            if (grade == -1) {
                break;
            }

            // Validate grade range (e.g., 0 to 100)
            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Please enter a grade between 0 and 100.");
                continue;
            }

            // Add grade to total and increment count
            totalGrades += grade;
            gradeCount++;

            // Check if the grade is the highest so far
            if (grade > highestGrade) {
                highestGrade = grade;
            }

            // Check if the student passed
            if (grade > passingThreshold) {
                passedCount++;
            }
        }

        // If no grades were entered, handle this case
        if (gradeCount == 0) {
            System.out.println("No grades were entered.");
        } else {
            // Calculate the average grade
            double averageGrade = (double) totalGrades / gradeCount;

            // Output the results
            System.out.println("\nGrade Summary:");
            System.out.println("Average grade: " + averageGrade);
            System.out.println("Highest grade: " + highestGrade);
            System.out.println("Number of students who passed: " + passedCount);
        }

        scanner.close();
    }
}
