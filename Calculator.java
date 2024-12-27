import java.io.File;
import java.io.FileNotFoundException; 
import java.util.Scanner; 
 
public class Calculator { 
    public static void main(String[] args) { 
        try { 
            // Outer try block for file handling 
            File file = new File("data.txt"); 
            Scanner fileScanner = new Scanner(file); 
 
            while (fileScanner.hasNextLine()) { 
                String line = fileScanner.nextLine(); 
                try { 
                    // Inner try block for processing each line (may throw NumberFormatException) 
                    int number = Integer.parseInt(line); // May throw NumberFormatException 
                    System.out.println("Processed number: " + number); 
                } catch (NumberFormatException e) { 
                    System.out.println("Error: Invalid number format in file."); 
                } 
            } 
 
            fileScanner.close(); 
        } catch (FileNotFoundException e) { 
            System.out.println("Error: File not found."); 
        } 
    } 
} 