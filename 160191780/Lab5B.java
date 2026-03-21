/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Lab#: 5B
*/
import java.util.Scanner;
public class Lab5B {
    public static void main(String[] args) {
        int input1;
        System.out.print("Enter an integer:");
        Scanner sc = new Scanner(System.in);
        input1 = sc.nextInt();
        int answer1 = (input1 % 2);
        switch (answer1) {
            case 0:
                System.out.println("This number is divisible by 2");
                break;
            case 1:
                if (input1 % 3 == 0) {
                    System.out.println("This number is divisible by 3");
                } else if (input1 % 5 == 0) {
                    System.out.println("This number is divisible by 5");}
                else System.out.println("This number is undetermined");
        }
    }
}


      /*  }
        if (input1%2==0){
            System.out.println("This number is divisible by 2");}
             else if(input1%3==0){
                 System.out.println("This number is divisible by 3");}
             else if (input1%5==0){
             System.out.println("This number is divisible by 5");}
        else {
            System.out.println("This number is undetermined");
        }*/



