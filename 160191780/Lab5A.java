/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Lab#: 5A
*/
import java.util.Scanner;
public class Lab5A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char input1, input2;
        System.out.print("Do you have a driving permit (Y/N)?");
        input1 = sc.next().charAt(0);


        if (input1=='y'|| input1== 'Y') {
            System.out.print(" Do you have a commercial driving license (Y/N)? ");
            input2 = sc.next().charAt(0);
            //input2 = input2.toLowerCase();
            if (input2=='y'|| input2=='Y') {
                System.out.println("Congratulations! You can purchase a vehicle, let's start talking options!");
            } else {
                System.out.println("Commercial driving license is a prerequisite to purchase a vehicle!");
            }
        } else{System.out.print("Driving permit is a prerequisite to purchase a vehicle! ");

        }
    }}
