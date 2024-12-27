import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        double[] marks = new double[numStudents];
        double totalMarks = 0;

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Enter marks for student " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            totalMarks += marks[i];
        }

        double average = totalMarks / numStudents;
        System.out.printf("The average marks of the students is: %.2f\n", average);

        scanner.close();
    }
}

