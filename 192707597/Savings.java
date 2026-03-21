public class Savings extends Account {
    private int depositCharge;
    private int nextdepositCharge =1;

    @Override
    public void setAccountBalance(double accountBalance) {
        super.setAccountBalance(accountBalance);
    }

    @Override
    public void withdrawal(double u1) {
        double u2 = getAccountBalance();
        double u3 = u2-u1;
        setAccountBalance(u3);
        if (getAccountBalance()<500){
             u3 -= 10;
            setAccountBalance(u3);
            System.out.println("Charging an overdraft fee of $10 because account is below $500");
        }


    }

    @Override
    public void deposit(double u1) {
       depositCharge = nextdepositCharge;
       nextdepositCharge++;
       //System.out.println("This is "+ depositCharge+" to this account");
       if (depositCharge>5){
           //double u2 = getAccountBalance();
           double u3 = u1-10;
           super.deposit(u3);
       }
       else {
           double u2 = getAccountBalance();
           double u3 = u2+u1;
           setAccountBalance(u3);
       }
       System.out.println("This is deposit number "+ depositCharge+" to this account");

        if (depositCharge>5){
            System.out.println("Charging a fee of $10");}

    }
    public void interest(){
       double u1 =  getAccountBalance();
       double u2 =  (u1/100)*1.5;
       setAccountBalance(u1+=u2);
       System.out.println("Customer earned "+u2 +" in interest.");
    }

}
