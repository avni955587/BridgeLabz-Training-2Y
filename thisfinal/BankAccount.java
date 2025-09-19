package thisfinal;

class BankAccountSystem {
    
    private static String bankName = "State Bank of India";
    private static int totalAccounts = 0;


    private final int accountNumber;

    private String accountHolderName;
    private double balance;

   
    BankAccountSystem(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;          
        this.accountHolderName = accountHolderName;  
        this.balance = balance;
        totalAccounts++; 
    }

    
    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

 
    public void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
        System.out.println("---------------------------");
    }
}

public class BankAccount {
    public static void main(String[] args) {
        // Creating account objects
        BankAccountSystem acc1 = new BankAccountSystem(101, "Avni", 5000.0);
        BankAccountSystem acc2 = new BankAccountSystem(102, "Rahul", 10000.0);

      
        if (acc1 instanceof BankAccountSystem) {
            acc1.displayDetails();
        }

        if (acc2 instanceof BankAccountSystem) {
            acc2.displayDetails();
        }

       
        BankAccountSystem.getTotalAccounts();
    }
}
