import java.util.Random;
public class Assignment6A {
    public static void main(String[] args) {
        Random sc = new Random();

        int[]array = new int[1000019];
        int rando = sc.nextInt(array.length-1);
        int j = 1000019;
        for (int i = 0; i< array.length;i++){
            j--;
            array[i]=j;

        }
        System.out.println("[Linear Vs. Binary Search]");
        System.out.println("The target is "+rando);

        int counter = 0;

        for (int i = 0; i < array.length; i++)
        { counter++;
            if (array[i] == rando)
            {
                break;
            }
        }
        System.out.println("Linear Search: "+ counter+" loop(s)");

        int counter1 =0;

        int low = 0, mid = 0;
        int high = array.length-1;
        boolean found = false;
        while (high >= low)
        {
            counter1++;
            mid = (low + high) / 2;
            if (rando > array[mid]) {

                high = mid - 1;

            }

            else if (rando == array[mid]) {

                found = true; break;

            }
            else low = mid + 1;
        }
        System.out.println("Binary Search: "+ counter1+ " guess(es)");

        if (counter1<counter){
            System.out.println("Binary Search is faster this time!");
        }
        else {
            System.out.println("Linear Search is faster this time!");
        }


    }
}
