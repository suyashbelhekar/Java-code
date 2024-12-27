import java.util.*;
public class Trycatch extends Exception {
    public static void main(String[] args) {
        // Creating a bank account with an initial balance
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the balance");
        double bal=sc.nextDouble();
        // Trying to withdraw money
        try {
            System.out.println("enter amount to withdraw");  // Attempt to withdraw more than available balance
            int withdraw=sc.nextInt();
            if(withdraw<=bal){
            System.out.println("successfully");
            }
        } catch (Exception e) {
            System.out.println("Error: ");
        }
    }
}

      