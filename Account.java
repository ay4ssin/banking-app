import java.util.HashMap;

public class Account extends Bank {
    String accountNumber;
    String accountHolderName;
    double balance;

    // constructor

    public Account(String accountHolderName, String accountNumber, double accountBalance) {
        super();
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = accountBalance;
    }

    // getters

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolderName() {
        return this.accountHolderName;
    }

    protected double getBalance() {
        return this.balance;
    }

    //setters

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }


    public void setBalance(long accountBalance) {
        this.balance = accountBalance;
    }

    /**
     * Allows the customer to deposit money into the account
     * @param amount amount to be deposited
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Allows the customer to withdraw money from the account
     * @param amount amount to be deposited
     */
    public void withdraw(double amount) {
        balance -= amount;
    }

    /**
     * gets the accounts balance
     * @return balance as a formatted string
     */
    public String getAccountBalance() {
        String balanceFormatted = String.format("%.2f", balance);
        return balanceFormatted;
    }

    /**
     * tostring method
     * @return a formatted string for the account
     */
    @Override
    public String toString() {
        return "";
    }
}
