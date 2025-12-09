import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            BankAccount account = new BankAccount();
            
            System.out.println("Welcome to Nabil Bank Ltd.!");
            while (true) {
                System.out.print("Enter amount to deposit (or 0 to exit): ");
                if (!scanner.hasNextDouble()) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next(); // consume invalid token
                    continue;
                }
                double amount = scanner.nextDouble();
                
                if (amount == 0) {
                    System.out.println("Thank you for banking with us. Namaste!");
                    break;
                }
                
                try {
                    account.deposit(amount);
                    System.out.printf("Deposit successful. Current balance: %.2f%n", account.getBalance());
                } catch (CustomException e) {
                    System.out.println(e.getMessage() + "\n");
                }
            }
        }
    }
}
