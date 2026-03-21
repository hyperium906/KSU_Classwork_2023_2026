import java.util.Scanner;
import java.util.Random;
class RoshamboPlayer {
    static Random myRandom = new Random();
    private static String PlayerName = " ";
    private static String Attack;
    private static int RoLimit;
    private static int ShamBoLimit;

    public RoshamboPlayer(String PlayerName, int RoLimit, int ShamBoLimit) {
        this.PlayerName = PlayerName;
        this.RoLimit = RoLimit;
        this.ShamBoLimit = ShamBoLimit;
    }

    public static boolean playRound(String play) {
        if (play.toLowerCase().equals(Attack.toLowerCase())) {
            return false;
        } else if (play.toLowerCase().equalsIgnoreCase("sham") && Attack.toLowerCase().equalsIgnoreCase("bo")) {
            return false;
        } else if (play.toLowerCase().equalsIgnoreCase("ro") && Attack.toLowerCase().equalsIgnoreCase("sham")) {
            return false;
        } else if (play.toLowerCase().equalsIgnoreCase("ro") && Attack.toLowerCase().equalsIgnoreCase("ro")) {
            return false;
        } else if (play.toLowerCase().equalsIgnoreCase("sham") && Attack.toLowerCase().equalsIgnoreCase("sham")) {
            return false;
        } else if (play.toLowerCase().equalsIgnoreCase("bo") && Attack.toLowerCase().equalsIgnoreCase("bo")) {
            return false;
        } else if (play.toLowerCase().equalsIgnoreCase("bo") && Attack.toLowerCase().equalsIgnoreCase("ro")) {
            return false;}
        else {
            return true;
        }
    }

    public static String getName() {
        return (PlayerName);
    }

    public static String getAttack() {
        int df = myRandom.nextInt(101);
        if (df > 0 && df < RoLimit) {
            Attack = "ro";}
        else if (df > RoLimit && df < ShamBoLimit) {
                Attack = "sham";
            } else if (df > ShamBoLimit) {
                Attack = "bo";
            }
            return (Attack);

    }
}

public class Assignment7A {
    public static int add (int u1,int u2){
        int result = u1+u2;
        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoshamboPlayer one = new RoshamboPlayer("R. Dorothy",30,60);
        RoshamboPlayer two = new RoshamboPlayer("Johnny 5",40,85);
        boolean quit = false;
        boolean quit2 = false;
        int user;
        int user2;
        String u1;
        System.out.println("[Ro-Sham-Bo Player]");

        do {System.out.println("Who do you want to face?\n" +
                "1) R. Dorothy\n" +
                "2) Johnny 5");
            do {System.out.print("Opponent: ");
                user = sc.nextInt();
                if(user==1){
                    System.out.println(" ");
                    System.out.println("Your opponent is R. Dorothy!");
                    quit2 = true;
                    quit = true;
                }
                else if (user==2){
                    System.out.println(" ");
                    System.out.println("Your opponent is Johnny 5!");
                    quit2 = true;
                    quit = true;}
                else {System.out.println(" Invalid, try again");
                    quit2 =false;
                }
            } while (quit2==false);
        } while (quit==false);

        quit=false;

        do {
            quit2 = false;
            System.out.println("1) Play a round?");
            System.out.println("2) Quit?");

            do {System.out.print("Choice: ");
                user2 = sc.nextInt();
                if (user2 >2 || user2<1){
                    System.out.println("Invalid, try again");}
                else if (user2==2){
                    System.out.println(" ");
                    System.out.println("Game Over");
                    quit2 = true;
                    quit = true;

                }
                else {quit2=true;}

            }while (quit2==false);


            if (quit==false) {
                switch (user) {
                    case 1:
                        sc.nextLine();
                        System.out.println(" ");
                        do {
                            quit2 = false;
                            //sc.nextLine();
                            System.out.print("Enter an attack: ");
                            u1 = sc.nextLine();


                            if (u1.equalsIgnoreCase("sham") || u1.equalsIgnoreCase("ro") || u1.equalsIgnoreCase("bo"))
                            {
                                quit2 = true;
                            } else {
                                System.out.println("Invalid, try again");
                                //quit2 = true;
                            }

                        } while (quit2 == false);

                        do {
                            quit2 = false;
                            String X = one.getAttack();
                            boolean x = one.playRound(u1.toLowerCase());
                            if (x == true) {
                                System.out.println("R. Dorothy chose " + X+"! You win!");
                            }
                            else if (x==false){
                                System.out.println("R. Dorothy chose " + X+"! You lose...");
                            }

                            quit2 = true;


                        } while (quit2 == false);

                        System.out.println(" ");
                    break;
                    case 2:
                        sc.nextLine();
                        System.out.println(" ");
                        do {
                            quit2 = false;
                            //sc.nextLine();
                            System.out.print("Enter an attack: ");
                            u1 = sc.nextLine();

                            if (u1.equalsIgnoreCase("sham") || u1.equalsIgnoreCase("ro") || u1.equalsIgnoreCase("bo"))
                            {
                                quit2 = true;
                            } else {
                                System.out.println("Invalid, try again");
                                //quit2 = true;
                            }

                        } while (quit2 == false);

                        do {
                            quit2 = false;
                            String Y = two.getAttack();
                            boolean y = two.playRound(u1.toLowerCase());
                            if (y == true) {
                                System.out.println("Johnny 5 chose " + Y+"! You win!");
                            }
                            else if (y==false){
                                System.out.println("Johnny 5 chose " + Y+"! You lose...");
                            }
                            quit2 = true;

                        } while (quit2 == false);

                        System.out.println(" ");

                }
            }

        }while (quit==false);





    }
}
