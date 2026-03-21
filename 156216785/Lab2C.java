import java.util.Scanner;

public class Lab2C {
    /*
 Class: CSE 1321L
 Section: J06
 Term: Spring 2023
 Instructor: Surya Praveen Adivi. and Malcolm, Douglas
 Name: Joshua Dupati
 Lab#: 2C
 */
    public static void main(String[] args) {
        int userInput;

        System.out.println("Enter a width:");

        Scanner sc = new Scanner(System.in);

        userInput = sc.nextInt();

        int userInput2;

        System.out.println("Enter a height:");

        //Scanner sc2 = new Scanner(System.in);

        userInput2 = sc.nextInt();

        int area = (userInput*userInput2);
        int perimeter = 2*(userInput+userInput2);
        System.out.println("The area is "+ area);
        System.out.println("The perimeter is "+ perimeter);

    }
}
