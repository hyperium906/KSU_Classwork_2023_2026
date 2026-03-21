import java.util.Scanner;
public class myCollection {
    public static void main(String[] args) {
        String u1,u3;
        int u2;
        long u4;
        Scanner sc = new Scanner(System.in);
        Item[] array = new Item [5];
        Item i;

        int counter = 0;

        do {
            System.out.println("Please enter B for Book or P for Periodical");
            u1 = sc.nextLine();
            switch (u1){
                case "B":
                    System.out.println("Please enter the name of the Book");
                    u1 = sc.nextLine();
                    System.out.println("Please enter the author of the Book");
                    u3 = sc.nextLine();
                    System.out.println("Please enter the ISBN of the Book");
                    u4 = sc.nextLong();
                    sc.nextLine();
                    Item b1 = new Book (u4, u3, u1);
                    array[counter] = b1;
                    counter++;
                break;
                case "P":
                    System.out.println("Please enter the name of Periodical");
                    u1 = sc.nextLine();
                    System.out.println("Please enter the issue number");
                    u2 = sc.nextInt();
                    sc.nextLine();
                    Item p1 = new Periodical(u2,u1);
                    array[counter] = p1;
                    counter++;
            }
        }while (counter<5);

        System.out.println("Your Items:");
        for (Item u123: array) {
            System.out.println(u123.getListing());
            System.out.println(" ");
        }



    }
}
