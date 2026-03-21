import java.util.Scanner;
/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Lab#: 3B
*/

class Lab3B {
  public static void main(String[] args) {
    
    float C1;
        System.out.print("Course 1 hours:");
        Scanner sc = new Scanner (System.in);
        C1 = sc.nextFloat();
    
    float H1;
        System.out.print("Grade for course 1:");
        H1 = sc.nextFloat();
    
   float C2;
        System.out.print("Course 2 hours:");
        C2 = sc.nextFloat();
    
  float H2;
        System.out.print("Grade for course 2:");
        H2 = sc.nextFloat();
    
  float C3;
        System.out.print("Course 3 hours:");
        C3 = sc.nextFloat();
    
  float H3;
        System.out.print("Grade for course 3:");
        H3 = sc.nextFloat();
    
        float C4;
        System.out.print("Course 4 hours:");
        C4 = sc.nextFloat();
    
        float H4;
        System.out.print("Grade for course 4:");
        H4 = sc.nextFloat();

    float totalHours = H1+H2+H3+H4;
    System.out.print("Total hours is: "+totalHours);

    float totalQual = (H1*C1)+(H2*C2)+(H3*C3)+(H4*C4);
    System.out.println("Total quality points is: "+ totalQual);

    float gpa = totalQual/totalHours;
    System.out.println("Your GPA for this semester is: "+ gpa);
   

    
    
  }
}