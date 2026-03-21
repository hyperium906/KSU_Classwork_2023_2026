/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Lab#: 4C
*/
import java.util.Scanner;
public class Lab4C {
    public static void main(String[] args) {
        System.out.println("Welcome!");
        float userNumber;
        System.out.println("Please input a number:");
        Scanner sc = new Scanner(System.in);
        userNumber = sc.nextInt();

        System.out.println("What would you like to do to this number: \n0) Get the additive inverse of the number \n1) Get the reciprocal of the number" +
                "\n2) Square the number" + " \n3) Cube the number" + " \n4) Exit the program");
        System.out.println(" ");
        int userNumber2;
        userNumber2 = sc.nextInt();

        float reci = (float) 1/userNumber;
        float cube = (float) (userNumber*userNumber*userNumber);


        switch (userNumber2){
            case 1: System.out.println("\nThe reciprocal of "+userNumber+ " is "+ reci );
            break;
            case 0: System.out.println("\nThe additive inverse of "+ userNumber +" is "+ -1*(userNumber));
            break;
            case 2: System.out.println("\nThe square of "+userNumber+" is "+ (userNumber*userNumber));
            break;
            case 3: System.out.println("\nThe cube of "+ userNumber + " is "+ cube);
            break;
            case 4: System.out.println("\nThank you, goodbye!");
            break;
            default: System.out.println("\nInvalid input, please try again!");
        }






    }
}
