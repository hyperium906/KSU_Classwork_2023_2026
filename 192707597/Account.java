public class Account {
    private int accountNumber;
    private static int nextAccountNumber = 10001;
    private double  accountBalance;
    public Account(){
        accountNumber=nextAccountNumber;
        nextAccountNumber++;
        accountBalance = 0;

    }
    public Account(float u1){
        accountBalance = u1;
        accountNumber=nextAccountNumber;
        nextAccountNumber++;
        accountBalance = 0;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public static void setNextAccountNumber(int nextAccountNumber) {
        Account.nextAccountNumber = nextAccountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public static int getNextAccountNumber() {
        return nextAccountNumber;
    }
    public void withdrawal(double u1){
       double u2 = getAccountBalance();
       double u3 = u2-u1;
       setAccountBalance(u3);
    }
    public void deposit (double u1){
        double u2 = getAccountBalance();
        double u3 = u2+u1;
        setAccountBalance(u3);


    }
}
