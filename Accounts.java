package bd.edu.diu;

public class Accounts {
    private int accountNo;
    private String title;
    private double balance;

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Accounts(int accountNo, String title) {
        this.accountNo = accountNo;
        this.title = title;
    }

    public Accounts() {
        // TODO Auto-generated constructor stub
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdrawn(double amount) {
        this.balance -= amount;
    }

    public void showBalance() {
        System.out.println("Account No: +accountNO");
        System.out.println("Title: " + title);
        System.out.println("Balance : " + balance);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        Accounts accounts = new Accounts();
        accounts.showBalance();
        accounts.setAccountNo(1001);
        accounts.setTitle("test");
        accounts.showBalance();
        accounts.deposit(5000);
        accounts.showBalance();
        accounts.withdrawn(50000);
        accounts.showBalance();
    }
}
