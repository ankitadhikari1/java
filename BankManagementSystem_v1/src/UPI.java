import java.time.LocalDateTime;

public class UPI implements TransactionMethod {

    @Override
    public void addMoney(User user, int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }

        user.setAmount(user.getAmount() + amount);
        SBI.addAmountToBank(amount);

        System.out.println("₹" + amount + " deposited through UPI at " + LocalDateTime.now());
    }

    @Override
    public void withdrawMoney(User user, int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }

        if (amount > user.getAmount()) {
            System.out.println("Insufficient balance");
            return;
        }

        user.setAmount(user.getAmount() - amount);
        SBI.debitAmountToBank(amount);

        System.out.println("₹" + amount + " withdrawn through UPI at " + LocalDateTime.now());
    }
}