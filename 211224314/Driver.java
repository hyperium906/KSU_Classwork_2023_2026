import java.util.Scanner;
public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("[The GatlingTea Factory]");
        System.out.print("How many boxes of Jasmine Tea would you like to order? ");
        int u1 = sc.nextInt();
        System.out.print("How many boxes of Earl Grey Tea would you like to order? ");
        int u2 = sc.nextInt();
        System.out.print("How many boxes of Lemon Tea would you like to order? ");
        int u3 = sc.nextInt();
        System.out.println("The Drum™ has been created and shipped.");

        TheDrum one = new TheDrum(u1,u2,u3);
        System.out.print("How many employees will help unload? ");
        int u4 = sc.nextInt();
        Employee[] array = new Employee[u4];
        for (int i = 0; i<u4; i++){
            array[i] = new Employee(one);
            array[i].start();
        }
        int counter = 0;

        for (Employee e :array) {
            try {
                e.join();
                System.out.println(e);
                counter+=e.totalTea();
            } catch (InterruptedException ex) {
                throw new RuntimeException(ex);
            }
        }
        System.out.println("A total of "+counter+" boxes of tea were stocked.");

    }
}
