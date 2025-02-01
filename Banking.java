import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Banking {
    private Map<String, Account> accounts;
    private Scanner scanner;

    public Banking() {
        this.accounts = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("Banking System");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private void register() {
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter your initial balance: ");
        double balance = Double.parseDouble(scanner.nextLine());

        Account account = new Account(name, accountNumber, balance);
        accounts.put(accountNumber, account);
        System.out.println("Account created successfully!");
    }

    private void login() {
        System.out.print("Enter your account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        Account account = accounts.get(accountNumber);
        if (account != null && account.getName().equals(name)) {
            System.out.println("Login successful!");
            accountMenu(account);
        } else {
            System.out.println("Invalid account number or name.");
        }
    }

    private void accountMenu(Account account) {
        while (true) {
            System.out.println("Account Menu");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
            System.out.println("4. Logout");
            System.out.print("Choose an option: ");
            int option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                    depositMoney(account);
                    break;
                case 2:
                    withdrawMoney(account);
                    break;
                case 3:
                    checkBalance(account);
                    break;
                case 4:
                    System.out.println("Logging out...");
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    private void depositMoney(Account account) {
        System.out.print("Enter the amount to deposit: ");
        double amount = Double.parseDouble(scanner.nextLine());
        account.deposit(amount);
        System.out.println("Deposit successful!");
    }

    private void withdrawMoney(Account account) {
        System.out.print("Enter the amount to withdraw: ");
        double amount = Double.parseDouble(scanner.nextLine());
        if (account.withdraw(amount)) {
            System.out.println("Withdrawal successful!");
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    private void checkBalance(Account account) {
        System.out.println("Your balance is: " + account.getBalance());
    }

    public static void main(String[] args) {
        Banking bankingSystem = new Banking();
        bankingSystem.run();
    }
}

class Account {
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }
}