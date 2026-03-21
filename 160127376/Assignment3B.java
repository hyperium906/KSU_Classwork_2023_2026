/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Assignment: 3B
*/
import java.util.Scanner;
public class Assignment3B {
    public static void main(String[] args) {
        System.out.println("[Image Encoding Checker]");
        int width;
        System.out.print("What is the image width ");
        Scanner sc = new Scanner(System.in);
        width = sc.nextInt();
        int height;
        System.out.print("What is the image height ");
        height = sc.nextInt();
        int fileSize;
        System.out.print("What is the file size (in bytes)? ");
        fileSize = sc.nextInt();

        int dem = (width*height);
        int bite = (fileSize/dem);

        switch (bite){
            case 3:
                System.out.println("\nThe RGB image is encoded with 8 bits per channel.");
                break;
            case 6:
                System.out.println("\nThe RGB image is encoded with 16 bits per channel.");
                break;
            case 12:
                System.out.println("\nThe RGB image is encoded with 32 bits per channel.");
                break;
            default: System.out.println("The information is invalid – please re-enter it.");
        }



    }

}
