import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class Assignment5A {
    public static void main(String[] args) {
        String[][] array = {
                {"#0 ", "Mark Sloan, ", "Age 67, ", "Chief of Internal Medicine, ", "Medical License: TRUE"},
                {"#1 ", "Amanda Bentley, ", "Age 33, ", "Pathologist, ", "Medical License: TRUE"},
                {"#2 ", "Norman Briggs, ", "Age 47, ", "Administrator, ", "Medical License: FALSE"},
                {"#3 ", "Steven Sloan, ", "Age 35, ", "Hospital Security, ", "Medical License: FALSE"},
                {"#4 ", "Jesse Travis, ", "Age 24, ", "Surgeon Intern, ", "Medical License: TRUE"}
        };

        int u1;
        Scanner sc = new Scanner(System.in);
        boolean quit = false;

        do {
            System.out.println(" ");
            System.out.println("[Community General Hospital Directory]\n" +
                    "1) List all employees\n" +
                    "2) Search employee records by ID\n" +
                    "3) Search employee records by Last Name\n" +
                    "4) Quit");

                System.out.print("Choice: ");

                u1 = sc.nextInt();

                switch (u1) {
                    case 1:
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 5; j++) {
                                System.out.print(array[i][j]);
                                //System.out.println(" ");
                            }
                            System.out.println(" ");
                        }
                        break;
                    case 2: {
                        boolean quit2 = false;
                        int id;
                        do {
                            //int id;
                            System.out.print("ID: ");
                            id = sc.nextInt();
                            if (id > 4 || id < 0) {
                                System.out.println("Invalid ID!");
                            } else {
                                quit2 = true;
                            }

                        } while (quit2 == false);
                        switch (id) {
                            case 0:
                                for (int i = 0; i < 5; i++) {
                                    System.out.print(array[0][i]);
                                    //System.out.println(" ");
                                }
                                System.out.println(" ");
                                break;
                            case 1:
                                for (int i = 0; i < 5; i++) {
                                    System.out.print(array[1][i]);
                                    //System.out.println(" ");
                                }
                                System.out.println(" ");
                                break;
                            case 2:
                                for (int i = 0; i < 5; i++) {
                                    System.out.print(array[2][i]);
                                    //System.out.println(" ");
                                }
                                System.out.println(" ");
                                break;
                            case 3:
                                for (int i = 0; i < 5; i++) {
                                    System.out.print(array[3][i]);
                                    //System.out.println(" ");

                                }
                                System.out.println(" ");
                                break;
                            case 4:
                                for (int i = 0; i < 5; i++) {
                                    System.out.print(array[4][i]);
                                    //System.out.println(" ");
                                }
                                System.out.println(" ");


                        }
                    }
                    break;
                    case 3:
                        sc.nextLine();
                        String lastName;
                        System.out.print("Last Name: ");

                        lastName = sc.nextLine();
                        switch (lastName.toLowerCase()) {
                            //case "Sloan":
                            case "sloan":
                                for (int i = 0; i < 5; i++) {
                                    System.out.print(array[0][i]);

                                }
                                System.out.println(" ");
                                for (int i = 0; i < 5; i++) {
                                    System.out.print(array[3][i]);
                                    //System.out.println(" ");
                                }
                                System.out.println(" ");
                                break;
                            //case "Bentley":
                            case "bentley":
                                for (int i = 0; i < 5; i++) {
                                    System.out.print(array[1][i]);
                                    //System.out.println(" ");
                                }
                                System.out.println(" ");
                            //case "Briggs":
                            case "briggs":
                                for (int i = 0; i < 5; i++) {
                                    System.out.print(array[2][i]);
                                    //System.out.println(" ");
                                }
                                System.out.println(" ");
                                break;
                            //case "Travis":
                            case "travis":
                                for (int i = 0; i < 5; i++) {
                                    System.out.print(array[4][i]);
                                    //System.out.println(" ");
                                }
                                System.out.println(" ");
                                break;
                            default:
                                System.out.println("No Records Found!");

                        }
                        break;
                    case 4:
                        System.out.println("[Closing Directory...]");
                        quit = true;
                        break;
                    default:
                        System.out.println("No option " + u1 + "!");


                }


        }while (quit==false);
    }
}
