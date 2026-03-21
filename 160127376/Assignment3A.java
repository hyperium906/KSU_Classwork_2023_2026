
/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Assignment: 3A
*/
import java.util.Scanner;
public class Assignment3A {
    public static void main(String[] args) {
        System.out.println("[Cretaceous Park GIS]");
        float x;
        System.out.print("X Coordinate: ");
        Scanner sc = new Scanner(System.in);
        x = sc.nextFloat();
        float y;
        System.out.print("Y Coordinate: ");
        y = sc.nextFloat();

        if (x >=5 && x<=8 && y<=2 && y>=0) {
            System.out.println("You are at the Pterodactyl Aviary");}
        else if (x>=2 && x<=4 && y>=2 && y<=6) {
            System.out.println("You are at the T. Rex Lake");}
        else if  (x >=6 && x<=8 && y>=2 && y<=4){
            System.out.println("You are at the Visitor’s Center");}
        else if  (x >=6 && x<=8 && y>=5 && y<=8){
            System.out.println("You are at the Deinonychus Pen");}
        else if  (x >=0 && x<=8 && y>=0 && y<=8 ){
            System.out.println("You are at the Triceratops Grasslands");}
        else System.out.println("WARNING: You have left the boundaries of the park.\nPlease return immediately");


        }


    }
