import java.util.Scanner;

public class BankApplicationSystem {

    public static void main(String[] args) {

        SBI bank = new SBI();
        Scanner sc = new Scanner(System.in);  

        System.out.println("Welcome to Bank");

        boolean flag = true;

        while (flag) {

            System.out.println("Enter what you want to do.....");
            System.out.println("-----------------------------------------------------");
            System.out.println("1. Register to bank");
            System.out.println("2. Add amount");
            System.out.println("3. Withdraw amount");
            System.out.println("4. Get balance");
            System.out.println("5. Get details");
            System.out.println("6. Get bank total amount");
            System.out.println("7. Quit");
            System.out.println("-----------------------------------------------------");

            int opt = sc.nextInt();

            switch (opt) {

                case 1:
                    bank.addUser(sc);
                    break;

                case 2:
                    bank.addAmount(sc);
                    break;

                case 3:
                    bank.withdrawAmount(sc);
                    break;

                case 4:
                    bank.checkBalance(sc);
                    break;

                case 5:
                    bank.getDetails(sc);
                    break;

                case 6:
                    System.out.println("Total Bank Amount: ₹" + SBI.getTotalBankAmount());
                    break;

                case 7:
                    System.out.println("Thank you");
                    flag = false;
                    break;

                default:
                    System.out.println("Invalid choice");
            }
        }

        sc.close();
    }
}