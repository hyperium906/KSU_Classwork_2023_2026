/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Assignment: 3C
*/
import java.util.Scanner;
public class Assignment3C {
    public static void main(String[] args) {
        System.out.println("[Cretaceous Park Dialog] \nOh no, the power has gone out at Cretaceous Park!");
        System.out.println("1) What does that mean?\n" + "2) No, I just turned the light off.");
        Scanner sc = new Scanner(System.in);
        String input =sc.nextLine();


        if(input.equals("What does that mean?")){
            System.out.println("The dinosaurs will get loose... again...");
            System.out.println("1) Life finds a way...\n" +
                    "2) What do we do?");
            String input2 =sc.nextLine();
            if(input2.equals("Life finds a way...")){
                System.out.println("That’s not helpful right now!");

            }
            System.out.println("We have to evacuate the park!");


        } else System.out.println("Oh thank goodness!");




    }
}
