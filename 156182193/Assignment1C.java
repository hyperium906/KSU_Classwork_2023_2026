import java.util.Scanner;
/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Assignment: 1C
*/
public class Assignment1C {
    public  static void main(String[] args) {

        int day;
        System.out.print("Enter the day (number): ");

        Scanner sc = new Scanner (System.in);

        day = sc.nextInt();

        int month;
        System.out.print("Enter the month (number): ");

        Scanner sc1 = new Scanner (System.in);

        month = sc1.nextInt();


        String userInput;
        System.out.println("Enter the month (string):");
        Scanner sc2 = new Scanner (System.in);
        userInput = sc2.nextLine();


        int year;
        System.out.print("Enter the year (number): ");

        Scanner sc3 = new Scanner (System.in);

        year = sc3.nextInt();

        System.out.println("Here are some ways you can write the date:");
        System.out.println(day+"/"+month+"/"+year);
        System.out.println(year+"/"+month+"/"+day);
        System.out.println(month+"/"+day+"/"+year);
        System.out.println(userInput+" "+day+","+" "+year);
        System.out.println(day+" "+userInput+" "+year);












    }
}
