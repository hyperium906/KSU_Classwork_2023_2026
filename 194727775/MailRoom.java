import java.util.ArrayList;
import java.util.Scanner;


public class MailRoom {
    public static boolean handleLetter(Letter letter, ArrayList<Mail> deliver) {
        if (letter.getDeliveryAddress() != "" && letter.getReturnAddress() != "") {
            if (letter.getLength() >= 5 && letter.getLength() <= 11.5) {
                if (letter.getWidth() >= 3.5 && letter.getWidth() <= 6.125) {
                    if (letter.getThickness() >= 0.007 && letter.getThickness() <= .25) {
                        if ((letter.getLength() - letter.getWidth())>=1.5){
                            deliver.add(letter);
                            return true;

                        }
                    }

                }
            }
        }

         return false;
    }
    public static boolean handleFlat(Flat flat,ArrayList<Mail>deliver){
        if(flat.getDeliveryAddress()!=""&& flat.getReturnAddress()!=""){
            if (flat.getLength()>=11.5 && flat.getLength()<=15){
                if (flat.getWidth()>=6.125&&flat.getWidth()<=12){
                    if (flat.getThickness()>=.25&&flat.getThickness()<=.75){
                        if (flat.getContents().equalsIgnoreCase("DOCUMENTS")){
                            deliver.add(flat);
                            return true;
                        }
                    }
                }
            }
        }
        return false;

    }
    // Look at the BOX .. should it be mail
    public static boolean handleRegularBox(RegularBox regularBox, ArrayList<Mail> deliver){
        if (regularBox.getDeliveryAddress()!= "" && regularBox.getReturnAddress()!=""){
            if (regularBox.getLength()>=6&&regularBox.getLength()<=27){
                if (regularBox.getWidth()>=.25&&regularBox.getWidth()<=17){
                    if (regularBox.getHeight()>=3&&regularBox.getHeight()<=17){
                        if (regularBox.getWieght()>=0&&regularBox.getWieght()<=70){
                            if (regularBox.getCount()>=0&&regularBox.getCount()<=50){
                                deliver.add(regularBox);
                                return true;
                            }
                        }
                    }
                }
            }

        }
        return false;
    }
    public static boolean handleLiveBox(LiveBox liveBox, ArrayList<Mail> mail){
        if(liveBox.getDeliveryAddress()!=""&& liveBox.getReturnAddress()!=""){
            if (liveBox.getLength()>=6 && liveBox.getLength()<=27){
                if (liveBox.getWidth()>=.25&&liveBox.getWidth()<=17){
                    if (liveBox.getHeight()>=3&&liveBox.getHeight()<=17){
                        if (liveBox.getAnimal().equalsIgnoreCase("honeybee")||liveBox.getAnimal().equalsIgnoreCase("honeybees")
                                ||liveBox.getAnimal().equalsIgnoreCase("chickens")||liveBox.getAnimal().equalsIgnoreCase("chicken")){
                            if(liveBox.getAnimal().equalsIgnoreCase("chicken")||liveBox.getAnimal().equalsIgnoreCase("chickens")){
                                if (liveBox.getCount()>=0&&liveBox.getCount()<=10){
                                    if (liveBox.getAge()>=0&&liveBox.getAge()<=1){
                                        mail.add(liveBox);
                                        return true;

                                    }
                                }
                            }
                            else if (liveBox.getAnimal().equals("honeybee")||liveBox.getAnimal().equals("honeybees")){
                                if (liveBox.getCount()>=0&&liveBox.getCount()<=20){
                                    mail.add(liveBox);
                                    return true;
                                }

                            }
                        }
                    }
                }
            }
        }
        return false;
    }
    public static void printMenu(){
        System.out.println(" ");
        System.out.print(
                "1- Send letter\n" +
                "2- Send flat\n" +
                "3- Send regular box\n" +
                "4- Send live box\n" +
                "5- Dispatch items\n" +
                "6- Quit\n" +
                "Enter option: ");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Mail> deliver = new ArrayList<Mail>();
        int u1,u11;
        String u21,u22,u23,u24;
        double u33,u34,u35,u36;
        System.out.println("Welcome to KSUPS ");

        boolean quit = false;

        do{
            printMenu();
            u1 = sc.nextInt();
            sc.nextLine();

            switch (u1){
                case 1:
                    System.out.print("Enter the delivery address: ");
                    u22 = sc.nextLine();
                    System.out.print("Enter the return address: ");
                    u21 = sc.nextLine();
                    System.out.print("Enter the width of your mail: ");
                    u33 = sc.nextDouble();
                    System.out.print("Enter the length of your mail: ");
                    u34 = sc.nextDouble();
                    System.out.print("Enter the thickness of your mail: ");
                    u35 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter the contents of your letter: ");
                    u23 = sc.nextLine();

                    Letter letter = new Letter(u22,u21,u33,u34,u35,u23);
                    if (handleLetter(letter,deliver)==true){
                        System.out.println(" ");
                        System.out.println("Letter accepted for delivery. ");
                        System.out.println(" ");
                    }
                    else {
                        System.out.println(" ");
                        System.out.println("Letter was not accepted for delivery. ");
                        System.out.println(" ");
                    }

                break;
                case 2:
                    System.out.print("Enter the delivery address: ");
                    u22 = sc.nextLine();
                    System.out.print("Enter the return address: ");
                    u21 = sc.nextLine();
                    System.out.print("Enter the width of your mail: ");
                    u33 = sc.nextDouble();
                    System.out.print("Enter the length of your mail: ");
                    u34 = sc.nextDouble();
                    System.out.print("Enter the thickness of your mail: ");
                    u35 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter the contents of your flat: ");
                    u23 = sc.nextLine();
                    Flat flat = new Flat (u22,u21,u33,u34,u35,u23);

                   // System.out.println(" ");

                    if(handleFlat(flat,deliver)== true){
                        System.out.println(" ");
                        System.out.println("Flat accepted for delivery. ");
                        System.out.println(" ");
                    }
                    else {
                        System.out.println("Flat was not accepted for delivery.");
                    }
                break;
                case 3:
                    System.out.print("Enter the delivery address: ");
                    u22 = sc.nextLine();
                    System.out.print("Enter the return address: ");
                    u21 = sc.nextLine();
                    System.out.print("Enter the width of your mail: ");
                    u33 = sc.nextDouble();
                    System.out.print("Enter the length of your mail: ");
                    u34 = sc.nextDouble();
                    System.out.print("Enter the height of your mail: ");
                    u35 = sc.nextDouble();
                    System.out.print("How many items your box has: ");
                    u1 = sc.nextInt();
                    System.out.print("Enter the weight of your box: ");
                    u36 = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter the contents of the box: ");
                    u24 = sc.nextLine();
                    RegularBox regularBox = new RegularBox(u22,u21,u33,u34,u35,u1,u24,u36);
                   if (handleRegularBox(regularBox,deliver)==true){
                       System.out.println(" ");
                       System.out.println("Regular box accepted for delivery. ");
                       System.out.println(" ");

                   }
                   else {
                       System.out.println(" ");
                       System.out.println("Regular box was not accepted for delivery. ");
                       System.out.println(" ");
                   }
                break;
                case 4:
                    System.out.print("Enter the delivery address: ");
                    u22 = sc.nextLine();
                    System.out.print("Enter the return address: ");
                    u21 = sc.nextLine();
                    System.out.print("Enter the width of your mail: ");
                    u33 = sc.nextLong();
                    System.out.print("Enter the length of your mail: ");
                    u34 = sc.nextLong();
                    System.out.print("Enter the height of your mail: ");
                    u35 = sc.nextLong();
                    System.out.print("How many items your box has: ");
                    u1 = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter what animal is being shipped: ");
                    u24 = sc.nextLine();
                    System.out.print("Enter age of the oldest animal, in days: ");
                    u11 = sc.nextInt();
                    LiveBox liveBox = new LiveBox(u22,u21,u33,u34,u35,u1,u24,u11);
                    if (handleLiveBox(liveBox,deliver)==true){
                        System.out.println(" ");
                        System.out.println("Live box accepted for delivery.");
                        System.out.println(" ");
                    }
                    else {
                        System.out.println(" ");
                        System.out.println("Live box was not accepted for delivery.");
                        System.out.println(" ");
                    }
                break;
                case 5:
                    //System.out.println("DISPATCHING THE FOLLOWING ITEMS FOR DELIVERY:");
                    if (!deliver.isEmpty()){
                        System.out.println("DISPATCHING THE FOLLOWING ITEMS FOR DELIVERY:");
                        for (Mail t :deliver) {
                            System.out.println("========== ");
                            System.out.println(t);
                            //deliver.remove(t);
                        }
                        deliver.clear();
                        System.out.println(deliver);
                    }
                    else {
                        System.out.println(" ");
                        System.out.println("Delivery queue is empty. ");
                        System.out.println(" ");
                    }
                break;
                case 6:
                    quit = true;
                    System.out.println(" ");
                    System.out.println("Quitting...");
                    System.out.println(" ");
                break;


            }

        }while (quit==false);

    }
}
