import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        boolean quit = false;
        int u1;
        Scanner sc = new Scanner(System.in);
        BlueRayCollection B1 = new BlueRayCollection();
        do {
            System.out.println("0. Quit\n" +
                    "1. Add BlueRay to collection\n" +
                    "2. See collection");
            int s1 = sc.nextInt();
            sc.nextLine();

            switch (s1){

                case 0:
                    quit=true;
                break;
                case 1:
                    System.out.println("What is the title?");
                    String u2 = sc.nextLine();
                    System.out.println("What is the director?");
                    String u3 = sc.nextLine();
                    System.out.println("What is the year of the release?");
                    int u4 = sc.nextInt();
                    System.out.println("What is the cost?");
                    double u5 = sc.nextDouble();
                    B1.add(u2,u3,u4,u5);
                    System.out.println(" ");
                break;
                case 2:
                    B1.show_all();
                    System.out.println(" ");
                break;

            }

        }while (quit==false);
    }
}
