import java.util.Scanner;
public class Lab9A {
    public static void main(String[] args) {
        int [] array = new int[10];
        System.out.println("Please enter 10 numbers: ");
        Scanner sc = new Scanner(System.in);
        int U1;
        int counter = 1;

        for(int i  = 0 ; i <10; i++)
        {
           // int counter = 1;
            System.out.print("Integer "+counter+": ");
            U1=sc.nextInt();
            array [i]= U1;
            counter++;
        }

        int target;
        System.out.print("What is the target number: ");
        target = sc.nextInt();

        boolean isFound = false;
        for(int i=0;i< array.length;i++) {

            if(array[i]==target){
                isFound = true;
            break;
            }
            }
        if(isFound==true){
            System.out.print("The target is in the set.");
        }
        else{
            System.out.print("The target is not in the set.");
        }



    }

}
