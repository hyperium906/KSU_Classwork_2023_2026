/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Lab: 6B
*/
import java.util.Random;
import java.util.Scanner;

public class Lab6B {
    public static void main(String[] args) {
        boolean quit = false;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 and 1000");
        int u1 = sc.nextInt();
        int counter = 0;

        while(quit==false){
            int comp = rand.nextInt(1001);
            System.out.println("My guess was "+ comp);
            counter++;
            if(comp==u1){
                System.out.println("I guessed the number was "+ comp + " and it only took me "+ counter + " guesses");
                quit = true;
            }


        }


    }
}
