import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;
public class Lab2A {
    public static void printMenu(){
        System.out.print("1. Sold One Milk\n" +
                "2. Sold One Bread\n" +
                "3. Change price of Milk\n" +
                "4. Change price of Bread\n" +
                "5. Add Milk to Inventory\n" +
                "6. Add Bread to Inventory\n" +
                "7. See Inventory\n" +
                "8. Quit");
        System.out.println(" ");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random df = new Random();
        StockItem Milk = new StockItem("1 Gallon of Milk",3.60,15);
        StockItem Bread = new StockItem("1 Loaf of Bread",1.98,30);
        boolean quit = false;
        do {
            printMenu();
            int u1;
            u1= sc.nextInt();

            switch(u1){
                case 1 :
                  Milk.setQuantity();
                  System.out.println(" ");
                break;
                case 2:
                    Bread.setQuantity();
                    System.out.println(" ");
                break;
                case 3:
                    double newPrice;
                    System.out.println("What is the new price for milk?");
                    newPrice = sc.nextDouble();
                    Milk.setPrice(newPrice);
                    System.out.println(" ");
                break;
                case 4:
                    double newPrice1;
                    System.out.println("What is the new price for bread?");
                    newPrice1 = sc.nextDouble();
                    Bread.setPrice(newPrice1);
                    System.out.println(" ");
                break;
                case 5:
                    int newInventory;
                    System.out.println("How many milk did we get?");
                    newInventory = sc.nextInt();
                    Milk.setQuantity(newInventory);
                    System.out.println(" ");
                break;
                case 6:
                    int newInventory1;
                    System.out.println("How many bread did we get?");
                    newInventory1 = sc.nextInt();
                    Bread.setQuantity(newInventory1);
                    System.out.println(" ");

                break;
                case 7:
                    System.out.println("Milk: "+Milk.toString());
                    System.out.println("Bread: "+ Bread.toString());
                    System.out.println(" ");
                break;
                case 8:
                    quit = true;
            }


        }while(quit==false);
        //Milk.printMenu();

    }
}
