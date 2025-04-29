abstract class Account{
    private long accountNumber;
    private double balance;
    abstract void deposit(double amount);
    abstract void withdrawal(double amount);

    public Account(long accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
class SavingsAccount extends Account{
    private double interestRate;

    public SavingsAccount(long accountNumber,double balance,double interestRate) {
        super(accountNumber,balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    void deposit(double amount){
        setBalance(getBalance()+amount);
        System.out.println(amount+" is deposited successfully");
        System.out.println("Now your interest rate for one year is: "+ ((getBalance()*getInterestRate())/100));
    }
    void withdrawal(double amount){
        if(getBalance()>amount){
           setBalance(getBalance()-amount);
           System.out.println(amount+" withdraw successful");
        }
        else
            System.out.println("insufficient Balance");
    }
}
class CurrentAccount extends Account{
    private double overDraftLimit;

    public CurrentAccount(long accountNumber, double balance, double overDraftLimit) {
        super(accountNumber, balance);
        this.overDraftLimit = overDraftLimit;
    }

    public double getOverDraftLimit() {
        return overDraftLimit;
    }

    public void setOverDraftLimit(double overDraftLimit) {
        this.overDraftLimit = overDraftLimit;
    }

    @Override
    void deposit(double amount) {
        setBalance(getBalance()+amount);
        System.out.println(amount+" is deposited successfully");
    }

    @Override
    void withdrawal(double amount) {
        if(getBalance()>amount){
           setOverDraftLimit(getOverDraftLimit()-amount);
           setBalance(getBalance()-amount);
           System.out.println(amount+" withdrawn successfully");
           System.out.println("You have now Over Draft Limit of rupees :"+getOverDraftLimit());
        }
        else
            System.out.println("insufficient Balance");
    }
}
public class Q8 {
    public static void main(String[] args) {
        SavingsAccount s1 = new SavingsAccount(646105784, 50000, 7.25);
        s1.deposit(10000);
        s1.withdrawal(5000);

        CurrentAccount c1 = new CurrentAccount(356421532, 1000000, 4000000);
        c1.withdrawal(500000);
        c1.deposit(2000000);
    }
}
