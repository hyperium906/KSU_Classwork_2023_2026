import java.util.Scanner;
public class Lab10B {
    public static boolean isValid(double num1, double num2){
        boolean vaild = false;
        if (num1+num2>=30){
            vaild = true;
        }
        else {
            vaild = false;
        }
        return vaild;
    }
    public static double area(double num1, double num2){
        double area = num1*num2;
        return area;

    }
    public static double per (double num1, double num2){
        double perimeter = num1+num2+num1+num2;
        return perimeter;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double w,h = 0;
        String s1;
        boolean quit = false;

        do {
            System.out.print("Enter width: ");
            w = sc.nextInt();
            System.out.print("Enter height: ");
            h = sc.nextInt();

            if (isValid(w,h)==false){
                System.out.println("This is an invalid rectangle");
            }
            else {
                System.out.println("This is a valid rectangle");
                System.out.println("The area is: "+area(w,h));
                System.out.println("The perimeter is: "+per(w,h));


            }
            sc.nextLine();
            System.out.println(" ");
            System.out.print("Do you want to enter another width and height (Y/N)? : ");
            s1 = sc.nextLine();
            System.out.println(" ");

            switch (s1.toLowerCase()){
                case "y":
                    quit = false;
                break;
                case "n":
                    quit = true;
            }






        }while (quit == false);

    }
}
