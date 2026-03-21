/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Lab#: 4B
*/
import java.io.StringBufferInputStream;
import java.io.StringReader;
import java.util.Scanner;
public class Lab4B {
    public static void main(String[] args) {
        String day;
        System.out.println("Enter the day: ");
        Scanner sc = new Scanner(System.in);
        day = sc.nextLine();
    switch (day){
        case "Monday","monday":
        case "Wednesday","wednesday":
            System.out.println("I have class today! ");
            break;
        case "Friday","friday":
            System.out.println("It's Friday! Friday! Gotta get down on Friday!");
            break;
        case "Tuesday","tuesday":
        case "Thursday","thursday":
        case "Saturday","saturday":
        case "Sunday","sunday":
            System.out.println("I should use this time to do my homework." );
            break;



    }
    }
}




