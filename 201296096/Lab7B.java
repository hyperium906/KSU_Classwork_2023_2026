import java.util.Scanner;

public class Lab7B {
    public static String repeatNTimes(String u1, int u2){
        String n = u1;
        if(u2==0){
            return "";
        }
        else {
            u2--;
            n += "\n"+repeatNTimes(u1, u2);
            return (n);
        }

    }
    public static boolean isReverse(String string1, String string2){
        if (string1.length() != string2.length())
        {
            return false;
        }
        else if (string1.length() == 0 && string2.length() == 0)
        {
            return true;
        }
        else
        {
            return (string1.charAt(0) == string2.charAt(string2.length()-1)) &&
                    isReverse(string1.substring(1), string2.substring(0, string2.length()-1));
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = repeatNTimes("I must study recursion until it makes sense",100);
        System.out.println(n);
        //System.out.println(" ");
        System.out.println("Enter the first string");
        String u1 = sc.nextLine();
        System.out.println("Enter the second string");
        String u2 = sc.nextLine();
        if(isReverse(u1,u2)==true){
            System.out.println(u1+" is the reverse of "+ u2);
        }
        else {
            System.out.println(u1+" is not the reverse of "+ u2);
        }

    }
}
