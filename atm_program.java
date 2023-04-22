import java.util.Scanner;

public class atm_program {
    private static final int PIN = 8094; 
    private static double balance = 10000;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your PIN: ");
        int pin = scanner.nextInt();

        if (pin == PIN) { 
            System.out.println("Your balance is $" + balance);
            System.out.println("What would you like to do?");
            System.out.println("1. Reset PIN");
            System.out.println("2. Transfer money");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter your new PIN: ");
                    int newPin = scanner.nextInt();
                    pin= newPin;
                    System.out.println("Your PIN has been updated.");
                    break;
                case 2:
                    System.out.print("Enter the amount you want to transfer: ");
                    double amount = scanner.nextDouble();
                    if (amount > balance) {
                        System.out.println("You do not have enough balance to transfer.");
                    } else {
                        System.out.print("Enter the recipient's account number: ");
                        String accountNumber = scanner.next();
                        balance -= amount; 
                        System.out.println("Your new balance is $" + balance);
                        System.out.println("$" + amount + " has been transferred to account number " + accountNumber);
                    }
                    break;
                case 3:
                    System.out.println("Thank you for using our ATM.");
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } else {
            System.out.println("Invalid PIN.");
        }
    }
}
