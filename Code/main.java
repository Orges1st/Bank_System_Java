
import java.util.Scanner;

public class BankManagementSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name, location;
        int age;
        double balance = 0;

        System.out.println("===== WELCOME TO KING BANK =====");

        // Account Registration
        System.out.print("Enter your full name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();
        input.nextLine();

        System.out.print("Enter your location: ");
        location = input.nextLine();

        // Age verification
        if (age < 18) {
            System.out.println("Sorry! You must be 18+ to open an account.");
            return;
        }

        System.out.println("\nAccount successfully created!");
        System.out.println("Welcome, " + name + "!");

        int choice;

        // Bank Menu
        do {
            System.out.println("\n===== KING BANK MENU =====");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Account Information");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter deposit amount: €");
                    double deposit = input.nextDouble();

                    if (deposit <= 0) {
                        System.out.println("Invalid amount!");
                    } else if (deposit > 1000) {
                        System.out.println("Maximum deposit limit is €1000.");
                    } else {
                        balance += deposit;
                        System.out.println("Deposit successful!");
                    }
                    break;

                case 2:
                    System.out.print("Enter withdrawal amount: €");
                    double withdrawal = input.nextDouble();

                    if (withdrawal <= 0) {
                        System.out.println("Invalid amount!");
                    } else if (withdrawal > balance) {
                        System.out.println("Insufficient funds!");
                    } else {
                        balance -= withdrawal;
                        System.out.println("Withdrawal successful!");
                    }
                    break;

                case 3:
                    System.out.println("Your balance: €" + balance);
                    break;

                case 4:
                    System.out.println("\n===== ACCOUNT INFORMATION =====");
                    System.out.println("Name: " + name);
                    System.out.println("Age: " + age);
                    System.out.println("Location: " + location);
                    System.out.println("Balance: €" + balance);
                    break;

                case 5:
                    System.out.println("Thank you for using KING BANK!");
                    break;

                default:
                    System.out.println("Invalid option! Try again.");
            }

        } while (choice != 5);

        input.close();
    }
}
