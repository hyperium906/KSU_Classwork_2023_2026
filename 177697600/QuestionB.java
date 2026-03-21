import java.util.Scanner;
public class QuestionB {
    public static void sortByString(String [] array, int n){
        for(int i =0; i<n-1;i++){
            for (int j =0; j<n-i-1;j++){
                if (array[j].length()>array[j+1].length()){
                    String temp = array [j];
                    array[j] = array[j+1];
                    array [j+1]= temp;
                }
            }
        }

    }
    public static void  print_array(String [] array){
        for (String t: array) {
            System.out.print(t+", ");

        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =5;
        String[] array = new String[n];
        int counter =1;
        System.out.println("[String Array Sorting]");
        for (int i =0; i<5;i++){

            System.out.print("Please enter Name "+counter+": ");
            counter++;
            array [i] = sc.nextLine();
        }
        System.out.println(" ");
        System.out.println("Now Sorting...");
        System.out.println(" ");
        sortByString(array,n);
        System.out.println("Sorted!");
        print_array(array);

    }
}
