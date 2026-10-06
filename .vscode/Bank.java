
//task 1
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double balance = 10000.0;
        int choice;

        do {
            System.out.println("ATM MENU ");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Current Balance: Rs. " + balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: Rs. ");
                    double depositAmount = sc.nextDouble();

                    if (depositAmount <= 0) {
                        System.out.println("Error: Deposit amount must be greater than zero.");
                    } else {
                        balance += depositAmount;
                        System.out.println("Successfully deposited Rs. " + depositAmount);
                        System.out.println("Updated Balance: Rs. " + balance);
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: Rs. ");
                    double withdrawAmount = sc.nextDouble();

                    if (withdrawAmount <= 0) {
                        System.out.println("error");
                    } else if (withdrawAmount > balance) {
                        System.out.println(" Insufficient balance! Available: Rs. "+ balance);
                    } else {
                        balance -= withdrawAmount;
                        System.out.println("Successfully withdrew Rs. " + withdrawAmount);
                        System.out.println("Updated Balance: Rs. " + balance);
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using the ATM");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);
        sc.close();
    }
}
