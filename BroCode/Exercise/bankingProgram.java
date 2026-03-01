import java.util.*;

public class bankingProgram {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        double balance = 0;

        System.out.println("*******************************");
        System.out.println(" WELCOME TO THE BANK OF PRATIK ");
        System.out.println("*******************************");

        while (true) {

            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Show Balance");
            System.out.println("4. Exit");

            System.out.print("Select a choice (1-4): ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> balance = deposit(balance);
                case 2 -> balance = withdraw(balance);
                case 3 -> showBalance(balance);
                case 4 -> {
                    System.out.println("*****************************************");
                    System.out.println("Thank you for visiting THE BANK OF PRATIK");
                    System.out.println("*****************************************");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice !!");
            }
        }
    }

    static double deposit(double balance) {
        System.out.print("Enter amount to Deposit: ");
        double amount = sc.nextDouble();

        if (amount <= 0) {
            System.out.println("Invalid amount !");
        } else {
            balance += amount;
            System.out.println("Amount Deposited Successfully!");
        }
        return balance;
    }

    static double withdraw(double balance) {
        System.out.print("Enter amount to Withdraw: ");
        double amount = sc.nextDouble();
        if (amount > balance) {
            System.out.println("### In-sufficient Balance ####");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        }
        return balance;
    }

    static void showBalance(double balance) {
        System.out.println("``````````````````````````");
        System.out.println(" Available balance:" + balance);
        System.out.println("``````````````````````````");
    }
}