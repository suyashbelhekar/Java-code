import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        // Create the array
        int[] array = new int[size];

        // Populate the array with values
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Find and print the length of the array
        System.out.println("The length of the array is: " + array.length);

        // Optionally, print the elements of the array
        System.out.println("The elements in the array are:");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        scanner.close();
    }
}

