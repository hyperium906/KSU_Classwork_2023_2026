/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Lab#: 4A
*/

import java.util.Scanner;
public class Lab4A {
    public static void main(String[] args) {
        double firstGrade;
        System.out.println("Enter the score of your exam:");
        Scanner sc = new Scanner(System.in);
        firstGrade = sc.nextDouble();

        if (firstGrade >= 98){
            System.out.println("Letter grade is: A+ ");
        } else if (firstGrade>=95){
            System.out.println("Letter grade is: A ");
        } else if (firstGrade>=92){
            System.out.println("Letter grade is: A-");
        } else if (firstGrade>=89){
            System.out.println("Letter grade is: B+ ");
        } else if (firstGrade>=86) {
            System.out.println("Letter grade is: B");
        } else if (firstGrade>=83){
            System.out.println("Letter grade is: B- ");
        } else if (firstGrade>=80) {
            System.out.println("Letter grade is: C+ ");
        } else if (firstGrade>=77) {
            System.out.println("Letter grade is: C ");
        } else if (firstGrade>=74) {
            System.out.println("Letter grade is: C- ");
        } else if (firstGrade>=71) {
            System.out.println("Letter grade is: D+ ");
        } else if (firstGrade>=68) {
            System.out.println("Letter grade is: D ");
        }else if (firstGrade>=65) {
            System.out.println("Letter grade is: D- ");
        }else if (firstGrade>=0) {
            System.out.println("Letter grade is: F ");
        }

    }
}
