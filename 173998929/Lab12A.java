import java.util.Scanner;
public class Lab12A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You are about to create a chair. ");
        System.out.print("How many legs does your chair have: ");
        int u1;
        u1 = sc.nextInt();
        System.out.print("Is your chair rolling (true/false): ");
        boolean u2;
        u2 = sc.nextBoolean();
        System.out.print("What is your chair made of: ");
        sc.nextLine();
        String u3;
        u3 = sc.nextLine();
        chair one = new chair(u1,u2,u3);
        System.out.println(" ");
        String u4;
        if(one.rolling== true){
            u4 ="rolling";
        }
        else {
            u4 ="not rolling";
        }
        //System.out.println(" ");
        System.out.println("Your chair has "+one.legs+" legs, is " +u4+", and is made of "+ one.material+".");
        System.out.println(" ");
        System.out.println("This program is going to change that.");
        System.out.println(" ");
        one.legs = 4;
        one.rolling = false;
        if(one.rolling== true){
            u4 ="rolling";
        }
        else {
            u4 ="not rolling";
        }
        one.material = "wood";
       // System.out.println(" ");
        System.out.println("Your chair has "+one.legs+" legs, is " +u4+", and is made of "+ one.material+".");






    }
}
 class chair {
    int legs;
    boolean rolling;
    String material;
    chair(int legs, boolean rolling, String material){
        this.legs = legs;
        this.rolling = rolling;
        this.material= material;
    }

}
