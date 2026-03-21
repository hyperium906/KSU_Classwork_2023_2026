import java.util.Scanner;
public class Lab10A {
    public static int min (int num1,int num2)
    {
        int minimum = 0;
        if (num1 < num2) {
            minimum = num1;
        }
        else if (num2 < num1) {
            minimum = num2;
        }
        return minimum;

    }
    public static int max (int num1,int num2){
        int maximum = 0;
        if (num1 > num2) {
            maximum = num1;
        }
        else if (num2 > num1) {
            maximum = num2;
        }
        return maximum;

    }
    public static float average (int num1,int num2){
        float av = 0;
        av =(float) (num1+num2)/2;
        return av;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u1,u2 = 0;
        System.out.print("Enter number 1: ");
        u1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        u2 = sc.nextInt();

        min(u1,u2);
        max(u1,u2);
        average(u1,u2);
        System.out.println("Min is "+min(u1,u2));
        System.out.println("Max is "+max(u1,u2));
        System.out.println("Average is "+average(u1,u2));





    }
}
