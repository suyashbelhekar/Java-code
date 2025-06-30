 import java.util.Scanner;

public class CoffeeBillCalculator {
    public static void main(String[] args) {
        final int ESPRESSO_PRICE = 50;
        final int LATTE_PRICE = 80;
        final int CAPPUCCINO_PRICE = 100;

        int espressoQty = 0, latteQty = 0, cappuccinoQty = 0;
        int choice, quantity;

        Scanner scanner = new Scanner(System.in);

        System.out.println("☕ Welcome to Java Coffee Shop!");
        
        do {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Espresso - ₹" + ESPRESSO_PRICE);
            System.out.println("2. Latte - ₹" + LATTE_PRICE);
            System.out.println("3. Cappuccino - ₹" + CAPPUCCINO_PRICE);
            System.out.println("4. Exit and Print Bill");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity of Espresso: ");
                    quantity = scanner.nextInt();
                    espressoQty += quantity;
                    break;
                case 2:
                    System.out.print("Enter quantity of Latte: ");
                    quantity = scanner.nextInt();
                    latteQty += quantity;
                    break;
                case 3:
                    System.out.print("Enter quantity of Cappuccino: ");
                    quantity = scanner.nextInt();
                    cappuccinoQty += quantity;
                    break;
                case 4:
                    System.out.println("\nGenerating your bill...");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose from the menu.");
            }
        } while (choice != 4);

        // Calculate totals
        int totalEspresso = espressoQty * ESPRESSO_PRICE;
        int totalLatte = latteQty * LATTE_PRICE;
        int totalCappuccino = cappuccinoQty * CAPPUCCINO_PRICE;
        int totalBill = totalEspresso + totalLatte + totalCappuccino;

        // Print bill
        System.out.println("\n-------- FINAL BILL --------");
        if (espressoQty > 0)
            System.out.println("Espresso x " + espressoQty + " = ₹" + totalEspresso);
        if (latteQty > 0)
            System.out.println("Latte x " + latteQty + " = ₹" + totalLatte);
        if (cappuccinoQty > 0)
            System.out.println("Cappuccino x " + cappuccinoQty + " = ₹" + totalCappuccino);
        
        System.out.println("-----------------------------");
        System.out.println("Total Amount: ₹" + totalBill);
        System.out.println("Thank you for visiting! ☕");

        scanner.close();
    }
}
