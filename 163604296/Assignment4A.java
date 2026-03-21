
/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Assignment#: 4A
*/
import java.util.Scanner;
public class Assignment4A {
    public static void main(String[] args) {
        System.out.println("What loop do you want to use?");
        System.out.println("1) A loop that might run zero or more times");
        System.out.println("2) A loop that will always run at least once");
        System.out.println("3) A loop with a predetermined start and end");

        Scanner sc = new Scanner(System.in);
        int u1;
        System.out.print("Your choice: ");
        u1 =sc.nextInt();

        int u2;
        System.out.print("What’s your start number? ");
        u2=sc.nextInt();


        switch(u1){
            case 1:
                System.out.print("Counting: ");
                while(u2>=0){
                    System.out.print(u2+", ");
                    u2--;}
                break;
            case 2:
                System.out.print("Counting: ");
                do{System.out.print(u2+", ");
                    u2--;} while(u2>=0);
                break;
            case 3:
                int u3;
                System.out.print("What's your end number ");
                u3 = sc.nextInt();
                for (int c = u2; c>=u3; c--){
                System.out.print(c+", "); }
        }






    }
}
