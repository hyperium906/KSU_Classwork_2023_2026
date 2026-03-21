public class Checking extends Account {
    Checking(){
        super();
    }
    @Override
    public void setAccountBalance(double accountBalance) {
        super.setAccountBalance(accountBalance);
    }

    @Override
    public void withdrawal(double u1) {
        double u2 = getAccountBalance();
        double u3 = u2-u1;
        setAccountBalance(u3);
        double u4 = getAccountBalance();
        if (u4<0){
            u3 -= 20;
            setAccountBalance(u3);
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
        }
        else {
            u3 = u2-u1;
            setAccountBalance(u3);
        }

    }
}
