package bankOperations;

import java.util.HashMap;
import java.util.Map;

public class BankOperations {
    static class Account {
        private String accountId;
        private String userId;
        private double balance;

        public Account(String accountId, String userId, double balance) {
            this.accountId = accountId;
            this.userId = userId;
            this.balance = balance;
        }

        public String getAccountId() {
            return accountId;
        }

        public String getUserId() {
            return userId;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }
    }

    private Map<String, Account> accounts = new HashMap<>();

    public void addAccount(String accountId, String userId, double initialBalance) {
        if (accounts.containsKey(accountId)) {
            System.out.println("Account already exists with accountId: " + accountId);
            return;
        }
        Account newAccount = new Account(accountId, userId, initialBalance);
        accounts.put(accountId, newAccount);
        System.out.println("Account added: " + newAccount.getAccountId() + " for userId: " + userId);
    }

    public void transferMoney(String fromAccountId, String toAccountId, double amount) {
        if (!accounts.containsKey(fromAccountId)) {
            System.out.println("Source account not found: " + fromAccountId);
            return;
        }
        if (!accounts.containsKey(toAccountId)) {
            System.out.println("Destination account not found: " + toAccountId);
            return;
        }
        Account fromAccount = accounts.get(fromAccountId);
        Account toAccount = accounts.get(toAccountId);

        if (fromAccount.getBalance() < amount) {
            System.out.println("Insufficient balance in account: " + fromAccountId);
            return;
        }
        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);

        System.out.println("Transferred " + amount + " from " + fromAccountId + " to " + toAccountId);
        System.out.println("New balance of " + fromAccountId + ": " + fromAccount.getBalance());
        System.out.println("New balance of " + toAccountId + ": " + toAccount.getBalance());
    }

    public void transferBetweenTwoUsers(String fromUserId, String toUserId, double amount) {
        Account fromAccount = null;
        Account toAccount = null;

        // Find accounts for each user
        for (Account account : accounts.values()) {
            if (account.getUserId().equals(fromUserId)) {
                fromAccount = account;
            }
            if (account.getUserId().equals(toUserId)) {
                toAccount = account;
            }
            if (fromAccount != null && toAccount != null) {
                break;
            }
        }

        if (fromAccount == null) {
            System.out.println("No account found for userId: " + fromUserId);
            return;
        }
        if (toAccount == null) {
            System.out.println("No account found for userId: " + toUserId);
            return;
        }

        // Ensure sufficient balance for transfer
        if (fromAccount.getBalance() < amount) {
            System.out.println("Insufficient balance in account of userId: " + fromUserId);
            return;
        }

        fromAccount.setBalance(fromAccount.getBalance() - amount);
        toAccount.setBalance(toAccount.getBalance() + amount);

        System.out.println("Transferred " + amount + " from userId " + fromUserId + " to userId " + toUserId);
        System.out.println("New balance of account for userId " + fromUserId + ": " + fromAccount.getBalance());
        System.out.println("New balance of account for userId " + toUserId + ": " + toAccount.getBalance());
    }

    public void applyInterest(String accountId, double interestRate) {
        if (!accounts.containsKey(accountId)) {
            System.out.println("Account not found: " + accountId);
            return;
        }

        Account account = accounts.get(accountId);
        double interest = account.getBalance() * interestRate / 100;
        account.setBalance(account.getBalance() + interest);

        System.out.println("Applied interest to account " + accountId);
        System.out.println("Interest amount: " + interest);
        System.out.println("New balance: " + account.getBalance());
    }

    public static void main(String[] args) {
        BankOperations bankOps = new BankOperations();

        // Adding accounts
        bankOps.addAccount("A001", "U001", 1000);
        bankOps.addAccount("A002", "U002", 2000);

        // Transfer money between accounts
        bankOps.transferMoney("A001", "A002", 500);

        // Transfer money between users
        bankOps.transferBetweenTwoUsers("U001", "U003", 200);

        // Apply interest to an account
        bankOps.applyInterest("A001", 5);  // Applying 5% interest
    }
}
