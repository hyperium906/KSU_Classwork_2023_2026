import java.util.Scanner;
public class Lab11A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int u1;
        String u2;
        boolean quit = false;

        do{
            System.out.print("Menu\n" +
                    "0) Hello World\n" +
                    "1) Goodbye Moon\n" +
                    "2) Walking on Sunshine");
            System.out.println(" ");
            System.out.print("What would you like to do: ");
            u1 = sc.nextInt();
            switch (u1){
                case 0:
                    sc.nextLine();
                    System.out.println(" ");
                    System.out.println("Hello!");
                    System.out.println(" ");
                    System.out.print("Type YES to rerun. ");
                    u2 = sc.nextLine();

                    if(u2.equalsIgnoreCase("yes")){
                        quit = false;
                    }
                    else{
                        quit = true;
                    }
                    System.out.println(" ");

                break;
                case 1:
                    sc.nextLine();
                    System.out.println(" ");
                    System.out.println("Ok, bye");
                    System.out.println(" ");
                    System.out.print("Type YES to rerun. ");
                    u2 = sc.nextLine();

                    if(u2.equalsIgnoreCase("yes")){
                        quit = false;
                    }
                    else{
                        quit = true;
                    }
                    System.out.println(" ");

                break;

                case 2:
                    sc.nextLine();
                    System.out.println(" ");
                    System.out.println("WHOA!");
                    System.out.println(" ");
                    System.out.print("Type YES to rerun. ");
                    u2 = sc.nextLine();

                    if(u2.equalsIgnoreCase("yes")){
                        quit = false;
                    }
                    else{
                        quit = true;
                    }
                    System.out.println(" ");

                break;

            }




        } while (quit==false);
    }
}
