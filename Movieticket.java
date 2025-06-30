 import java.util.Scanner;

public class Movieticket {
    public static void main(String[] args) {
        final int TICKET_PRICE = 200;
        final int MAX_TICKETS = 4;

        Scanner scanner = new Scanner(System.in);

        System.out.println("🎬 Welcome to the Cinema Hall Ticket Booking");
        System.out.print("Enter number of tickets to book (max " + MAX_TICKETS + "): ");
        int tickets = scanner.nextInt();

        if (tickets <= 0 || tickets > MAX_TICKETS) {
            System.out.println("Invalid number of tickets. You can only book 1 to " + MAX_TICKETS + " tickets.");
        } else {
            int total = tickets * TICKET_PRICE;
            double discount = 0.0;

            // Apply 10% discount if total is over ₹500
            if (total > 500) {
                discount = total * 0.10;
                total -= discount;
            }

            System.out.println("\n----- Booking Summary -----");
            System.out.println("Tickets booked: " + tickets);
            System.out.println("Ticket price: ₹" + TICKET_PRICE);
            if (discount > 0)
                System.out.println("Discount applied: ₹" + discount);
            else
                System.out.println("No discount applied.");
            System.out.println("Total amount to pay: ₹" + total);
            System.out.println("✅ Booking Confirmed. Enjoy your movie!");
        }

        scanner.close();
    }
}
