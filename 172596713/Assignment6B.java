import java.util.Random;
public class Assignment6B {
    public static boolean check_if_sorted (int[] u1){
        boolean isValid = false;
        for (int i = 0; i<15; i++){
            if (u1[i]<u1[i+1]) {
                isValid = true;
            }
            else {
                isValid = false;
                break;
            }


        }
        return isValid;

    }
    public static int[] shuffleArray(int[] u1){
        Random sc = new Random();
        for (int i = 0; i <u1.length;i++){
            int u2 = sc.nextInt(u1.length);
            int temp = u1[u2];
            u1[u2]= u1[i];
            u1[i] = temp;
        }
        return u1;

    }
    public static void PrintArray(int [] u1){
        for (int i :u1) {
            System.out.print(i+", ");

        }

    }

    public static void main(String[] args) {
        System.out.println("Random");
        int[] array = new int[17];
        Random RO = new Random();
       // int sc = RO.nextInt(359);
        for (int i = 0; i< array.length; i++){
            int sc = RO.nextInt(358)+1;
            array[i] = sc;
        }
        int counter = 0;
        boolean quit = false;
       while (quit==false){
           counter ++;
           System.out.println("Printing array...");
           PrintArray(array);
           if (check_if_sorted(array)==false){
               System.out.println("\nNot sorted yet! ");

           }

           else {
               System.out.println("Hooray, it’s sorted! And it only took "+counter+" attempts!");
               quit =true;
               break;


           }
           System.out.println("Shuffling array...");
           shuffleArray(array);


       }


    }
}
