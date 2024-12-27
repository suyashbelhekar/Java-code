public class SumCalculator {
    public static void main(String[] args) {
        int sum = 0;  // Variable to hold the sum
        int i = 1;    // Variable for the counter

        // While loop to iterate through numbers 1 to 100
        while (i <= 100) {
            sum += i;  // Add the current number to the sum
            i++;       // Increment the counter
        }

        // Output the result
        System.out.println("The sum of integers from 1 to 100 is: " + sum);
    }
}
