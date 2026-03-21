import java.util.Scanner;
public class Lab11B {
    public static boolean length(String length){
        if (length.length()>=8){
            return true;
        }
        return false;
    }
    public static boolean upperCase(String length){
        for (int i = 0; i<length.length(); i++){
            char letter = length.charAt(i);
            if (letter>=65&&letter<=90){
                return true;
            }
        }
        return false;

    }
    public static boolean number (String length){
        for (int i = 0; i<length.length(); i++){
            char letter = length.charAt(i);
            if (letter>=48&&letter<=57){
                return true;
            }
        }
        return false;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String u1;
        System.out.print("Enter a password: ");
        u1 = sc.nextLine();
        boolean isValid = length(u1) && upperCase(u1)&& number(u1);


        if (isValid == true){
            System.out.println("Valid Password");
        }
        else {
            System.out.println("Invalid Password");

        }

        System.out.println(" ");
        System.out.println("Program Ends");


    }
}
