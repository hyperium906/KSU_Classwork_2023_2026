import java.util.Scanner;
/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Lab#: 3C
*/

class Lab3C {
  public static void main(String[] args) {
    int quarters;
        System.out.print("Enter the number of quarters:");
        Scanner sc = new Scanner (System.in);
        quarters = sc.nextInt();
    
    int dimes;
        System.out.print("Enter the number of dimes:");
        dimes = sc.nextInt();

   int nickel;
        System.out.print("Enter the number of nickels:");
        nickel= sc.nextInt();
    
    int pennies;
        System.out.println("Enter the number of pennies:");
        pennies= sc.nextInt();
    
    
    System.out.print("You entered "+ quarters+ " quarters." );
    System.out.print("You entered "+ dimes+ " dimes." );
    System.out.print("You entered "+ nickel+ " nickels." );
    System.out.print("You entered "+ pennies+ " pennies." );

    double totalCash = (quarters*.25)+(dimes*.10)+(nickel*.05)+(pennies*.01);
    double totalMoney = totalCash*100;
    int cents =(int)(totalMoney%100);
    int dolar = (int) totalMoney/100;

   
      
    


    System.out.print("Your total is "+dolar+ " dollars and " + cents+ " cents.");
    

    
  }
}