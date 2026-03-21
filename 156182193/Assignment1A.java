import java.util.Scanner;
/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Assignment: 1A
*/
public class Assignment1A {
    public static void main (String[] args) {
        int userInput;
        System.out.print ("Please enter a Red value between 0-255:");
        Scanner sc = new Scanner (System.in);
        userInput = sc.nextInt();


        int userInput2;
        System.out.print ("Please enter a Green value between 0-255:");
        Scanner sc2 = new Scanner (System.in);
        userInput2 = sc2.nextInt();



        int userInput1;
        System.out.print ("Please enter a Blue value between 0-255:");
        Scanner sc1 = new Scanner (System.in);
        userInput1 = sc1.nextInt();



        var invertred = 255 - userInput;
        var invertblue = 255 - userInput1;
        var invertgreen = 255 - userInput2;

        System.out.println ("The inverted color is red="+invertred+", "+"green="+invertgreen+", "+"blue="+invertblue);

        double floatingpoint1 = invertred / (double) 255;
        double floatingpoint2 = invertgreen / (double) 255;
        double floatingpoint3 = invertblue / (double) 255;

        System.out.println ("With floating points, that would be red="+floatingpoint1+", "+"green="+floatingpoint2+", "+"blue="+floatingpoint3);





    }
}
