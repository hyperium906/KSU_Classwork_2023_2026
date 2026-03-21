import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Question3Driver {
    public static void printSugar(int i, ArrayList<SugaryDrink> Drink){
        int total = 0;
        if (i%2==0){
            for (SugaryDrink t:Drink) {
                if (t instanceof CoolKola){
                    total += t.sugarContent();
                }
            }
            System.out.println(total);

        }
       else {
            for (SugaryDrink t:Drink) {
                if (t instanceof LivelyLemon){
                    total += t.sugarContent();
                }
            }
            System.out.println(total);
        }

    }

    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<SugaryDrink>freezer = new ArrayList<>();
        int counter = 0;
        do {
            if(r.nextInt(101)%2==0){
                CoolKola one = new CoolKola();
                freezer.add(one);
            }
            else {
                LivelyLemon two = new LivelyLemon();
                freezer.add(two);
            }
            ++counter;
        } while (counter<=100);


        int j = r.nextInt(101);

        if(j%2==0){
            System.out.print("Total sugar content of CoolCola in the freezer: ");
            printSugar(j,freezer);
        }
        else {
            System.out.print("Total sugar content of LivelyLemon in the freezer: ");
            printSugar(j,freezer);
        }


    }
}
