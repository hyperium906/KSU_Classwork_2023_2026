/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Lab#: 5C
*/
import java.util.Scanner;

public class Lab5C {
    public static void main(String[] args) {
        int x;
        System.out.print("Enter x:");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();

        int y;
        System.out.println("Enter y:");
        y = sc.nextInt();

        if (x==0 && y==0){
            System.out.println("This point is the origin. ");}
        else if (x>0 && y==0){
            System.out.println("This point is on the x axis.");}
        else if (x==0 && y>0){
            System.out.println("This point is on the y axis.");}
        else if (x>=1 && y>=1){
            System.out.println("This point is in the first quadrant.");}
        else if (x<=-1 && y>=1){
            System.out.println("This point is in the second quadrant.");}
        else if (x<=-1 && y<=-1){
            System.out.println("This point is in the third quadrant.");}
        else if (x>=1 && y<=-1){
            System.out.println("This point is in the fourth quadrant.");}




    }
}
