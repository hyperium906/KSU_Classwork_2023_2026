import java.util.Random;
public class Question1Driver {
public static void printArray(int[]array){
    int counter =1;
    int counter2= 1;
    for(int i = 3; i< array.length;i+=3){
        switch (counter){
            case 1:
                System.out.println(array[i-2]+" + "+array[i-1]+" = "+array[i]);
                counter++;
            break;
            case 2:
                System.out.println(array[i-2]+" - "+array[i-1]+" = "+array[i]);
                counter++;
                break;
            case 3:
                System.out.println(array[i-2]+" * "+array[i-1]+" = "+array[i]);
                counter++;
                break;
            case 4:
                System.out.println(array[i-2]+" / "+array[i-1]+" = "+array[i]);
                counter++;
                break;
            case 5:
                System.out.println(array[i-2]+" % "+array[i-1]+" = "+array[i]);
                counter=1;
                break;
        }
    }
}


    public static int [] arrayMath (int i ){
        Random r = new Random();
        int counter =1;
        int counter2= 1;
        int [] array;
        if (i%15==0){
            r.nextInt(101);
            array = new int [i];
            for (int j = 0; j<array.length;j++){
                counter++;
                if (counter%3==0&&j>=2) {
                    //counter++;
                    if (counter2 == 1&&j>=2) {
                        array[j] = array[j - 2] + array[j - 1];
                        counter2++;
                    } else if (counter2 == 2&&j>=2) {
                        array[j] = array[j - 2] - array[j - 1];
                        counter2++;
                    } else if (counter2 == 3&&j>=2) {
                        array[j] = array[j - 2] * array[j - 1];
                        counter2++;
                    } else if (counter2 == 4&&j>=2) {
                        array[j] = array[j - 2] / array[j - 1];
                        counter2++;
                    } else if (counter2 == 5&&j>=2) {
                        array[j] = array[j - 2] % array[j - 1];
                        counter2 = 1;
                    }
                   // array[j] = r.nextInt(101);
                }
                else {
                    array[j] = r.nextInt(101);
                }
            }
            return array;
        }
        else {
            return array = new int[0];
        }
    }
    public static void main(String[] args) {
        int [] array = arrayMath(15);
        printArray(array);
    }
}
