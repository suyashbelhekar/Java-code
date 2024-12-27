import java.util.Scanner;
public class Scores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user for the number of students
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        // Initialize the scores array based on the number of students
        int[] scores = new int[numStudents];

        // Prompt the user to enter scores for each student
        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter score for student " + (i + 1) + ": ");
            scores[i] = scanner.nextInt();
        }
        // Find highest and lowest scores
        int highestScore = findHighestScore(scores);
        int lowestScore = findLowestScore(scores);

        // Calculate average score
        double averageScore = calculateAverageScore(scores);

        // Print the results in a user-friendly format
        printResults(highestScore, lowestScore, averageScore);

        // Close the scanner
        scanner.close();
    }

    // Method to find the highest score
    public static int findHighestScore(int[] scores) {
        int highest = scores[0];
        for (int score : scores) {
            if (score > highest) {
                highest = score;
            }
        }
        return highest;
    }

    // Method to find the lowest score
    public static int findLowestScore(int[] scores) {
        int lowest = scores[0];
        for (int score : scores) {
            if (score < lowest) {
                lowest = score;
            }
        }
        return lowest;
    }

    // Method to calculate the average score
    public static double calculateAverageScore(int[] scores) {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }
        return (double) sum / scores.length;
    }

    // Method to print the results in a user-friendly format
    public static void printResults(int highest, int lowest, double average) {
        System.out.println("\nAnalysis of Student Scores:");
        System.out.println("---------------------------");
        System.out.printf("Highest Score: %d\n", highest);
        System.out.printf("Lowest Score: %d\n", lowest);
        System.out.printf("Average Score: %.2f\n", average);
    }
}
