 public class Pyramid{
    public static void main(String[] args) {
        int n = 5; // Total number of rows

        for (int i = 1; i <= n; i++) {
            // Print leading spaces to center the pattern
            for (int s = 1; s <= n - i; s++) {
                System.out.print("  ");
            }

            // Print the current row number i, i times with extra spacing
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "  ");
            }

            // Move to next line
            System.out.println();
        }
    }
}
