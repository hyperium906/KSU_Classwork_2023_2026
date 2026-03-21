import java.util.Scanner;
/*
Class: CSE 1321L
Section: J06
Term: Spring 2023
Instructor: Surya Praveen Adivi. and Malcolm, Douglas
Name: Joshua Dupati
Lab#: 8A
*/
public class Lab8A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] array = new int[5];
        System.out.println("Please enter 5 integers for the first array: ");
        for(int i = 1; i<=5; i++){
            System.out.print("Integer "+ i+": ");
            int u1;
            u1 = sc.nextInt();
            array[i-1] = u1;
        }
        System.out.println(" ");
        int [] array2 = new int[5];
        System.out.println("Please enter 5 integers for the second array:");
        for(int i = 1; i<=5; i++){
            System.out.print("Integer "+ i+": ");
            int u1;
            u1 = sc.nextInt();
            array2[i-1] = u1;
        }

        System.out.print("The resulting sums are ");
        for(int i = 0; i<=4;i++){
            System.out.print(array[i]+array2[i]+"|");
        }



    }
}
