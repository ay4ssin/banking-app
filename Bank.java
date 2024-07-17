import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * TODO: add validation for all inputs
 * TODO: add comments for all the methods
 */
public class Bank {

    // chose these numbers to ensure that the account number is 8 digits
    private static double STARTING_BALANCE = 0;
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
    public void createAccount(String accountHolderName) {
        String accountNumber = NEXT_ACCOUNT_NUM + "";
        NEXT_ACCOUNT_NUM++;
        Account account = new Account(accountHolderName, accountNumber, STARTING_BALANCE);
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
     * @return
     */
    public boolean accountExists(String accountNumber) {
        return accounts.containsKey(accountNumber);
    }

    /**
     *
     * @param name
     * @return
     */
    public boolean accountExistsByName (String name) {
        for (Map.Entry<String, Account> entry : accounts.entrySet()) {
            String key = entry.getKey();
            Account value = entry.getValue();
            if (value.getAccountHolderName().equals(name)) {
                return true;
            }
        }
        return false;
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
