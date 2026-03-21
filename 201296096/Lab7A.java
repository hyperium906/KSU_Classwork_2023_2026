
import java.util.Scanner;
public class Lab7A {
    public static int  recursive_multiply(int u1, int u2){
        if(u2==0){
            return 0;

        }
        else {
            u2--;
            int result =  u1 + recursive_multiply(u1,u2);
            return result;
        }
    }
    public static int  recursive_div(int u1, int u2){
        int result=1;
        if(u2==0){
            return -1;
        }
        else if (u2==u1) {
            return 1;
        }
        else if (u1<u2) {
            return 0;
        }
        else {
            u1-=u2;
            result += recursive_div(u1,u2);
            return result;
        }
    }
    public static int recursive_mod(int u1, int u2){
        if(u2==0){
            return -1;
        }
        else if (u2==u1) {
            return 0;
        }
        else if (u1<u2) {
            return u1;
        }
        else {
            u1-=u2;
            int result = 0 ;
            result = recursive_mod(u1,u2);
            return result;
        }
    }
    public static void printMenu(){
        System.out.println("Choose from the following:\n" +
                "0. Quit\n" +
                "1. Multiply 2 numbers\n" +
                "2. Div 2 numbers\n" +
                "3. Mod 2 numbers");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int u1;
        //u1 = sc.nextInt();
        do {
            printMenu();
            u1 = sc.nextInt();
            switch (u1) {
                case 0:
                    quit = true;
                break;
                case 1:
                    System.out.println("Enter first number: ");
                    u1 = sc.nextInt();
                    System.out.println("Enter second number: ");
                    int u2 = sc.nextInt();
                    int f = recursive_multiply(u1,u2);
                    System.out.println("Answer: "+f);
                break;
                case 2:
                    System.out.println("Enter first number: ");
                    u1 = sc.nextInt();
                    System.out.println("Enter second number: ");
                    u2 = sc.nextInt();
                    f = recursive_div(u1,u2);
                    System.out.println("Answer: "+ f);
                break;
                case 3:
                    System.out.println("Enter first number: ");
                    u1 = sc.nextInt();
                    System.out.println("Enter second number: ");
                    u2 = sc.nextInt();
                    f = recursive_mod(u1,u2);
                    System.out.println("Answer: "+f);
                break;
            }
        }while(quit==false);
    }
}
