import java.util.HashMap;
import java.util.Random;

public class Bank {

    // chose these numbers to ensure that the account number is 8 digits
    private static long NEXT_ACCOUNT_NUM = 100000000;
    protected HashMap<String, Account> accounts;

    public Bank() {
        this.accounts = new HashMap<>();
    }

    /**
     *
     * @param accountHolderName
     * @param initialDeposit
     */
    public void createAccount(String accountHolderName, double initialDeposit) {
        String accountNumber = NEXT_ACCOUNT_NUM + "";
        NEXT_ACCOUNT_NUM++;
        Account account = new Account(accountHolderName, accountNumber, initialDeposit);
        accounts.put(accountNumber, account);
    }

    /**
     *
     * @param accountNumber
     * @return
     */
    public Account findAccount(String accountNumber) {
        return accounts.get(accountNumber);
    }

    /**
     *
     * @param accountNumber
     * @param amount
     */
    public void deposit(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        account.deposit(amount);
    }

    /**
     *
     * @param accountNumber
     * @param amount
     */
    public void withdraw(String accountNumber, double amount) {
        Account account = findAccount(accountNumber);
        account.withdraw(amount);
    }

    /**
     *
     * @param accountNumber
     */
    public void getBalance(String accountNumber) {
        Account account = findAccount(accountNumber);
        account.getBalance();
    }

}
