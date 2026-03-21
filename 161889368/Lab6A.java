/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Lab: 6A
*/

import java.util.Scanner;
public class Lab6A {
    public static void main(String[] args) {
        System.out.println("Please enter 10 numbers and this program will display the largest.");
        System.out.println("");
        int sum = 0;
        int u1;
        for (int i = 1; i <= 10; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter number "+i+" : ");
            u1 = sc.nextInt();
            //sum += i;
            if(u1>sum){
                sum = u1;
            }

        }
        System.out.println("\nThe largest number was "+ sum);




    }
}
