
/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Assignment#: 4B
*/
import java.util.Scanner;
public class Assignment4B {
    public static void main(String[] args) {
        boolean quit = false;
        Scanner sc = new Scanner(System.in);
        int u1 =0;
        int border =0;
        int colorS =0;
        int colorB =0;

        while(quit==false) {

            //int u1;
            System.out.print("Enter the size of the square: ");
            u1 = sc.nextInt();
            if (u1 < 0) {
                System.out.println("Invalid input!");
            } else {
                quit = true;
            }
        }

        quit = false;
        while(quit==false){
            System.out.print("Enter the size of the border: ");
            border = sc.nextInt();

            if(border<0){
                System.out.println("Invalid input!");
            }
            else {
                quit = true;
            }

        }
        quit = false;
        while(quit==false){
            //int colorS;
            System.out.print("Enter the color of the square: ");
            colorS = sc.nextInt();
            if (colorS < 0 || colorS > 1) {
                System.out.println("Invalid input!");
            }
            else{
                quit = true ;
            }


        }
        quit=false;
        while(quit==false){
            //int colorB;
            System.out.print("Enter the color of the border: ");
            colorB = sc.nextInt();
            if (colorB < 0 || colorB > 1) {
                System.out.println("Invalid input!");
            }
        else{
            quit=true;
            }
        }
        System.out.println("PBM File Contents:\n" + "P1");
        int sizeS= (2*border)+u1;
        System.out.println(sizeS + " "+ sizeS);

        for(int r =0; r<sizeS;r++ ){
            for(int c =0; c<sizeS; c++){
                if( (r>=border) && (r< sizeS-border) && (c>= border)&& (c<sizeS-border) ){
                    System.out.print(colorS + " ");

                }
                else{
                    System.out.print(colorB+" ");
                }

            }
            System.out.println();
        }






        }
}

