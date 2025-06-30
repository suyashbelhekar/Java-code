 import java.util.Scanner;

public class StudentGrading {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's marks (0-100): ");
        int marks = scanner.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid input. Marks must be between 0 and 100.");
        } else {
            switch (marks / 10) {
                case 10: // for 100
                case 9:
                    System.out.println("Grade: A");
                    break;

                case 8:
                case 7:
                    System.out.println("Grade: B");
                    break;

                case 6:
                case 5:
                    System.out.println("Grade: C");
                    break;

                default:
                    System.out.println("Grade: Fail");
            }
        }

        scanner.close();
    }
}
