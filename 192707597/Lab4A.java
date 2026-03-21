import java.util.Scanner;
public class Lab4A {
    public static void printMenu(){
        System.out.println("1. Withdraw from Checking\n" +
                "2. Withdraw from Savings\n" +
                "3. Deposit to Checking\n" +
                "4. Deposit to Savings\n" +
                "5. Balance of Checking\n" +
                "6. Balance of Savings\n" +
                "7. Award Interest to Savings now\n" +
                "8. Quit");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        Checking C1 = new Checking();
        Savings S1 = new Savings();
        int u1;
        float u2;
        do {
            printMenu();
            u1 = sc.nextInt();
            switch (u1){
                case 1:
                System.out.println("How much would you like to withdraw from Checking?");
                u2 = sc.nextFloat();
                C1.withdrawal(u2);
                break;
                case 2:
                System.out.println("How much would you like to withdraw from Savings?");
                u2 = sc.nextFloat();
                S1.withdrawal(u2);
                break;
                case 3:
                System.out.println("How much would you like to deposit into Checking?");
                u2 = sc.nextFloat();
                C1.deposit(u2);
                System.out.println("Doing default deposit");
                break;
                case 4:
                System.out.println("How much would you like to deposit into Savings?");
                u2 = sc.nextFloat();
                S1.deposit(u2);
                break;
                case 5:
                System.out.println("Your balance for checking "+C1.getAccountNumber()+" is "+ C1.getAccountBalance());
                break;
                case 6:
                System.out.println("Your balance for savings "+S1.getAccountNumber()+ " is "+ S1.getAccountBalance());
                break;
                case 7:
                    S1.interest();
                break;
                case 8:
                    quit = true;
                break;



            }

        }while (quit==false);


    }
}
