import java.util.Scanner;

/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Lab#: 7C
*/
public class Lab7C {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int u1;
            System.out.print("Please enter a value for the size: ");
            u1 = sc.nextInt();
            System.out.println("This is the requested "+ u1+"x"+u1+ " right-triangle:");
            int u2 =u1;
            String star="";
            for (int r = 1; r<=u1; r++)
            {
                for (int c = 1; c <u2; c++) {
                    System.out.print(" ");
                }
                u2--;
                star+="*";
                System.out.println(star);
                //System.out.println(" ");
            }
        }
    }

