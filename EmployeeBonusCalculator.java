 import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee salary: ₹");
        double salary = sc.nextDouble();
        double bonusPercentage;
        double bonusAmount;
        double totalSalary;

        if (salary >= 10000 && salary <= 20000) {
            bonusPercentage = 5;
        } else if (salary>=20001 && salary<=40000) {
            bonusPercentage = 7;
        } else if (salary >=40001 && salary<= 60000) {
            bonusPercentage = 9;
        } else if (salary <= 90000) {
            bonusPercentage = 10; 
        } else {
            bonusPercentage = 15;
        }

        bonusAmount = (salary * bonusPercentage) / 100;
        totalSalary = salary + bonusAmount;

        System.out.println("Bonus Percentage: " + bonusPercentage + "%");
        System.out.println("Bonus Amount: ₹" + bonusAmount);
        System.out.println("Total Salary with Bonus: ₹" + totalSalary);

        sc.close();
    }
}