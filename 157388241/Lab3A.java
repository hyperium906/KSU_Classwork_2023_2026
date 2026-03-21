import java.util.Scanner;
/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Lab#: 3A
*/



class Lab3A {

  
  public static void main(String[] args) {
    
   
    

    
     int firstNumber;
        System.out.print("Amount owed?");
        Scanner sc = new Scanner (System.in);
        firstNumber = sc.nextInt();

    
     float apr;
        System.out.print("APR:");
        //Scanner sc = new Scanner (System.in);
        apr = sc.nextFloat();
    
    float monthlyPay= (apr/12);
    String value2 = String.format("%.3f", monthlyPay);
    System.out.println("Monthly percentage rate: "+value2);

    float minPay = firstNumber*((apr/100)/12);

     String value = String.format("%.2f", minPay);

    System.out.println("Minimum payment: $"+ value);
  }
}