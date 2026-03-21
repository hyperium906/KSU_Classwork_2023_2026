import java.util.Scanner;
public class Lab2A { /*
 Class: CSE 1321L
 Section: J06
 Term: Spring 2023
 Instructor: Surya Praveen Adivi. and Malcolm, Douglas
 Name: Joshua Dupati
 Lab#: 2A
 */
    public static void main (String[] args) {
        String userInput;
        System.out.print("Enter a name:");
        Scanner sc = new Scanner (System.in);
        userInput = sc.nextLine();

        String userInput2;
        System.out.print("Enter another name:");
        //Scanner sc2 = new Scanner (System.in);
        userInput2 = sc.nextLine();

        String userInput3;
        System.out.print("Enter a verb:");
        //Scanner sc3 = new Scanner (System.in);
        userInput3 = sc.nextLine();

        String userInput4;
        System.out.print("Enter an adverb:");
        //Scanner sc4 = new Scanner (System.in);
        userInput4 = sc.nextLine();

        System.out.println("Once upon a time, there was a person named " +userInput+ " who had a child named " +
                 userInput2+ "."+ " This child would " + userInput3+" " + userInput4 + " while singing to strangers." );










    }
}
