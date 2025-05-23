public class BankAccount {

    private double balance;

    public BankAccount(double initial) {
        this.balance = initial;
    }

    public void deposit(double amt) {
        if (amt > 0) balance += amt;
    }

    public boolean withdraw(double amt) {
        if (amt > 0 && balance >= amt) {
            balance -= amt;
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        BankAccount acct = new BankAccount(1000.0);
        acct.deposit(150.0);
        System.out.println(acct.getBalance());  
        System.out.println(acct.withdraw(850)); 
        System.out.println(acct.withdraw(430)); 
        System.out.println(acct.getBalance()); 
    }
}
 
