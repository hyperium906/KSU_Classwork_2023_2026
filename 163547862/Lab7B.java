/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Lab#: 7B
*/
import java.util.Scanner;

public class Lab7B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u1;
        System.out.print("Please enter a value for the size: ");
        u1 = sc.nextInt();
        System.out.println("This is the requested "+ u1+"x"+u1+ " right-triangle:");
        for (int r = 1; r<=u1; r++)
        {
            for (int c = 1; c <= r; c++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
