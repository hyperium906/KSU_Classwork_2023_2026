import java.util.Scanner;
public class Assingment1B {
    /*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Assignment: 1B
*/
    public static void main(String[] args) {
        String userInput;
        System.out.println("What're you buying?");
        Scanner sc = new Scanner (System.in);
        userInput = sc.nextLine();

        int howmany;
        System.out.print("How Many?: ");

        Scanner sc2 = new Scanner (System.in);

        howmany = sc2.nextInt();

        double price;
        System.out.print("Price?: ");

        Scanner sc3 = new Scanner (System.in);

        price = sc3.nextDouble();

        String userInput2;
        System.out.println("Anything Else?");
        Scanner sc4 = new Scanner (System.in);
        userInput2 = sc.nextLine();

        int howmany2;
        System.out.print("How Many?: ");

        Scanner sc5 = new Scanner (System.in);

        howmany2 = sc2.nextInt();

        double price2;
        System.out.print("Price?: ");
        System.out.println("");
        Scanner sc6 = new Scanner (System.in);
        price2 = sc3.nextDouble();
        System.out.println("");


        System.out.println("Your List: ");
        System.out.println("---");

        System.out.println(userInput + " " + "("+ howmany+")");

        double finalprice = howmany * price;
        System.out.println("$" +price+ " " + "($"+finalprice+" " +"total"+")");
        System.out.println("");

        System.out.println(userInput2 + " " + "("+ howmany2+")");
        double finalprice2 =  howmany2 * price2;
        System.out.println("$" +price2+ " " + "($"+finalprice2+" " +"total"+")");
        double TotalCost = finalprice + finalprice2;
        System.out.println("");
        System.out.println("Total Cost:"+" "+"$"+ TotalCost);


        System.out.println("---");







    }

}
