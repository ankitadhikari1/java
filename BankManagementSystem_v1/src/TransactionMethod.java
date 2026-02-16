public interface TransactionMethod {

    void addMoney(User user, int amount);

    void withdrawMoney(User user, int amount);
}