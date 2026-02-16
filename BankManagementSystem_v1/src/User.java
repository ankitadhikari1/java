public class User {

    private String name;
    private int accountNumber;
    private int pin;
    private double amount;

    public User(String name, int accountNumber, int pin, double amount) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.pin = pin;
        this.amount = amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + amount);
    }
    
    
    public boolean validate(int pin) {
    	return this.pin == pin;
    }
}