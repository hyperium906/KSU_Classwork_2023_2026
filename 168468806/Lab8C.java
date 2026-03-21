import java.util.Scanner;

/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Lab#: 8C
*/
public class Lab8C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the number of rows: ");
        int r;
        r = sc.nextInt();
        System.out.print("Please enter the number of  columns: ");
        int c;
        c = sc.nextInt();
        System.out.print("I have "+r+ " rows and "+ c+" columns. I need to fill-up "+(r*c)+" spaces.");
        System.out.print(" ");
        System.out.println("The "+r+ "x"+ c+" array:");
        int [][]array = new int[r][c];
        int l =1;
        for(int i = 0;i<r;i++){
            for (int j = 0; j<c;j++){

                array[i][j] = l++;
                System.out.print(array[i][j]+"|");
            }
            System.out.println(" ");

        }
        System.out.println(" ");
        System.out.println("The " +r+"x"+c +"2-D array flattened into a "+(r*c)+" cell 1-D array: ");
        //System.out.println(" ");
        int counter=0;
        int[]array1 = new int[r*c];
        for (int i =0 ; i<r;i++){
            for (int j = 0; j<c; j++){
               // counter++;
                array1[counter] = array[i][j];
                System.out.print(array1[counter]+"|");
                counter++;
            }

        }


    }
}
