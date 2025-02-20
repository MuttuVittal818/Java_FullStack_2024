package OOPs;

public class Enc_acc_mod {

        // Public variable (accessible everywhere)
        public String bankName = "xyz";

        // Private variable (accessible only within this class)
        private double balance;

        // Protected variable (accessible within this class, subclasses, and same package)
        protected String accountNumber;

        // Default (package-private) variable (accessible only within the same package)
        String accountHolderName;

        // Constructor to initialize the account
        public Enc_acc_mod(String accountNumber, String accountHolderName, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }

        // Public method to deposit money (accessible everywhere)
        public void deposit(double amount) {
            if (amount > 0) {
                balance += amount;
                System.out.println(amount + " deposited. New balance: " + balance);
            } else {
                System.out.println("Invalid deposit amount.");
            }
        }

        // Private method to calculate interest (accessible only within this class)
        private double calculateInterest(double rate) {
            return balance * rate / 100;
        }

        // Protected method to display account details (accessible within this class, subclasses, and same package)
        protected void displayAccountDetails() {
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: " + balance);
        }

        // Default (package-private) method to check balance (accessible only within the same package)
        void checkBalance() {
            System.out.println("Current Balance: " + balance);
        }
    }

