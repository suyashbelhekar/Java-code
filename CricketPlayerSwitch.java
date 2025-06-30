 import java.util.Scanner;
public class CricketPlayerSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character (a/b/c/d/r/v/s/y): ");
        char choice = sc.next().toLowerCase().charAt(0); 
        
        switch (choice) {
            case 'a':
                System.out.println("Abhishek Sharma");
                break;
            case 'b':
                System.out.println("Bumrah");
                break;
            case 'c':
                System.out.println("Chahal");
                break;
            case 'd':
                System.out.println("Dhoni");
                break;
            case 'r':
                System.out.println("Rohit Sharma");
                break;
            case 'v':
                System.out.println("Virat Kohli");
                break;
            case 's':
                System.out.println("Shreyas Iyer");
                break;
            case 'y':
                System.out.println("Yashaswi Jaiswal");
                break;
            default:
                System.out.println("Invalid choice! Please enter a valid character.");
        }
    }
}