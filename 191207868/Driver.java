import java.util.Scanner;
public class Driver {
    public static void printMenu(){
        System.out.println("1. Add bus\n" +
                "2. Add Person to bus\n" +
                "3. Remove bus\n" +
                "4. Remove person\n" +
                "5. List passengers\n" +
                "6. List busses\n" +
                "7. Requeue bus\n" +
                "8. Transfer person\n" +
                "9. Dispatch bus\n" +
                "0. Exit");
    }
    public static void main(String[] args) {
        Dispatcher one = new Dispatcher();
        Scanner sc = new Scanner(System.in);
        boolean quit = false;
        int u1,u3;
        String u2;
        do{
            printMenu();
            u1 = sc.nextInt();
            sc.nextLine();
            switch (u1) {
                case 1:
                    // Add Bus
                    System.out.println(" ");
                    Bus daBus = new Bus();
                    one.addBus(daBus);
                    System.out.println("Bus "+daBus.getID()+ " added to position "+one.busQueue.indexOf(daBus));
                    System.out.println(" ");
                break;
                case 2:
                    // Add person
                    System.out.println(" ");
                    System.out.print("Enter bus id: ");
                    u1 = sc.nextInt();
                    sc.nextLine();
                    Bus b = one.findBus(u1);
                    if(b==null){
                        System.out.println("No bus with id "+u1);
                    }
                    else {
                        System.out.print("Enter person's name: ");
                        u2 = sc.nextLine();
                        Person human = new Person(u2);
                        b.addPerson(human);
                        System.out.println(u2+" has been added to bus "+ b.getID());
                    }
                    System.out.println(" ");
                break;
                case 3:
                    // Remove Bus
                    System.out.println(" ");
                    System.out.print("Enter bus id: ");
                    u1 = sc.nextInt();
                    Bus t = one.findBus(u1);
                    if(t==null){
                        System.out.println("No bus with id "+u1);
                    }
                    else {
                        one.removeBus(u1);
                        System.out.println("Bus "+ u1+" removed");
                    }
                    System.out.println(" ");

                break;
                case 4:
                    //Remove person
                    System.out.println(" ");
                    System.out.print("Enter bus id: ");
                    u1 = sc.nextInt();
                    sc.nextLine();
                    Bus b2 = one.findBus(u1);
                    if(b2==null){
                        System.out.println("No bus with id "+u1);
                    }
                    else {
                        System.out.print("Enter person's name: ");
                        u2 = sc.nextLine();

                        if (b2.findPerson(u2)==null){
                            System.out.println("No such person found in bus "+ u1);

                        }
                        else{
                            b2.removePerson(b2.findPerson(u2));
                            System.out.println(u2+" has been removed from bus "+ u1);
                        }
                    }

                    System.out.println(" ");
                break;
                case 5:
                    // List Passengers
                    System.out.println(" ");
                    System.out.print("Enter bus id: ");
                    u1 = sc.nextInt();
                    Bus b3 = one.findBus(u1);
                    if(b3==null){
                        System.out.println("No bus with id "+u1);
                    }
                    else {
                        // How to get passengers of a certain BUS
                        System.out.println("Bus "+ u1);
                        System.out.println(b3.getPassengers());
                    }
                    System.out.println(" ");
                break;
                case 6:
                    // List Buses
                    System.out.println(" ");
                    System.out.println("BUS QUEUE");
                    System.out.println(one);
                    System.out.println(" ");

                break;
                case 7:
                    // Requeue BUS
                    System.out.println(" ");
                    System.out.print("Enter bus id: ");
                    u1 = sc.nextInt();
                    Bus b4 = one.findBus(u1);
                    if(b4==null){
                        System.out.println("No bus with id "+u1);
                    }
                    else {
                        // MAKES NO SENSE
                        System.out.print("Enter new bus position: ");
                        u1 = sc.nextInt();
                        int position = one.addBus(b4,u1);
                        System.out.print("Bus "+b4.getID()+" added to positon "+ position);
                    }

                    System.out.println(" ");

                break;
                case 8:
                    System.out.println(" ");
                    System.out.print("Enter person's name: ");
                    u2 = sc.nextLine();
                    System.out.print("Enter of bus 1: ");
                    u1 = sc.nextInt();
                    System.out.print("Enter of bus 2: ");
                    u3 = sc.nextInt();
                    Bus b5 = one.findBus(u1);
                    Bus b6 = one.findBus(u3);
                    Person human2 = b5.findPerson(u2);
                    if (human2==null){
                        System.out.println("No person named "+u2);
                    }
                    if(b5==null){
                        System.out.println("No bus with id "+u1);
                        break;
                    }
                    if(b6==null){
                        System.out.println("No bus with id "+u3);
                        break;
                    }
                    // TWO DIFFERENT BUS OBJECTS:(
                    if(b5.transferBus(b5,b6,human2)==true){
                        System.out.println("Person transferred successfully");
                    }

                    System.out.println(" ");

                break;
                case 9:
                    System.out.println(" ");
                    Bus b8 = one.busQueue.get(0);
                    if (one.dispatchBus()==null){
                        System.out.println("Bus queue is empty.");
                    }
                    else {
                        System.out.println("Bus "+b8.getID()+ " has been dispatched");
                    }
                    System.out.println(" ");

                break;
                case 0:
                    System.out.println(" ");
                    System.out.println("Shutting Down");
                    quit = true;
                break;

            }
        }while (quit== false);
    }
}
