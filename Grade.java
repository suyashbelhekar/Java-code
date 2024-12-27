import java.util.Scanner;

public class Grade{
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user for their numeric score
        System.out.print("Enter your numeric score (0-100): ");
        int score = scanner.nextInt();
        
        // Assign a letter grade based on the score
        String grade;
        
        // Nested if-else statements for grade assignment
        if (score >= 90 && score <= 100) {
            grade = "A";
        } else if (score >= 80 && score < 90) {
            grade = "B";
        } else if (score >= 70 && score < 80) {
            grade = "C";
        } else if (score >= 60 && score < 70) {
            grade = "D";
        } else if (score >= 0 && score < 60) {
            grade = "F";
        } else {
            grade = "Invalid score"; // Handle invalid score input
        }

        // Output the grade
        System.out.println("Your grade is: " + grade);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
