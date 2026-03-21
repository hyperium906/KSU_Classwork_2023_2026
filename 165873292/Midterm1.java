import java.util.Scanner;
public class Midterm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Multi-Converter]");
        float f1;
        System.out.print("Enter a value in Fahrenheit: ");
        f1 =sc.nextFloat();
        System.out.println(" ");
        float Kel = (float) ((f1- 32) * 5/9 + 273.15);
        int kel = (int) Kel;
        System.out.println(f1+ " is approximately "+ Kel+ " in Kelvin");
        System.out.println("If we cast it to an int, it becomes "+kel+"K.");
        float u2;
        System.out.println(" ");

        System.out.print("What would you like to change this by? ");
        u2 = sc.nextFloat();
        System.out.println(" ");
        int newKel = (int) (kel+(u2));
        System.out.println(" ");
        System.out.println("We now have "+ newKel+"K");
        float NewF= (float) ((newKel-273.15)*9/5+32);
        System.out.println(newKel+"K is approximately "+NewF+" in Fahrenheit");





    }
}
