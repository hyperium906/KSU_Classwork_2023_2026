import java.util.Scanner;
public class Midterm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Vending Machine Simulation]");
        float m1;
        System.out.print("Put your money into the machine! $ ");
        m1 = sc.nextFloat();
        System.out.print("  ");
        boolean quit = true;
        sc.nextLine();


        do {
            //sc.nextLine();
            System.out.println("Here's what you can buy:\n" +
                    "A) Bag of Computer Chips ($2)\n" +
                    "B) Infinite Loop Bar     ($1.50)");
            //sc.nextLine();
            String u1;
            System.out.println("Selection: ");
            u1 = sc.nextLine();

            if (u1.equalsIgnoreCase("a")){
                if (m1>=2){
                    System.out.print("Okay, you bought a Bag of Computer Chips!");
                    m1-=2;

                }
                else {

                    System.out.print("Sorry, you only have $"+m1+" left");
                }
            }
            if (u1.equalsIgnoreCase("b")){
                if (m1>=1.50){
                    System.out.print("Okay, you bought an Infinite Loop Bar!");
                    m1-=1.50;

                }
                else {

                    System.out.print("Sorry, you only have $"+m1+" left");
                    
                }
                sc.nextLine();
            }


            if (m1>=1.50){
                System.out.println("Do you want to buy anything else? ");
                u1 = sc.nextLine();
                if (u1.equalsIgnoreCase("y")){
                    quit=true;
                }

            }
            else {
                quit =false;
                System.out.println("Ending the Vending Machine simulation...");
            }

            if (u1.equalsIgnoreCase("quit")){
                quit = false;
                System.out.println("Ending the Vending Machine simulation...");
            }
        } while (quit==true);
        }
    }
