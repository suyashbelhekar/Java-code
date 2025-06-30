 import java.util.Scanner;
public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the units ");
        int units = sc.nextInt();
        int costPerUnit;
        int totalBill;

        if (units >= 0 && units <= 100) {
            costPerUnit = 5;
        } else if (units <= 400) {
            costPerUnit = 20;
        } else if (units <= 700) {
            costPerUnit = 30;
        } else{
            costPerUnit = 50;
        }

        totalBill = units * costPerUnit;

        System.out.println("Cost per unit: ₹" + costPerUnit);
        System.out.println("Total electricity bill: ₹" + totalBill);

        sc.close();
    }
}