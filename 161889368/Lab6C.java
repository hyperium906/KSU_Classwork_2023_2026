import java.util.Scanner;

public class Lab6C {
    public static void main(String[] args) {
        System.out.println("Welcome! \nYou have $1000 in your account. ");
        boolean quit = false;
        int account = 1000;
        do {
            System.out.println("\nMenu \n0 – Make a deposit \n1 – Make a withdrawal \n2 – Display account value ");

            Scanner sc = new Scanner(System.in);
            System.out.print("\nPlease make a selection: ");
            int u1 = sc.nextInt();
            switch(u1){
                case 0:
                    System.out.print("How much would you like to deposit? : ");
                    int u2 = sc.nextInt();
                    account += u2;
                    System.out.println("Your current balance is $"+ account);
                    System.out.print("Would you like to return to the main menu (Y/N)? : ");
                    String YN = sc.next();
                    if(YN.equalsIgnoreCase("n")) {
                        quit = true;
                    }
                    sc.nextLine();
                    break;

                case 1:
                     System.out.print("How much would you like to withdraw? : ");
                     u2 = sc.nextInt();
                     account -= u2;
                     System.out.println("Your current balance is $"+ account);
                     System.out.println("Would you like to return to the main menu (Y/N)? : ");
                     YN = sc.next();
                         if(YN.equalsIgnoreCase("n")) {
                         quit = true;
                         break;
                     }

                        break;

                case 2:
                    System.out.println("Your current balance is $" + account);
                    System.out.println("Would you like to return to the main menu (Y/N)? : ");
                    YN = sc.next();
                        if(YN.equalsIgnoreCase("n")) {
                        quit = true;
                    }

                        break;

                default:
                    System.out.println("Invalid entry, please try again. ");
                    System.out.println("Would you like to return to the main menu (Y/N)? : ");
                    YN = sc.next();
                    if(YN.equalsIgnoreCase("N")) {quit = true;}

            }

        } while(quit == false);
        System.out.println("Thank you for banking with us!");
    }
}
