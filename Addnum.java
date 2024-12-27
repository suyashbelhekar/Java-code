public class Addnum {
    public static void main(String[] args) {
        // Example string
        String input = "Hello World";

        // Initialize counters
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert string to lowercase to make comparison case-insensitive
        input = input.toLowerCase();

        // Iterate through the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check for vowels
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Output the results
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}

