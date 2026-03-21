import java.util.Scanner;
public class Lab9B {
    public static void main(String[] args) {
        int [] array = new int[11];
        System.out.println("Please enter 11 numbers: ");
        Scanner sc = new Scanner(System.in);
        int U1;
        int counter = 1;

        for(int i  = 0 ; i<11; i++)
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

        for (int i = 0; i<11;i++){
            for (int j = 0;j<10-i;j++){

                if (array[j] > array[j+1]){
                int temp = array [j];
                array[j]= array[j+1];
                array[j+1]= temp;
            }
        }
        }
        System.out.print("The sorted set is: ");
        for (int i = 0; i<11;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");

        int low = 0, mid = 0;
        int high = array.length-1;
        boolean isFound  = false;

        while (high>=low){
            mid = (low+high)/2;
            System.out.println("\nLow is "+low);
            System.out.println("\nHigh is "+high);
            System.out.println("\nMid is "+mid);
            System.out.println("\nSearching");
            if (target<array[mid]){
                high = mid-1;
            }

            else if (target==array[mid]) {
                isFound = true;
                break;
            }
            else {
                low = mid+1;
            }
        }

        if (isFound==true){
            System.out.print("\n" +
                    "The target is in the set.");
        }
        else {
            System.out.print("The target is not in the set.");
        }




}
}
