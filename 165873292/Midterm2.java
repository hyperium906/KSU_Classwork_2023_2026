import java.util.Scanner;

public class Midterm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[Famous Card Hands]");
        System.out.println("Which famous card hand do you want to guess?\n" +
                "1) Dead Man's Hand\n" +
                "2) Maverick Hand");
        System.out.print("Card: ");
        int u1 ;
        u1 = sc.nextInt();
        int u2;
        String U1;
        String bruh = null;
        switch (u1){
            case 1:
                System.out.println(" ");
                System.out.println("We have Ace of Clubs, 8 of Spades, and 8 of Clubs. Which card is missing?");
                System.out.print("Value: ");
                u2 = sc.nextInt();
                sc.nextLine();
                System.out.print("Suite: ");
                U1 = sc.nextLine();

                System.out.println(" ");

                switch (u2){
                    case 1:
                         bruh = "1";
                    break;
                    case 2:
                        bruh = "2";
                    break;
                    case 3:
                        bruh = "3";
                    break;
                    case 4:
                        bruh = "4";
                    break;
                    case 5:
                        bruh = "5";
                    break;
                    case 6:
                        bruh = "6";
                    break;
                    case 7:
                        bruh = "7";
                    break;
                    case 8:
                        bruh ="8";
                    break;
                    case 9:
                        bruh = "9";
                    break;
                    case 10:
                        bruh = "Jack";
                    break;
                    case 11:
                        bruh = "Queen";
                    break;
                    case 12:
                        bruh=  "Kings";
                    break;
                    case 13:
                        bruh = "Ace";
                }
             if(u2 == 13 && U1.equalsIgnoreCase("spades")){
                 System.out.println(" ");
                 System.out.println("You guessed "+ bruh+" of "+ U1+".");
                 System.out.println("Correct!");

             }
             else {
                 System.out.println(" ");
                 System.out.println("You guessed "+ bruh+" of "+ U1+".");
                 System.out.println("Incorrect...");


             }
            break;
            case 2:
                System.out.println(" ");
                System.out.println("We have Queen of Spades, Jack of Hearts, Jack of Spades, and Jack of Clubs. Which card is missing?");
                System.out.print("Value: ");
                u2 = sc.nextInt();
                sc.nextLine();
                System.out.print("Suite: ");
                U1 = sc.nextLine();
                switch (u2){
                    case 1:
                        bruh = "1";
                        break;
                    case 2:
                        bruh = "2";
                        break;
                    case 3:
                        bruh = "3";
                        break;
                    case 4:
                        bruh = "4";
                        break;
                    case 5:
                        bruh = "5";
                        break;
                    case 6:
                        bruh = "6";
                        break;
                    case 7:
                        bruh = "7";
                        break;
                    case 8:
                        bruh ="8";
                        break;
                    case 9:
                        bruh = "9";
                        break;
                    case 10:
                        bruh = "Jack";
                        break;
                    case 11:
                        bruh = "Queen";
                        break;
                    case 12:
                        bruh=  "Kings";
                        break;
                    case 13:
                        bruh = "Ace";
                }
                if(u2 == 2 && U1.equalsIgnoreCase("diamonds")){
                    System.out.println(" ");
                    System.out.println("You guessed "+ bruh+" of "+ U1+".");
                    System.out.println("Correct!");

                }
                else {
                    System.out.println(" ");
                    System.out.println("You guessed "+ bruh+" of "+ U1+".");
                    System.out.println("Incorrect...");



        }
    }
}
}
