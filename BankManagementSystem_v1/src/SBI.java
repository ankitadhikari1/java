import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SBI {

    private static Map<Integer, User> users = new HashMap<>();
    private static int totalBankAmount = 0;
    private static int counter = 1000;

    public static synchronized void addAmountToBank(int amount) {
        totalBankAmount += amount;
    }

    public static synchronized void debitAmountToBank(int amount) {
        totalBankAmount -= amount;
    }

    public static int getTotalBankAmount() {
        return totalBankAmount;
    }

    public void addUser(Scanner sc) {

        sc.nextLine();
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your pin:");
        int pin = sc.nextInt();

        int accountNumber = counter++;

        User user = new User(name, accountNumber, pin, 0.0);
        users.put(accountNumber, user);

        System.out.println("User added successfully");
        user.getDetails();
    }

    private TransactionMethod getMethod(int choice) {
        switch (choice) {
            case 1:
                return new ATM();
            case 2:
                return new UPI();
            default:
                return null;
        }
    }

    private User authenticateUser(Scanner sc) {

        System.out.println("Enter account number:");
        int accountNum = sc.nextInt();

        User user = users.get(accountNum);

        if (user == null) {
            System.out.println("Account not found");
            return null;
        }

        System.out.println("Enter your pin:");
        int pin = sc.nextInt();

        if (!user.validate(pin)) {
            System.out.println("Invalid pin");
            return null;
        }

        return user;
    }

    public void addAmount(Scanner sc) {

        User user = authenticateUser(sc);
        if (user == null) return;

        System.out.println("Enter amount:");
        int amount = sc.nextInt();

        System.out.println("1. ATM");
        System.out.println("2. UPI");
        int choice = sc.nextInt();

        TransactionMethod method = getMethod(choice);

        if (method == null) {
            System.out.println("Invalid method");
            return;
        }

        method.addMoney(user, amount);
    }

    public void withdrawAmount(Scanner sc) {

        User user = authenticateUser(sc);
        if (user == null) return;

        System.out.println("Enter amount:");
        int amount = sc.nextInt();

        System.out.println("1. ATM");
        System.out.println("2. UPI");
        int choice = sc.nextInt();

        TransactionMethod method = getMethod(choice);

        if (method == null) {
            System.out.println("Invalid method");
            return;
        }

        method.withdrawMoney(user, amount);
    }

    public void checkBalance(Scanner sc) {

        User user = authenticateUser(sc);
        if (user == null) return;

        System.out.println("Balance: ₹" + user.getAmount());
    }

    public void getDetails(Scanner sc) {

        User user = authenticateUser(sc);
        if (user == null) return;

        user.getDetails();
    }
}